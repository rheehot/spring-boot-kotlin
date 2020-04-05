package com.github.hotire.springbootkotlin.books.in_action.ex12

import com.github.hotire.springbootkotlin.books.in_action.ex10.Person
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

typealias StringKeyMap<V> = Map<String,V>

val onEach = listOf(1, 2, 3).onEach { println(it) }

val also = Person("", 1).also { println(it.age) }.apply { println(this.name) }


@ExperimentalContracts
fun require(condition: Boolean) {
    contract { returns() implies condition }
    if (!condition) throw IllegalArgumentException()
}


interface Foo {
    companion object {
        @JvmField
        val answer : Int = 42

        @JvmStatic
        fun sayHello() {

        }
    }
}