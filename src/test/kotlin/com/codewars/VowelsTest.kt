package com.codewars

import com.codewars.Vowels
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class VowelsTest {

    private lateinit var vowels: Vowels

    @BeforeEach
    fun configureSystemUnderTest() {
        vowels = Vowels()
    }

    @Test
    @DisplayName("Should return the correct message")
    fun shouldReturnCorrectMessage() {
        assertThat(vowels.getCount("abra")).isEqualTo(5)
    }

}