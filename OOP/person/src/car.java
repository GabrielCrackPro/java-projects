import java.util.Scanner;

public class car {
    private String owner;
    private String model;
    private String color;
    private int year;
    private int price;
    private boolean isMetalic;

    car() {
    } // Empty constructor

    // Setters
    public void setOwner() {
        person.name = this.owner;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMetalic(boolean isMetalic) {
        this.isMetalic = isMetalic;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Getters
    public String getOwner() {
        return this.owner;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean getMetalic() {
        return this.isMetalic;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        car car1 = new car();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();
        car1.setModel(model);

        System.out.print("Enter car color: ");
        String color = sc.nextLine();
        car1.setColor(color);

        System.out.print("Enter car year: ");
        int year = sc.nextInt();
        car1.setYear(year);

        System.out.print("Is car metalic? (true/false): ");
        boolean isMetalic = sc.nextBoolean();
        car1.setMetalic(isMetalic);

        sc.close();

    }
}
