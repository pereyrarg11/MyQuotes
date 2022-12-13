package com.pereyrarg11.myquotes.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.pereyrarg11.myquotes.databinding.ActivityMainBinding
import com.pereyrarg11.myquotes.ui.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            binding.quote.text = currentQuote.quote
            binding.author.text = currentQuote.author
        })

        binding.mainContainer.setOnClickListener {
            quoteViewModel.randomQuote()
        }

        quoteViewModel.randomQuote()
    }
}