package com.srinivas.stackimplementation;

public class CharacterStack {
    static int maxSize;
    char stack[] = new char[maxSize];
    int currentIndex = -1;

    static {
        maxSize = (int) Math.pow(10, 4) / 2;
    }

    void push(char value) {
        if (currentIndex == maxSize) {
            return;
        } else {
            currentIndex += 1;
            stack[currentIndex] = value;
        }
    }

    void pop() {
        if (currentIndex < 0) {
            return;
        } else {
            currentIndex -= 1;
        }
    }

    Character top() {
        if (currentIndex < 0) {
            return null;
        } else {
            return stack[currentIndex];
        }
    }



    public static void main(String [] args){

    }
}
