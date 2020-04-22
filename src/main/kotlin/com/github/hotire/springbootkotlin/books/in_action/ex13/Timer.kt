package com.github.hotire.springbootkotlin.books.in_action.ex13

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.text.SimpleDateFormat
import java.util.*

val simpleDateFormat: SimpleDateFormat = SimpleDateFormat("mm:ss", Locale.KOREA)

const val unit = 1000L
fun timer(timerMillis: Long) {
    runBlocking {
        launch {
            var remain = timerMillis;
            while(remain >= 0) {
                println("now ${simpleDateFormat.format(remain)}")
                delay(unit)
                remain -= unit
            }
        }
    }
}

fun main() {
    timer(10000)
    println("finish!!!")
}