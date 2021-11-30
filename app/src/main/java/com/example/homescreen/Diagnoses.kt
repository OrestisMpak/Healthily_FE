package com.example.homescreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homescreen.R

class Diagnoses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnoses)

        val actionBar = supportActionBar

        actionBar!!.title = "Diagnoses"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}