package com.example.assignmentv1.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assignmentv1.databinding.ActivityLoginBinding
import com.example.assignmentv1.viewmodels.MainViewModel

class LoginActivity : AppCompatActivity() {

    private lateinit var registerBind: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBind = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(registerBind.root)
    }


}