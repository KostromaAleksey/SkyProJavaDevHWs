import java.util.Objects;

public class Employee {
    private static int _id = 0;

    private int id;

    private String lastName;
    private String firstName;
    private String middleName;
    private int department;
    private double wage;

    public Employee(String firstName, String middleName, String lastName, int department, int wage) {
        id = Employee._id++;

        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.wage = wage;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public double getWage() {
        return wage;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Employee product = (Employee) o;
        return Objects.equals(wage, product.wage);
    }

    public String toString() {
        return "Сотрудник[id=" + id + ", ФИО=" + lastName + " " + firstName + " " + middleName
                + ", Отдел=" + department + ", Зарплата=" + wage + "]";
    }

    public void printShortInfo() {
        System.out.println(firstName + " " + wage);
    }
}
