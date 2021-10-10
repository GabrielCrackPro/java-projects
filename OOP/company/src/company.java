public class company {
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String reset = "\u001B[0m";

    public String name;
    public String address;
    public String phone;
    public String email;
    public String website;
    public String description;
    public boss boss;
    public employee[] employees;

    public company() {
    } // Empty constructor

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getWebsite() {
        return this.website;
    }

    public String getDescription() {
        return this.description;
    }

    // Methods
    public String getCompanyInfo() {
        return green + "[ i ] Company name: " + this.name + reset + "\n" + green + "[ i ] Company address: "
                + this.address + "\n" + reset + green + "[ i ] Company phone: " + this.phone + reset + "\n" + green
                + "[ i ] Company email: " + this.email + "\n" + reset + green + "[ i ] Company website: " + this.website
                + "\n" + reset + green + "[ i ] Company description: " + this.description + reset + "\n";
    }

    public String getEmployeesInfo() {
        return green + "[ i ] Company employees: " + this.employees.length + reset + "\n";
    }

    public String getBossInfo() {
        return green + "[ i ] Company boss: " + this.boss.getBossInfo() + reset + "\n";
    }

    public void addEmployee(employee employee) {
        this.employees = new employee[this.employees.length + 1];
        this.employees[this.employees.length - 1] = employee;
    }

    public void removeEmployee(employee employee) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == employee) {
                this.employees[i] = this.employees[this.employees.length - 1];
                this.employees[this.employees.length - 1] = null;
            }
        }
    }
}
