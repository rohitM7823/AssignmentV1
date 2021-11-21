package com.example.assignmentv1.models

import androidx.lifecycle.LiveData

class UserRepository(private val userDAO: UserDAO) {

    val readAll: LiveData<List<User>> = userDAO.readAllData()

    suspend fun addUser(user: User){
        userDAO.insertUser(user)
    }

}