public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void printEmployeesInfo() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public void printMiddleWage() {
        int sum = 0;
        int i = 0;
        for (; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            sum += employees[i].getWage();
        }
        System.out.println("Средняя зарплата: " + sum / (i + 1));
    }

    public void printTax(String taxType) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            double tax = 0;
            switch (taxType) {
                case "PROPORTIONAL":
                    tax = 0.13;
                    break;
                case "PROGRESSIVE":
                    if (employee.getWage() < 150) {
                        tax = 0.13;
                    } else if (employee.getWage() < 350) {
                        tax = 0.17;
                    } else {
                        tax = 0.21;
                    }
                    break;
            }
            System.out.println("Сотрудник " + employee.getFirstName() + " налог: " + employee.getWage() * tax);
        }
    }

    public void indexWage(int department, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            employee.setWage(employee.getWage() * (((double) percent / 100) + 1));
        }
    }

    public void printEmployeeWithWageGreat(int department, int wage) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && employees[i].getWage() > wage) {
                System.out.print(i + " ");
                employees[i].printShortInfo();
            }
        }
    }

    public void printEmployeeWithWageLess(int wage, int employeeNumber) {
        int i = 0;
        while (employeeNumber > 0) {
            if (i >= employees.length) {
                break;
            }
            if (employees[i].getWage() < wage) {
                employees[i].printShortInfo();
                employeeNumber--;
            }
            i++;
        }
    }

    public boolean isExistEmployee(Employee employee) {
        for (Employee employ : employees) {
            if (employee.equals(employ)) {
                return true;
            }
        }
        return false;
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
