package com.example.chrono_diary
import org.mindrot.jbcrypt.BCrypt

object HashUtils {
    fun hashSensitiveData(sensitiveData: String): String {
        return BCrypt.hashpw(sensitiveData, BCrypt.gensalt())
    }


    fun checkSensitiveData(sensitiveData: String, hashed: String): Boolean {
        return BCrypt.checkpw(sensitiveData, hashed)
    }
}