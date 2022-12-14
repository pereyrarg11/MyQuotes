package com.pereyrarg11.myquotes.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteProvider @Inject constructor() {
    var quoteList = emptyList<QuoteModel>()
}