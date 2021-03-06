package com.srinivas.stackimplementation;

public class MinStack {
    int maxSize;
    int stack[];
    int currentIndex = -1;

    public MinStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    void push(Integer value) {
        if (currentIndex >= maxSize-1) {
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

    Integer top() {
        if (currentIndex < 0) {
            return null;
        } else {
            return stack[currentIndex];
        }
    }

    int getMin() {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i <= currentIndex; i++) {
            if (stack[i] < minValue) {
                minValue = stack[i];
            }
        }
        return minValue;
    }

    public Integer[] output(String[] operations, Integer[][] value) {
        MinStack minStack = null;
        Integer[] output = new Integer[operations.length];
        if (operations.length > 1 && operations[operations.length - 1].equals("MinStack")) {
            System.out.println("Trying to do stack operations without MinStack initialization");
        }
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MinStack":
                    if (minStack == null) minStack = new MinStack(maxSize);
                    output[i] = null;
                    break;
                case "push":
                    if (minStack != null)
                        minStack.push(value[i][0]);
                    else
                        System.out.println("MinStack not initialized");
                    output[i] = null;
                    break;
                case "pop":
                    if (minStack != null)
                        minStack.pop();
                    else
                        System.out.println("MinStack not initialized");
                    output[i] = null;
                    break;
                case "top":
                    if (minStack != null) {
                        output[i] = minStack.top();
                    } else {
                        System.out.println("MinStack not initialized");
                    }
                    break;
                case "getMin":
                    if (minStack != null) {
                        output[i] = minStack.getMin();
                    } else {
                        System.out.println("MinStack not initialized");
                    }
            }
        }
        return output;
    }
}
