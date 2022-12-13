package com.pereyrarg11.myquotes.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pereyrarg11.myquotes.model.QuoteModel
import com.pereyrarg11.myquotes.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val nextQuote = QuoteProvider.getRandom()
        quoteModel.postValue(nextQuote)
    }
}