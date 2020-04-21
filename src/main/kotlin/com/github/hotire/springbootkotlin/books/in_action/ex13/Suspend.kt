package com.github.hotire.springbootkotlin.books.in_action.ex13

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun yield(count:Int, time:Long) {
   for (i in 0..count) {
       log("count${i}")
       delay(time)
   }
}

fun main(){
    runBlocking{
        launch {
            yield(3, 1000L)
        }
    }
}
