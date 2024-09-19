package com.ciphera.database

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform


