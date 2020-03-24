package com.github.hotire.springbootkotlin.books.in_action.ex10

import org.springframework.core.annotation.Order


interface HashAware {
    @Target(AnnotationTarget.PROPERTY_GETTER)
    annotation class HashCode(val order: Order = Order())
}
