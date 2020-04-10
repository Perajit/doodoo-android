package com.example.dodoo.data

data class Plan(
    var title: String,
    var detail: String? = null,
    val time: Long? = null
)