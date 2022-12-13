package com.pereyrarg11.myquotes.domain

import com.pereyrarg11.myquotes.data.model.QuoteModel
import com.pereyrarg11.myquotes.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quoteList

        if (quotes.isNotEmpty()) {
            val randomPosition = (quotes.indices).random()
            return quotes[randomPosition]
        }

        return null
    }
}