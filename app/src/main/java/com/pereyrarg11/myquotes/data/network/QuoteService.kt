package com.pereyrarg11.myquotes.data.network

import com.pereyrarg11.myquotes.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuoteService @Inject constructor(
    private val apiClient: QuoteApiClient
) {

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = apiClient.getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}