package com.github.hotire.springbootkotlin.books.in_action.ex10

import org.springframework.core.annotation.Order
import kotlin.reflect.full.memberProperties

fun Any.getHash() : String  {
    if (this is HashAware) {
        return getHash()
    }
    return toString()
}

interface HashAware {
    @Target(AnnotationTarget.PROPERTY)
    annotation class HashCode(val order: Order = Order())

    fun getHash() : String {
        this::class.memberProperties.forEach{
            val result = it.call(this)
            println(result?.getHash())
        }
        return ""
    }
}

interface PersonHashAware : HashAware {
    @HashAware.HashCode(Order(1))
    val name : String
    @HashAware.HashCode(Order(1))
    val age: Int
}

class Person2(override val name: String, override val age: Int) : PersonHashAware {
    val person: PersonHashAware = object:PersonHashAware {
        override val name: String
            get() = this@Person2.name
        override val age: Int
            get() = this@Person2.age
    }
}

fun main() {
    val p = Person2("hello", 1)
    val hash = p.getHash();
}


