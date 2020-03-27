package com.github.hotire.springbootkotlin.books.in_action.ex10

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationAndReflectionKtTest {
    @Test
    fun getHash() {
        // given
        val person = PersonEntity("hello", 2)

        // when
        val result = person.getHash()

        // then
        assertThat(result).isEqualTo("c8708e6a15954b88499134b301a24b07a8cb6feb27023fe3013206b474445f4f");
    }

    @Test
    fun declaredMemberPropertyTest() {
        // given
        val person = object:HashAware {
            val name = ""
        }

        // when
        val property = person::class.declaredMemberProperty("name")


        // then
        assertThat(property?.name).isEqualTo("name")
    }
}