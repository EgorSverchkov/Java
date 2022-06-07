package Lesson1;

public class Employee {
    public String name;
    public double salary;

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public double povishenie(double a){
        return a * 2;
    }

    public double uvelichenie(){
        salary = salary * 2;
        return salary;
    }


}


class EmployeeTest{
    public static void main(String[] args) {
        Employee EmpOne = new Employee("Ivan", 25000);
        System.out.println(EmpOne.povishenie(EmpOne.salary));
        System.out.println(EmpOne.uvelichenie());
    }
}
