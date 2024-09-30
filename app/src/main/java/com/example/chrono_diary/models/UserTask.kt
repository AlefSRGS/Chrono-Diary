package com.example.chrono_diary.models

import java.time.LocalDate

data class UserTask (
    var taskName: String,
    var dueDate: LocalDate,
    var tag: String,
    var done: Boolean
)