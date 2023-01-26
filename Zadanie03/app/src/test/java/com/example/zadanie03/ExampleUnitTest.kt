package com.example.zadanie03

import net.objecthunter.exp4j.ExpressionBuilder
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun firstTest()
    {
        val expression = ExpressionBuilder("2+2").build()
        val result = expression.evaluate().toInt()
        assertEquals(4, result)
    }
    @Test
    fun secondTest()
    {
        val expression = ExpressionBuilder("2-2").build()
        val result = expression.evaluate().toInt()
        assertEquals(0, result)
    }
    @Test
    fun thirdTest()
    {
        val expression = ExpressionBuilder("2*2").build()
        val result = expression.evaluate().toInt()
        assertEquals(4, result)
    }
    @Test
    fun fourthTest()
    {
        val expression = ExpressionBuilder("2/2").build()
        val result = expression.evaluate().toInt()
        assertEquals(1, result)
    }
    @Test
    fun fifthTest()
    {
        val expression = ExpressionBuilder("2/0").build()
        assertThrows(ArithmeticException::class.java)
        {
            expression.evaluate()
        }
    }

    @Test
    fun sixthTest()
    {
        val expression = ExpressionBuilder("3+4").build()
        val result = expression.evaluate().toInt()
        assertEquals(7, result)
    }
    @Test
    fun seventhTest()
    {
        val expression = ExpressionBuilder("3-4").build()
        val result = expression.evaluate().toInt()
        assertEquals(-1, result)
    }
    @Test
    fun eighthTest()
    {
        val expression = ExpressionBuilder("3*4").build()
        val result = expression.evaluate().toInt()
        assertEquals(12, result)
    }

    @Test
    fun ninthTest()
    {
        val expression = ExpressionBuilder("5+6").build()
        val result = expression.evaluate().toInt()
        assertEquals(11, result)
    }
    @Test
    fun tenthTest()
    {
        val expression = ExpressionBuilder("6-5").build()
        val result = expression.evaluate().toInt()
        assertEquals(1, result)
    }
    @Test
    fun eleventhTest()
    {
        val expression = ExpressionBuilder("5*6").build()
        val result = expression.evaluate().toInt()
        assertEquals(30, result)
    }

    @Test
    fun twelveTest()
    {
        val expression = ExpressionBuilder("7+8").build()
        val result = expression.evaluate().toInt()
        assertEquals(15, result)
    }
    @Test
    fun thirteenTest()
    {
        val expression = ExpressionBuilder("7-8").build()
        val result = expression.evaluate().toInt()
        assertEquals(-1, result)
    }
    @Test
    fun fourteenthTest()
    {
        val expression = ExpressionBuilder("7*8").build()
        val result = expression.evaluate().toInt()
        assertEquals(56, result)
    }
    @Test
    fun fifteenthTest()
    {
        val expression = ExpressionBuilder("9+10").build()
        val result = expression.evaluate().toInt()
        assertEquals(19, result)
    }
    @Test
    fun sixteenthTest()
    {
        val expression = ExpressionBuilder("10-9").build()
        val result = expression.evaluate().toInt()
        assertEquals(1, result)
    }
    @Test
    fun seventeenthTest()
    {
        val expression = ExpressionBuilder("9*10").build()
        val result = expression.evaluate().toInt()
        assertEquals(90, result)
    }
    @Test
    fun eighteenthTest()
    {
        val expression = ExpressionBuilder("11+12").build()
        val result = expression.evaluate().toInt()
        assertEquals(23, result)
    }
    @Test
    fun nineteenthTest()
    {
        val expression = ExpressionBuilder("11-12").build()
        val result = expression.evaluate().toInt()
        assertEquals(-1, result)
    }
    @Test
    fun twentiethTest()
    {
        val expression = ExpressionBuilder("11*12").build()
        val result = expression.evaluate().toInt()
        assertEquals(132, result)
    }
}