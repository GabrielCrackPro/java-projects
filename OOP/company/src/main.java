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

        System.out.println(green + "[ i ] Company created successfully!" + reset);

        sc.close();

    }
}