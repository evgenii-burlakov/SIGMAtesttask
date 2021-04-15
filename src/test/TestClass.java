package test;

import java.util.Objects;

public class TestClass {
    private final String description;

    public TestClass(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return description.equals(testClass.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "description='" + description + '\'' +
                '}';
    }
}
