package com.github.hotire.springbootkotlin.books.in_action.ex09

import java.util.*

inline fun <reified T> loadService(): ServiceLoader<T>? {
    return ServiceLoader.load(T::class.java)
}