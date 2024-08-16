package polymorphism;
import java.util.ArrayList;
import java.util.List;

abstract class Employee
{
    //private variable , because it can not be accessed from outside 
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() { return name;}
    public int getAge() { return age;}
    public double getSalary() { return salary;}

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setSalary(double salary){this.salary = salary;}

    public abstract double calculateBonus();

}

class Manager extends Employee{
    public Manager(String name,int age, double salary){
        super(name, age, salary);
    }
    @Override
    public double calculateBonus(){
        return getSalary() * 0.2 ;
    }
}

class Developer extends Employee{
    public Developer(String name,int age, double salary){
        super(name, age, salary);
    }
    @Override
    public double calculateBonus(){
        return getSalary() * 0.1 ;
    }
}
class Intern extends Employee{
    public Intern(String name,int age, double salary){
        super(name, age, salary);
    }
    @Override
    public double calculateBonus(){
        return 500 ;
    }
}
class Comapany
{
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);
    }    
    public void printEmployeeDetails() {
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName() + ", Role: " 
            + employee.getClass().getSimpleName() + ", Salary: $" 
            + employee.getSalary() + ", Bonus: $" + employee.calculateBonus());
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Comapany comapany = new Comapany();
        Employee manager = new Manager("John Doe", 45, 8000);
        Employee developer = new Developer("Jane Smith", 30, 6000);
        Employee intern = new Intern("Alex Johnson", 22, 2000);
        comapany.addEmployee(manager);
        comapany.addEmployee(developer);
        comapany.addEmployee(intern);
        comapany.printEmployeeDetails();
        
    }
}