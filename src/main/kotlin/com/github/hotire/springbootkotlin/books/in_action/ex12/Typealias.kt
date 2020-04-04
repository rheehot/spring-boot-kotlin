package com.github.hotire.springbootkotlin.books.in_action.ex12

import com.github.hotire.springbootkotlin.books.in_action.ex10.Person

typealias StringKeyMap<V> = Map<String,V>

val onEach = listOf(1, 2, 3).onEach { println(it) }

val also = Person("", 1).also { println(it.age) }.apply { println(this.name) }
