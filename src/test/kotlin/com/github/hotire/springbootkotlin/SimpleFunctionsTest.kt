package com.github.hotire.springbootkotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * @author : hotire
 */


class SimpleFunctionsTest {
    /**
     * the function start return the string "OK".
     */
    private fun start(): String = "OK"

    @Test
    fun test_start() {
        assertThat(start()).isEqualTo("OK")
    }

}