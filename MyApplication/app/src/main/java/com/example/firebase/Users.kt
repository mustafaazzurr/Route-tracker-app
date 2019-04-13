package com.example.firebase

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Users : AppCompatActivity() {

    var myAuth = FirebaseAuth.getInstance()
    lateinit var btn:Button
    lateinit var text:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
        text = findViewById(R.id.txt)
        var myIntent:Intent = intent
        var myUserEmail = myIntent.getStringExtra("id")
        text.text = myUserEmail.toString()

        btn = findViewById(R.id.lobtn)
        btn.setOnClickListener {view ->

            Toast.makeText(this,"logging out ...",Toast.LENGTH_LONG).show()
            signOut()

            myAuth.addAuthStateListener {
                if (myAuth.currentUser == null){
                    this.finish()
                }
            }
        }
    }
    fun signOut(){

        myAuth.signOut()
    }
}
