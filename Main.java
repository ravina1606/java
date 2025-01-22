import java.util.Scanner;

class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

  
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Employee extends Person {
    private int id;
    private double salary;
    private String department;
    private static double totalSalary = 0;
  

    
    public Employee(String name, int age, int id, double salary, String department) {
        super(name, age);
        this.id = id;
        this.salary = salary;
        this.department = department;
        totalSalary += salary;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ID: " + id + ", Salary: " + salary + ", Department: " + department);
    }
    public static double calcTotalSalary() {
        return totalSalary;
    }
}

public class Main {
    public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Employee[] employees = new Employee[numEmployees];
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            // Create Employee object
            employees[i] =  new Employee(name, age, id, salary, department);
        }

        System.out.println("\nTotal Salary of all Employees: " + Employee.calcTotalSalary());

    }
}
