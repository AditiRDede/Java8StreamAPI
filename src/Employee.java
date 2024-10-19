public class Employee
{
    public int empid;
    public String name;
    public double salary;
    public String city;

    public String department;

    public Employee()
    {
        System.out.println("Employee object has been created ...");
    }
    public Employee(int empid, String name, double salary, String city, String department) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.department = department;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
