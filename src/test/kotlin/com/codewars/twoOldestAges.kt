package com.codewars

import com.codewars.Vowels
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TwoOldestAgesTest {

    private lateinit var oldestAges: OldestAges

    @BeforeEach
    fun configureSystemUnderTest() {
        oldestAges = OldestAges()
    }

    @Test
    @DisplayName("Should return the correct message")
    fun shouldReturnCorrectMessage() {
        assertThat(oldestAges.twoOldestAges(listOf(6,5,83,5,3,18))).isEqualTo(listOf(18, 83))
    }

}