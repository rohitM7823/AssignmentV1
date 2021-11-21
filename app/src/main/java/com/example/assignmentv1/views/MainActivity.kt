package com.example.assignmentv1.views

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.assignmentv1.databinding.ActivityMainBinding
import com.example.assignmentv1.models.User
import com.example.assignmentv1.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var mainBind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBind.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        mainBind.register.setOnClickListener {
            insertDataDB()
        }
    }


    private fun insertDataDB() {
        val name = mainBind.unameRegister.toString()
        val pass = mainBind.upassRegister.toString()
        val email = mainBind.uemailRegister.toString()
        viewModel.addUser(User(0, name, pass, email))
        Toast.makeText(this, "Account Created", LENGTH_SHORT).show()
    }

}