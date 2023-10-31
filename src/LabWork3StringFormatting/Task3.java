package LabWork3StringFormatting;

import java.text.DecimalFormat;

public class Task3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Сергей Михайлович", 255000);
        employees[1] = new Employee("Михаил Юрьевич", 89000.95);
        employees[2] = new Employee("Юлия Александровна", 100000.5);

        Report.generateReport(employees);
    }

    static class Employee {
        private String fullName;
        private double salary;

        public Employee(String fullName, double salary) {
            this.fullName = fullName;
            this.salary = salary;
        }

        public String getFullName() {
            return fullName;
        }

        public double getSalary() {
            return salary;
        }
    }

    static class Report {
        public static void generateReport(Employee[] employees) {
            System.out.println("Employee report");
            System.out.printf("\n");
            System.out.printf("%-20s %10s%n", "Employee's name", "Salary"); // %~ - left alignment, % - right alignment. 20s - number of occupied characters

            DecimalFormat df = new DecimalFormat("#.00"); // #. how many decimal places

            for (Employee employee : employees) {
                System.out.printf("%-20s %10s%n", employee.getFullName(), df.format(employee.getSalary()));
            }
        }
    }
}
