package com.example.chrono_diary

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import com.example.chrono_diary.models.*

class UserViewModel : ViewModel() {
    private val users = mutableStateListOf<User>()

    fun addUser(user: User) {
        user.password = HashUtils.hashSensitiveData(user.password)
        user.username = HashUtils.hashSensitiveData(user.username)
        users.add(user)
    }
    fun testMatchUser(inputUserName: String, inputPassword: String): User? {
        users.forEach{ user ->
            if(HashUtils.checkSensitiveData(inputUserName, user.username) && HashUtils.checkSensitiveData(inputPassword, user.password)){
               return user
            }
        }
        return null;
    }
    fun addTaskToUser(currentUser: User, task: UserTask) {
        currentUser.taskList.add(task)
    }
}