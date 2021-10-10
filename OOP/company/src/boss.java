public class boss {
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String reset = "\u001B[0m";

    public String name;
    public int age;
    public String jobTitle;
    public company company;
    public int salary;
    public boolean isWorking;

    boss() {
    } // Empty constructor

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompany(company company) {
        this.company = company;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public company getCompany() {
        return this.company;
    }

    public int getSalary() {
        return this.salary;
    }

    // Methods
    public String getBossInfo() {
        return green + "[ i ] Boss: " + this.name + " is " + this.age + " years old, works as a " + this.jobTitle
                + " at " + this.company.getName() + " and earns " + this.salary + " dollars per month." + reset;
    }

    public void setWorkingState(boolean isWorking) {
        if (!isWorking) {
            isWorking = true;
        } else {
            isWorking = false;
        }
    }

    public void hireEmployee(employee employee) {
        this.company.addEmployee(employee);
    }

    public void fireEmployee(employee employee) {
        this.company.removeEmployee(employee);
    }

    public void riseSalary(int salary) {
        this.salary += salary;
    }

    public void riseEmployeeSalary(employee employee, int salary) {
        employee.setSalary(salary);
    }
}