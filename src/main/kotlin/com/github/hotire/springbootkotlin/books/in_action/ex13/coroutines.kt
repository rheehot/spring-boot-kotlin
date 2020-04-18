package com.github.hotire.springbootkotlin.books.in_action.ex13

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.time.ZonedDateTime

fun now() = ZonedDateTime.now().toInstant().toEpochMilli();

fun log(msg:String) = println("${now()} : ${Thread.currentThread()} : ${msg}")

fun launchInGlobalScope() {
    GlobalScope.launch {
        log("coroutine started")
    }
}

fun main() {
    log("main() started")
    launchInGlobalScope()
    log("launchInGlobalScope() executed")

    // if non-sleep, launchInGlobalScope is not executed
    Thread.sleep(100)
}