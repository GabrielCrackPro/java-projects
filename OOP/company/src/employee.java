public class employee {
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String reset = "\u001B[0m";

    public String name;
    public String address;
    public int number;
    public company company;
    public String department;
    public double salary;
    public String hireDate;
    public String jobTitle;
    public boolean isWorking;

    employee() {
    } // Empty constructor

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCompany(company company) {
        this.company = company;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

}
