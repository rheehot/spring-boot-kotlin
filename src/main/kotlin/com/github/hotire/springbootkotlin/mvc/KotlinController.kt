package com.github.hotire.springbootkotlin.mvc

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/kotlin")
@RestController
class KotlinController {
    @GetMapping("/hello")
    fun hello() =  "hello"
}