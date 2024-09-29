package com.example.loginapp

import com.example.chrono_diary.UserTask

data class User(
    val username: String,
    val password: String,
    val name: String,
    val birthday: String,
    var tasklist: MutableList<UserTask> = mutableListOf()
)