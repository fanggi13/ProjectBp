package com.example.projectbp

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/func
    fun logincek():Boolean{
        if (username.equals("Fanggi") && password.equals("admin")) {
            return true
        }else {
            return false
        }
    }
}