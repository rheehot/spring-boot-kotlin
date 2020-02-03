package com.github.hotire.springbootkotlin.books.in_action.ex04


class A {
    companion object {
        fun bar() {

        }
    }
}

class B {
    companion object Name {
        fun naming() {

        }
    }
}

fun main(args: Array<String>) {
    A.bar();
    B.Name.naming()
}