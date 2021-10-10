import java.util.Scanner;

public class main {
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(red + "[ ! ] No company created! Please create one company to begin\n" + reset);

        company company = new company();
        System.out.println(blue + "[ i ] Creating new company... \n" + reset);

        System.out.print(blue + "[ ? ] Company name: " + reset);
        String companyName = sc.nextLine();
        company.setName(companyName);

        System.out.print(blue + "[ ? ] Company address: " + reset);
        String companyAddress = sc.nextLine();
        company.setAddress(companyAddress);

        System.out.print(blue + "[ ? ] Company phone: " + reset);
        String companyPhone = sc.nextLine();
        company.setPhone(companyPhone);

        System.out.print(blue + "[ ? ] Company email: " + reset);
        String companyEmail = sc.nextLine();
        company.setEmail(companyEmail);

        System.out.print(blue + "[ ? ] Company website: " + reset);
        String companyWebsite = sc.nextLine();
        company.setWebsite(companyWebsite);

        System.out.print(blue + "[ ? ] Company description: " + reset);
        String companyDescription = sc.nextLine();
        company.setDescription(companyDescription);

        boss boss = new boss();
        System.out.print(blue + "\n[ ? ] Boss name: " + reset);
        String bossName = sc.nextLine();
        boss.setName(bossName);
        System.out.print(blue + "[ ? ] Boss age: " + reset);
        int bossAge = sc.nextInt();
        boss.setAge(bossAge);
        System.out.print(blue + "[ ? ] Boss salary: " + reset);
        int bossSalary = sc.nextInt();
        boss.setSalary(bossSalary);

        company.boss = boss;

        System.out.println(green + "[ i ] Company created successfully!\n\n" + reset);
        System.out.println(blue + "[ ? ] What do you want to do now? Select an option" + reset);
        System.out.println(yellow + "[ 1 ] Add new employee" + reset);
        System.out.println(yellow + "[ 2 ] Get company info" + reset);
        System.out.println(yellow + "[ 3 ] Get boss info" + reset);
        System.out.println(yellow + "[ 4 ] Exit" + reset);

        System.out.print(blue + "[ ? ] Option: " + reset);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println(blue + "[ i ] Adding new employee... \n" + reset);

                employee employee = new employee();

                System.out.print(blue + "[ ? ] Employee name: " + reset);
                String employeeName = sc.nextLine();
                employee.setName(employeeName);

                System.out.print(blue + "[ ? ] Employee salary: " + reset);
                int employeeSalary = sc.nextInt();
                employee.setSalary(employeeSalary);

                employee.setCompany(company);

                company.getEmployeesInfo();
                System.out.println(green + "[ i ] Employee added successfully!" + reset);
                break;
            case 2:
                System.out.println(green + "[ i ] Getting company info... \n" + reset);
                System.out.println(company.getCompanyInfo());
                break;
            case 3:
                System.out.println(green + "[ i ] Getting boss info... \n" + reset);
                System.out.println(company.boss.getBossInfo());
                break;
            case 4:
                System.out.println(blue + "[ i ] Exiting... \n" + reset);
                break;
        }

        sc.close();

    }
}