package company;

public class Company {
    public static double salaryExpense(Employee... employee){
        int sum = 0;
        for (Employee emp: employee) {
            sum += emp.getBaseSalary()*40;
        }
        return sum;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Smith", 7.5);
        Employee emp2 = new Employee("Doe", "Joe", 8);
        Employee emp3= new Employee("George", "Bacon", 6.5);
        System.out.println(salaryExpense(emp1,emp2,emp3));
    }
}
