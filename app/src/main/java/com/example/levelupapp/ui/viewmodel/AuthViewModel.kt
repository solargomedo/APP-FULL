package com.example.levelupapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class AuthViewModel : ViewModel() {
    var userEmail by mutableStateOf("")
        private set

    fun setEmail(email: String) {
        userEmail = email
    }
}