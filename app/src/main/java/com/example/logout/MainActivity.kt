package com.example.logout

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name: EditText = findViewById(R.id.name)
        val username: EditText = findViewById(R.id.name)
        val password: EditText = findViewById(R.id.name)
        val signUp: Button = findViewById(R.id.signUp)

        signUp.setOnClickListener {
            if(name.text.toString().isEmpty() || username.text.toString().isEmpty()||password.text.toString().isEmpty()){
                Toast.makeText(this, "Please Fill ALl Fields", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Logged In", Toast.LENGTH_LONG).show()
                val intent = Intent(this, LoggedIn::class.java)
                startActivity(intent)
            }
        }


    }
}