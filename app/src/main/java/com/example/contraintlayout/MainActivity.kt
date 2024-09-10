package com.example.contraintlayout

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailInput = findViewById<EditText>(R.id.inputEmail)
        val fullnameInput = findViewById<EditText>(R.id.inputFullname)
        val usernameInput = findViewById<EditText>(R.id.inputUsername)
        val passwordInput = findViewById<EditText>(R.id.inputPassword)
        val signUpButton = findViewById<Button>(R.id.buttonSignUp)

        signUpButton.setOnClickListener {
            val email = emailInput.text.toString()
            val fullname = fullnameInput.text.toString()
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            // Cek apakah ada field yang kosong
            if (email.isNotEmpty() && fullname.isNotEmpty() && username.isNotEmpty() && password.isNotEmpty()) {
                // Tampilkan data inputan pengguna di Toast
                val message = "Email: $email\nFullname: $fullname\nUsername: $username"
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            } else {
                // Tampilkan pesan peringatan jika ada field yang kosong
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
