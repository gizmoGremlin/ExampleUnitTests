package com.pickle.exampleunittests


import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test


import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.rules.ExpectedException
import org.junit.Rule
import java.lang.IllegalArgumentException


class CalculatorTest {


  val calculator = Calculator()


    @Test
    fun addTwoNumbers() {
        val resultAdd = calculator?.add(1.0, 1.0)
        assertThat(resultAdd, (equalTo(2.0)))
    }
    @Test
    fun addTwoNumbersNegitive(){
        val resultAddNeg = calculator?.add(-1.0,-1.0)
        assertThat(resultAddNeg, equalTo(-2.0))
    }
    @Test
    fun addTwoNumbersFloats(){
        val resultAddFloats = calculator?.add(1.111,1.111)
        assertThat(resultAddFloats, ( equalTo(2.222)))
    }

    @Test
    fun subTwoNumbers(){
        val resultsubNums = calculator?.sub(3.0,2.0)
        assertThat(resultsubNums, equalTo(1.0) )
    }
    @Test
    fun subWorksWithNegativeResults(){
        val result =  calculator?.sub(-3.0,2.0)
        assertThat(result, equalTo(-5.0))
    }
    @Test
    fun mulTwoNumbers(){
        val result = calculator?.mul(2.0,5.0)
        assertThat(result, equalTo(10.0))
    }
    @Test
    fun mulTwoNumbersZero(){
        val result = calculator?.mul(2.0,0.0)
        assertThat(result, equalTo(0.0))
    }
    @Test(expected = IllegalArgumentException::class )
    fun divTwoNumbers() {
        val result = calculator?.div(8.0,0.0)

    }




}

