package test;

public class Main {
    public static void main(String[] args) {
        System.out.println(TestUtil.add(new TestClass("test1"), new TestClass("test2")));
        System.out.println(TestUtil.pop(new TestClass("test1"), new TestClass("test2")));
        System.out.println(TestUtil.size(new TestClass("test1"), new TestClass("test2")));
    }
}
