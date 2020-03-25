package com.github.hotire.springbootkotlin.books.in_action.ex10

import org.springframework.core.annotation.Order
import java.lang.annotation.Inherited
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.superclasses
import kotlin.reflect.KProperty as KProperty1

@ExperimentalStdlibApi
fun Any.getHash() : String  {
    if (this is HashAware) {
        return getHash()
    }
    return toString()
}

interface HashAware {
    @Inherited
    @Retention
    @Target(AnnotationTarget.PROPERTY)
    annotation class HashCode(val order: Order = Order())

    fun <R> findAnnotation(kProperty: KProperty1<R>) : HashCode? {
        return kProperty.findAnnotation<HashCode>() ?: this::class.superclasses.map {
            it.declaredMemberProperty(kProperty.name)?.findAnnotation<HashCode>();
        }.firstOrNull()
    }

    fun <R> hasAnnotation(kProperty: KProperty1<R>): Boolean = findAnnotation(kProperty) != null

    @ExperimentalStdlibApi
    fun getHash() : String {
        return this::class.declaredMemberProperties
                .asSequence()
                .map { it -> print(it.annotations)
                    println(findAnnotation(it))
                    it
                }
                .filter { hasAnnotation(it)}
                .map { getPrefix() + findAnnotation(it)!!.order.value + it.call(this) }
                .joinToString();
    }

    fun getPrefix() : String = this::class.simpleName ?: ""
}

interface PersonHashAware : HashAware {
    @HashAware.HashCode(Order(1))
    val name : String
    @HashAware.HashCode(Order(2))
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

@ExperimentalStdlibApi
fun main() {
    val p = Person2("hello", 1)
    val hash = p.getHash();
    print(hash)
}


