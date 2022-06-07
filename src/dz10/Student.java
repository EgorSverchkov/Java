package dz10;

public class Student {
    // 1. Объявить private переменные;
    // 2. Объявить сеттеры для каждой переменной;
    // 3.Объявить геттеры для каждой переменнной;
    private StringBuilder name;
    public void setName(StringBuilder name){
if (name.length() > 3) {
    this.name = name;
}
    }

    public StringBuilder getName (){
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }


    private int course;
    public void setCourse(int course){
        if(course > 1 && course <= 4){
            this.course = course;
        }
    }

    public int getCourse(){
        return course;
    }


    private double grade;
    public void setGrade(double grade){
        if(grade > 1 && grade < 10){
            this.grade = grade;
        }
    }
    public double getGrade(){
        return grade;
    }


    public void showInfo(){
        System.out.println("Student name : " + getName());
        System.out.println("Student " + getName() + " education on " + getCourse());
        System.out.println("Student " + getName() + " education on " + getCourse() + " and have this grade " + getGrade());
    }
}





class TestStudent{
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName(new StringBuilder("Egor"));
        st1.setCourse(4);
        st1.setGrade(3);
        st1.showInfo();


    }
}