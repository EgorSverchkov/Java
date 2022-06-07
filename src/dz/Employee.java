package dz;

public class Employee {

    Employee(String name2,String surname2, int age2, double salary2,String department2){
        id++;
        name = name2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department= department2;

    }
    public void getId(){
        System.out.println("Id: " + id);
    }

    public void getNameSurname(){
        System.out.println("Name and Surname: " + name + surname);
    }

    public void getSalary(){
        System.out.println("Salary: " + salary);
    }


    static int id;
    public String name;
    public String surname;
    int age;
    protected double salary;
    String department;
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee("Egor","Olegovich",20,45000,"Java dev");
        System.out.println("Employee number: " + emp.id);
        System.out.println("All about employee: " );
        System.out.println("Name: " + emp.name);
        System.out.println("Surname: " + emp.surname);
        System.out.println("Age: " + emp.age);
        System.out.println("Salary in company: " + emp.salary);
        System.out.println("Department in company: " + emp.department);

        System.out.println();
        System.out.println();


        Employee emp2 = new Employee("Vladimir","Konstantinovich",20,100000,"Web dev");
        System.out.println("Employee number: " + emp2.id);
        System.out.println("All about employee: " );
        System.out.println("Name: " + emp2.name);
        System.out.println("Surname: " + emp2.surname);
        System.out.println("Age: " + emp2.age);
        System.out.println("Salary in company: " + emp2.salary);
        System.out.println("Department in company: " + emp2.department);

    }
}
