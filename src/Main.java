public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee(
                "Ivan", "Mike", "Atkins", 1, 56));
        employeeBook.addEmployee(new Employee(
                "Mike", "Sam", "Morales", 2, 74));
        employeeBook.addEmployee(new Employee(
                "Logan", "Karl", "Cooper", 3, 102));
        employeeBook.addEmployee(new Employee(
                "Sam", "Nik", "Johnson", 4, 115));
        employeeBook.addEmployee(new Employee(
                "Nik", "Karl", "Stone", 5, 164));
        employeeBook.addEmployee(new Employee(
                "Shon", "Mike", "Clarke", 1, 208));
        employeeBook.addEmployee(new Employee(
                "Karl", "Nik", "Cooper", 2, 271));
        employeeBook.addEmployee(new Employee(
                "Mari", "Alex", "Johnson", 3, 302));
        employeeBook.addEmployee(new Employee(
                "Ann", "Shon", "Atkins", 4, 366));
        employeeBook.addEmployee(new Employee(
                "Kate", "Alex", "Clarke", 5, 377));
        employeeBook.addEmployee(new Employee(
                "Alex", "Shon", "Morales", 1, 449));
        System.out.println("//printEmployeesInfo");
        employeeBook.printEmployeesInfo();
        System.out.println("//printMiddleWage");
        employeeBook.printMiddleWage();
        System.out.println("//printTax PROPORTIONAL");
        employeeBook.printTax("PROPORTIONAL");
        System.out.println("//printTax PROGRESSIVE");
        employeeBook.printTax("PROGRESSIVE");
        System.out.println("//indexWage");
        employeeBook.indexWage(1, 23);
        employeeBook.printEmployeesInfo();
        System.out.println("//printEmployeeWithWageGreat");
        employeeBook.printEmployeeWithWageGreat(2, 200);
        System.out.println("//printEmployeeWithWageLess");
        employeeBook.printEmployeeWithWageLess(200, 3);
        System.out.println("//isExistEmployee");
        System.out.println(employeeBook.isExistEmployee(
                new Employee("Karl", "Shon", "Morales", 4, 271)));
        System.out.println("//isExistEmployee");
        System.out.println(employeeBook.isExistEmployee(
                new Employee("Karl", "Shon", "Morales", 4, 272)));
        System.out.println("//getEmployeeById");
        employeeBook.getEmployeeById(5).printShortInfo();
    }
}