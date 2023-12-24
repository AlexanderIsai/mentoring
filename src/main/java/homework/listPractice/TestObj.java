package homework.listPractice;

import java.util.Objects;

public class TestObj {
    private String name;

    private int age;

    private boolean isReal;

    public TestObj(String name, int age, boolean isReal) {
        this.name = name;
        this.age = age;
        this.isReal = isReal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isReal() {
        return isReal;
    }

    public void setReal(boolean real) {
        isReal = real;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestObj testObj = (TestObj) o;

        if (age != testObj.age) return false;
        if (isReal != testObj.isReal) return false;
        return Objects.equals(name, testObj.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (isReal ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestObj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isReal=" + isReal +
                '}';
    }
}
