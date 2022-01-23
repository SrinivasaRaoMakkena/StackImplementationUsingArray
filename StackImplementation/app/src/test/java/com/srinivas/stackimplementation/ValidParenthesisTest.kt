package com.srinivas.stackimplementation

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ValidParenthesisTest() {
    private lateinit var parenthesis: ValidParenthesis

    @Before
    fun setUp() {
        parenthesis = ValidParenthesis()
    }

    @Test
    fun `when string length odd, return false`() {
        Assert.assertFalse(
            parenthesis.isValidParenthesis("{}(")
        )
    }

    @Test
    fun `when string length even and parenthesis not matched then return false`() {
        Assert.assertFalse(
            parenthesis.isValidParenthesis("{(})")
        )
        Assert.assertFalse(
            parenthesis.isValidParenthesis("{}()[](]")
        )
    }

    @Test
    fun `when string length even and parenthesis is matched then return true`() {
        Assert.assertTrue(
            parenthesis.isValidParenthesis("{()}")
        )
        Assert.assertTrue(
            parenthesis.isValidParenthesis("{}()[]()")
        )
    }
}