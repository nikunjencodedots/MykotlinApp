package com.example.mykotlinapp.repository

import com.example.mykotlinapp.utils.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()

}