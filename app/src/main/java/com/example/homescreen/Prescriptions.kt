package com.example.homescreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homescreen.R

class Prescriptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prescriptions)

        val actionBar = supportActionBar

        actionBar!!.title = "Prescriptions"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}