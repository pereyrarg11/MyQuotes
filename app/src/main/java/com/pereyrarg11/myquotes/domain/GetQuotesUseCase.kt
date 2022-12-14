package com.pereyrarg11.myquotes.domain

import com.pereyrarg11.myquotes.data.QuoteRepository
import com.pereyrarg11.myquotes.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository: QuoteRepository,
) {

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()
}