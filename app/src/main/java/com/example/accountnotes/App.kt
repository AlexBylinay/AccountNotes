package com.example.accountnotes

import android.app.Application

import com.example.accountnotes.data.DataBase
class App : Application() {
    val database by lazy { DataBase.createDataBase(this) }
}