package com.example.kmm2gisexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform