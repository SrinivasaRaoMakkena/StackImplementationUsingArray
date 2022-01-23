package com.srinivas.stackimplementation

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Unit tests to test the logic, all stack operations in single function
 */
class MinStackTest {
    private lateinit var minStack: MinStack

    @Before
    fun setUp() {
        minStack = MinStack()
    }

    @Test
    fun testStackOperations() {
        val input1 =
            arrayOf<String>("MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin");
        val a1: Array<Int> = arrayOf()
        val a2: Array<Int> = arrayOf(-2)
        val a3: Array<Int> = arrayOf(0)
        val a4: Array<Int> = arrayOf(-3)

        val input2 = arrayOf(a1, a2, a3, a4, a1, a1, a1, a1)
        val expected = arrayOf(null, null, null, null, -3, null, 0, -2)
        Assert.assertEquals(expected, minStack.output(input1, input2))
    }

    @Test
    fun testStackOperations2() {
        val input1 =
            arrayOf<String>("MinStack", "push", "push", "getMin", "pop", "top", "getMin","pop","top");
        val a1: Array<Int> = arrayOf()
        val a2: Array<Int> = arrayOf(-2)
        val a3: Array<Int> = arrayOf(0)
        val a4: Array<Int> = arrayOf(-3)
        val a5: Array<Int> = arrayOf(1)

        val input2 = arrayOf(a1, a2, a3, a4, a1, a1, a1, a1,a1)
        val expected = arrayOf(null, null, null, -2, null, -2, -2, null,null)
        Assert.assertEquals(expected, minStack.output(input1, input2))
    }
}