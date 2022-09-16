package com.example.logout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name: EditText = findViewById(R.id.name)
        var username: EditText = findViewById(R.id.name)
        var password: EditText = findViewById(R.id.name)
        val signUp: Button = findViewById(R.id.signUp)
        var Name: String
        var Username: String
        var Password: String
        signUp.setOnClickListener {
            if(name.text.toString().isEmpty() || username.text.toString().isEmpty()||password.text.toString().isEmpty()){
                Toast.makeText(this, "Please Fill ALl Fields", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Logged In", Toast.LENGTH_LONG).show()
                Name = name.text.toString();
                Username = username.text.toString();
                Name = password.text.toString();
                val intent: Intent = Intent(this, LoggedIn::class.java)
                startActivity(intent)
            }
        }


    }
}