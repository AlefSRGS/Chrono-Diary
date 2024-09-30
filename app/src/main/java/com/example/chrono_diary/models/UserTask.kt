package com.example.chrono_diary.models

import java.time.LocalDate

data class UserTask (
    var taskName: String,
    var description: String,
    var dueDate: String,
    var tag: String,
    var done: Boolean
)
