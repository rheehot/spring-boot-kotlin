package com.github.hotire.springbootkotlin.books.in_action.ex10

import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.superclasses

fun KClass<*>.declaredMemberProperty(propertyName: String) : kotlin.reflect.KProperty1<out Any, Any?>?
     = this.declaredMemberProperties.firstOrNull() { it.name == propertyName }


inline fun <reified T : Annotation, R> Any.findAnnotation(kProperty: KProperty<R>) : T? {
    return kProperty.findAnnotation<T>() ?: this::class.superclasses
            .map { it.declaredMemberProperty(kProperty.name)?.findAnnotation<T>() }
            .firstOrNull()
}

