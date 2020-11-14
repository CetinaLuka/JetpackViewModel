package com.i.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stevilo = MutableLiveData(1)
        stevilo.observe(this, Observer {stevilo ->
            steviloTextView.text = stevilo.toString()
        })
        povecajSteviloButton.setOnClickListener { stevilo.postValue(stevilo.value!!+ 1) }
        zmanjsajSteviloButton.setOnClickListener { stevilo.postValue(stevilo.value!!- 1) }
    }
}