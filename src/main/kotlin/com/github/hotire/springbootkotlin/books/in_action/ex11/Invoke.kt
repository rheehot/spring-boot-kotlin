package com.github.hotire.springbootkotlin.books.in_action.ex11


class DependencyHandler {
    val dependencies = listOf<String>()

    fun complie(coordinate: String) {
        println("Add dependency on ${coordinate}")
    }
}