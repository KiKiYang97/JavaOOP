package model;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 17:33   2020/6/28
 * @ClassName Student
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    private long id;

    public Student(String name, int age, String gender, long id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                '}';
    }
}
