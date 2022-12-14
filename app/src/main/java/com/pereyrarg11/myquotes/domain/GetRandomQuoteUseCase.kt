package com.pereyrarg11.myquotes.domain

import com.pereyrarg11.myquotes.data.model.QuoteModel
import com.pereyrarg11.myquotes.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val quoteProvider: QuoteProvider
) {

    operator fun invoke(): QuoteModel? {
        val quotes = quoteProvider.quoteList
        if (quotes.isNotEmpty()) {
            val randomPosition = (quotes.indices).random()
            return quotes[randomPosition]
        }

        return null
    }
}