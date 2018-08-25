package com.example.adaog.trabcarros.activity


import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity


@SuppressLint("Registered")
open class BaseActivity: AppCompatActivity() {
    protected val context: Context get() = this
}