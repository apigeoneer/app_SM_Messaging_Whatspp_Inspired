package com.gmail.apigeoneer.smmessaging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        supportActionBar?.hide();
    }
}