package com.srinivas.stackimplementation

class ValidParenthesis {

    private val stack: CharacterStack = CharacterStack()
    fun isValidParenthesis(value: String): Boolean {
        if (value.length % 2 == 1) {
            return false
        }
        for (index in value.indices) {
            when (val currentChar = value[index]) {
                '{', '(', '[' -> stack.push(currentChar)
                else -> {
                    when {
                        currentChar == '}' && stack.top() == '{' ||
                                currentChar == ')' && stack.top() == '(' ||
                                currentChar == ']' && stack.top() == '[' -> stack.pop()
                        else -> return false
                    }
                }
            }
        }
        return true
    }
}