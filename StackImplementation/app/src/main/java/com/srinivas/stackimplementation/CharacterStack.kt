package com.srinivas.stackimplementation

import kotlin.math.pow

class CharacterStack {
    var stack = CharArray(maxSize)
    var currentIndex = -1

    companion object {
        var maxSize = 0

        init {
            maxSize = 10.0.pow(4.0).toInt() / 2
        }
    }

    fun push(value: Char) {
        if (currentIndex == maxSize) {
            return
        } else {
            currentIndex += 1
            stack[currentIndex] = value
        }
    }

    fun pop() {
        currentIndex -= if (currentIndex < 0) {
            return
        } else {
            1
        }
    }

    fun top(): Char? {
        return if (currentIndex < 0) {
            null
        } else {
            stack[currentIndex]
        }
    }
}