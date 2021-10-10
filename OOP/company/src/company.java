public class company {
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
        return "Company name: " + this.name + "\n" + "Company address: " + this.address + "\n" + "Company phone: "
                + this.phone + "\n" + "Company email: " + this.email + "\n" + "Company website: " + this.website + "\n"
                + "Company description: " + this.description + "\n";
    }

    public String getEmployeesInfo() {
        return "Company employees: " + this.employees.length + "\n";
    }

    public String getBossInfo() {
        return "Company boss: " + this.boss.getBossInfo();
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
