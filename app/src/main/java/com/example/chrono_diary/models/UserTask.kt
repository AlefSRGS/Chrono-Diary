package com.example.chrono_diary.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserTask(
    var taskName: String,
    var dueDate: String,
    var tag: String,
    var done: Boolean
): Parcelable

enum class tagsTask{
    Trabalho,
    Pessoal,
    Faculdade,
    Qualquer,
    Saude
}