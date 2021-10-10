import java.util.Scanner;

public class person {
    public static String name;
    public static String surnames;
    public static int age;

    person() {
    } // Empty constructor

    // Setters
    public void setName(String name) {
        person.name = name;
    }

    public void setSurnames(String surnames) {
        person.surnames = surnames;
    }

    public void setAge(int age) {
        person.age = age;
    }

    // Getters
    public String getName() {
        return person.name;
    }

    public String getSurnames() {
        return person.surnames;
    }

    public int getAge() {
        return person.age;
    }

    // Methods
    public void getCar() {
        if (person.age >= 18) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Congratulations you can buy a car!/n Do you want to buy one now (y/n): ");
            String answer = sc.nextLine();
            if (answer.equals("y")) {
                car personCar = new car();
                System.out.print("Enter the brand of the car");
                String carBrand = sc.nextLine();
                personCar.setModel(carBrand);
                System.out.print("Enter the color of the car");
                String carColor = sc.nextLine();
                personCar.setColor(carColor);
                System.out.print("Enter the year of the car");
                int carYear = sc.nextInt();
                personCar.setYear(carYear);
                System.out.print("Enter the price of the car");
                int carPrice = sc.nextInt();
                personCar.setPrice(carPrice);

                sc.close();
            }

        } else {
            System.out.println("Sorry but you can't buy a car\n Try again when you are 18 or older ");
        }
    }

    public void getPersonInfo() {
        System.out.println("Name: " + person.name + "\nSurnames: " + person.surnames + "\nAge: " + person.age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        person person1 = new person();

        System.out.print("Enter person's name: ");
        String name = sc.nextLine();
        person1.setName(name);

        System.out.print("Enter person's surnames: ");
        String surnames = sc.nextLine();
        person1.setSurnames(surnames);

        System.out.print("Enter person's age: ");
        int age = sc.nextInt();
        person1.setAge(age);

        person1.getCar();

        person1.getPersonInfo();

        sc.close();
    }
}
