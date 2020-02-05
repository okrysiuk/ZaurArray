package Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder name) {
        if(name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Указано неверное имя !! Длинна имени должна быть не менее 3-х символов.");
        }
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder();
        sb =  name;
        return sb;
    }

    public void setCourse(int course) {
        if(course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("Указан некорректный курс.");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setGrade(int grade) {
        if(grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Указана некорректная оценка.");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo() {
        System.out.println("Имя студента: " + name);
        System.out.println("Средняя оценка: " + grade);
        System.out.println("Курс: " + course);
    }
}
