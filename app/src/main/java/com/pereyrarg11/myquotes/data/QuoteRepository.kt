package com.pereyrarg11.myquotes.data

import com.pereyrarg11.myquotes.data.model.QuoteModel
import com.pereyrarg11.myquotes.data.model.QuoteProvider
import com.pereyrarg11.myquotes.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quoteList = response
        return response
    }
}