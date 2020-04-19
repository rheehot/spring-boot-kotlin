package com.github.hotire.springbootkotlin.books.in_action.ex13

import kotlinx.coroutines.*
import java.time.ZonedDateTime

fun now() = ZonedDateTime.now().toInstant().toEpochMilli();

fun log(msg:String) = println("${now()} : ${Thread.currentThread()} : ${msg}")

fun launchInGlobalScope() {
    GlobalScope.launch {
        log("coroutine started")
    }
}

fun runBlockingEx() {
    runBlocking {
        launch {
            log("1")
            yield()
            log("3")
            yield()
        }
        log("after first launch")
        launch {
            log("2")
            delay(1L)
            log("4")
            delay(1L)
        }
        log("after second launch")
    }
}

fun main() {
    log("main() started")
    launchInGlobalScope()
    log("launchInGlobalScope() executed")

    // if non-sleep, launchInGlobalScope is not executed
    Thread.sleep(100)


    runBlockingEx()
}