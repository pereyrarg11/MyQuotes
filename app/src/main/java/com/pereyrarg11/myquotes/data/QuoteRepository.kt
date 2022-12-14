package com.pereyrarg11.myquotes.data

import com.pereyrarg11.myquotes.data.model.QuoteModel
import com.pereyrarg11.myquotes.data.model.QuoteProvider
import com.pereyrarg11.myquotes.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider,
) {

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        quoteProvider.quoteList = response
        return response
    }
}