package com.example.chrono_diary.models

import java.time.LocalDate

data class User(
    var username: String,
    val completeName: String,
    var password: String,
    var email: String,
    val birthDate: LocalDate,
    var taskList: MutableList<UserTask> = mutableListOf()
)