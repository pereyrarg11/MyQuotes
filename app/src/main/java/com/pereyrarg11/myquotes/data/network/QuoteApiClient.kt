package com.pereyrarg11.myquotes.data.network

import com.pereyrarg11.myquotes.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}