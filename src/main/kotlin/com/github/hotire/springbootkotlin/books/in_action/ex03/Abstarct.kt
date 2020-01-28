package com.github.hotire.springbootkotlin.books.in_action.ex03

abstract class Animated {
    // 추상 메서드, 상속을 강제한다.
    abstract fun animate()

    // 비추상 메서드로, final이 기본적으로 붙어있다.
    fun animateTwice() {
    }

    // override를 하기 위해선 open을 사용한다.
    open fun stopAnimating() {
    }
}
