package com.submission.goodbooks

data class Book(
    var title: String = "",
    var author: String = "",
    var isbn: Long = 0,
    var detail: String = "",
    var photo: Int = 0
)