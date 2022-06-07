package Lesson1;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student (String name,int course,double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap (Student s1,Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void changeName(Student s1){
        s1.name = "Anastasiya";
    }


}



class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3,4.5);
        Student st2 = new Student("Ivan",3,4);


        superSravnenie(st1,st2);


    }

    public static void sravnenie(Student c1,Student c2){
        if(c1.name.equals(c2.name) && c1.course == c2.course && c1.grade == c2.grade){
            System.out.println("Студенты похожи");
        } else{
            System.out.println("Это разные студенты");
        }
    }

    public static void superSravnenie(Student c1,Student c2) {
        if(c1.name.equals(c2.name)){
            if(c1.course == c2.course){
                if(c1.grade == c2.grade){
                    System.out.println("Эти студенты одинаковы");
                } else {
                    System.out.println("У них разные оценки");
                }
            } else{
                System.out.println("Они на разных курсах");
            }
        } else {
            System.out.println("У них разные имена");
        }
    }
}
