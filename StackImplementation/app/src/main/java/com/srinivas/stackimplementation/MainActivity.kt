package com.srinivas.stackimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Code Task 1
         */
        val minStack = MinStack(10)
        val input1 =
            arrayOf<String>("MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin");
        val a1: Array<Int> = arrayOf()
        val a2: Array<Int> = arrayOf(-2)
        val a3: Array<Int> = arrayOf(0)
        val a4: Array<Int> = arrayOf(-3)

        val input2 = arrayOf(a1, a2, a3, a4, a1, a1, a1, a1)
        println("MinStack: ${Arrays.toString(minStack.output(input1, input2))}")

        /**
         * Code Task 2
         */
        val parenthesis = "Parenthesis: "
        println("Parenthesis Valid or Not:")

        val validParenthesis: ValidParenthesis = ValidParenthesis()
        println("${parenthesis}${validParenthesis.isValidParenthesis("()")}")
        println("${parenthesis}${validParenthesis.isValidParenthesis("(){}[]")}")
        println("${parenthesis}${validParenthesis.isValidParenthesis("(]")}")
        println("${parenthesis}${validParenthesis.isValidParenthesis("([)]")}")
        println("${parenthesis}${validParenthesis.isValidParenthesis("([])")}")
        println("${parenthesis}${validParenthesis.isValidParenthesis("({}{})")}")
        println("${parenthesis}${validParenthesis.isValidParenthesis("()[")}")
        println("${parenthesis}${validParenthesis.isValidParenthesis("()()()}")}")
    }
}