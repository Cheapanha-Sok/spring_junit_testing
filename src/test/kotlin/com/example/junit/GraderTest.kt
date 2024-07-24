package com.example.junit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GraderTest{
    @Test
    fun fiftyShouldReturnF(){
        val grader=Grader()
        assertEquals('F' , grader.determineGrader(50.0))
    }
    @Test
    fun fortyShouldReturnF(){
        val grader=Grader()
        assertEquals('F' , grader.determineGrader(40.0))
    }
    @Test
    fun sixtyShouldReturnF(){
        val grader=Grader()
        assertEquals('F' , grader.determineGrader(60.0))
    }
}

