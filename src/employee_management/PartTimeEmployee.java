package employee_management;

public class PartTimeEmployee extends Employee {
    public double hoursWorked;
    public double hourlyRate;

    public PartTimeEmployee(int employeeId, String name,  double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

