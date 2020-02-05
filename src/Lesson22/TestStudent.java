package Lesson22;

public class TestStudent extends Student{
    public static void main(String[] args) {
        TestStudent ts = new TestStudent();
        ts.setName(new StringBuilder("Alex"));
        ts.setGrade(9);
        ts.setCourse(1);
        ts.showInfo();
    }
}
