package com.example.chrono_diary.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var username: String,
    val completeName: String,
    var password: String,
    var email: String,
    val birthDate: String,
    var taskList: MutableList<UserTask> = mutableListOf()
): Parcelable