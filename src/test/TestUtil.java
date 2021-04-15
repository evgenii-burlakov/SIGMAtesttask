package test;

import queue.MyQueue;

class TestUtil {
    static String add(TestClass firstValue, TestClass secondValue) {
        MyQueue<TestClass> testQueue = new MyQueue<>();
        testQueue.add(firstValue);
        if (testQueue.size() != 1) {
            throw new AssertionError("add test unsuccessful");
        }
        testQueue.add(secondValue);
        if (testQueue.size() != 2) {
            throw new AssertionError("add test unsuccessful");
        }
        return "add test successful";
    }

    static String getFirst(TestClass firstValue, TestClass secondValue) {
        MyQueue<TestClass> testQueue = new MyQueue<>();
        testQueue.add(firstValue);
        testQueue.add(secondValue);
        if (!testQueue.pop().equals(secondValue)) {
            throw new AssertionError("getFirst test unsuccessful");
        }
        if (testQueue.size() != 1) {
            throw new AssertionError("getFirst test unsuccessful");
        }
        if (!testQueue.pop().equals(firstValue)) {
            throw new AssertionError("getFirst test unsuccessful");
        }
        if (testQueue.size() != 0) {
            throw new AssertionError("getFirst test unsuccessful");
        }
        try {
            testQueue.pop();
        } catch (UnsupportedOperationException e) {
            return "getFirst test successful";
        }
        return "getFirst test unsuccessful";
    }

    static String size(TestClass firstValue, TestClass secondValue) {
        MyQueue<TestClass> testQueue = new MyQueue<>();
        if (testQueue.size() != 0) {
            throw new AssertionError("size test unsuccessful");
        }
        testQueue.add(firstValue);
        if (testQueue.size() != 1) {
            throw new AssertionError("size test unsuccessful");
        }
        testQueue.add(secondValue);
        if (testQueue.size() != 2) {
            throw new AssertionError("size test unsuccessful");
        }
        return "size test successful";
    }
}
