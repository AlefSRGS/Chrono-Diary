package com.example.chrono_diary

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import com.example.chrono_diary.models.*

class UserViewModel : ViewModel() {
    private val users = mutableStateListOf<User>()

    fun addUser(user: User) {
        user.password = HashUtils.hashSensitiveData(user.password)
        users.add(user)
    }
    fun testMatchUser(inputUserName: String, inputPassword: String): User? {
        users.forEach{ user ->
            if(inputUserName == user.username && HashUtils.checkSensitiveData(inputPassword, user.password)){
               return user
            }
        }
        return null;
    }

    fun getUserByUsername(username: String): User? {
        return users.find { it.username == username }
    }

    fun addTaskToUser(currentUser: User, task: UserTask) {
        currentUser.taskList.add(task)
    }
}