class Employee {
    public void display() {
        System.out.println("Name of class in Employee");
    }

    public void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    @Override
    public void calcSalary() {
        System.out.println("Salary of engineer is 20000");
    }
}

public class emp1 {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();

        engineer.display(); 
        engineer.calcSalary(); 
    }
}
