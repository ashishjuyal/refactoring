package coupler.featureenvy;

public class Employee {
    private int age;
    private int grade;
    private String name;

    public Employee(int age, int grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public int age() {
        return age;
    }

    public int grade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
