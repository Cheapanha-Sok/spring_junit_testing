package com.example.junit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun twoAddTwoEqualFour() {
        val calculator = Calculator()
        assertEquals(4, calculator.sumTwoNum(2, 2))
    }

    @Test
    fun twoAddTwoLessThanFour() {
        val calculator = Calculator()
        assertTrue( 4 < calculator.sumTwoNum(2, 2))
    }
}

