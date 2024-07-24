package com.example.junit

class Grader {
    fun determineGrader(point : Double) : Char{
        return if (point < 0){
            throw IllegalArgumentException("Point must be greater than 0")
        }else if (point < 50){
             'F'
        }else if (point < 70){
             'D'
        }else if (point < 80){
             'C'
        }else if (point < 90){
             'B'
        }else if (point > 10){
             'A'
        } else {
            'F'
        }
    }
}