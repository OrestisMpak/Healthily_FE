package com.example.homescreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homescreen.databinding.ActivitySignupBinding

class signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.click.setOnClickListener{ click()}
        binding.btnsignup.setOnClickListener{ validate()}
    }

    private fun click() {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

    private fun validate() {
        val lastName = binding.LastName.text.toString()
        val firstName = binding.FirstName.text.toString()
        val email = binding.email.text.toString()
        val amka = binding.AMKA.text.toString()
        val password = binding.inputPassword.text.toString()
        val confirmPassword = binding.inputConfirmPassword.text.toString()
        val doctor = binding.doctor.text.toString()
        val address = binding.address.text.toString()
        val blood = binding.bloodGroup.text.toString()
        if (lastName.isEmpty() || firstName.isEmpty() || email.isEmpty() || amka.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || doctor.isEmpty() || address.isEmpty() || blood.isEmpty()) {
            Toast.makeText(this, "Fill all the fields", Toast.LENGTH_LONG).show()
        } else if (amka.length != 11) {
            Toast.makeText(this, "AMKA must be 11 digits", Toast.LENGTH_LONG).show()
        } else {
            signup()
        }
    }
    private fun signup(){
        val password = binding.inputPassword.text.toString()
        val confirmPassword = binding.inputConfirmPassword.text.toString()
        if(password!=confirmPassword){
            Toast.makeText(this, "Password is not Confirmed\n Try again", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "You have successfully registered\n Login now", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }




}