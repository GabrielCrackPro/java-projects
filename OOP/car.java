
/*
Create a class named Car that must include the following:
- Car model (String)
- Car color (String)
- Metalic color (boolean)
- Car type (String). Values can be:
    - Compact
    - Utilitary
    - Sport
- Car insurance (String). Values can be:
    - Full
    - Third Party
- Methods
    - getters and setters
    - getCarData()

*/
import java.util.Scanner;

public class car {
    private String model;
    private String color;
    private boolean metalic;
    private String type;
    private String insurance;

    car() {
    } // Default constructor

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetalic(boolean metalic) {
        this.metalic = metalic;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    // Getters
    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getMetalic() {
        return this.metalic;
    }

    public String getType() {
        return this.type;
    }

    public String getInsurance() {
        return this.insurance;
    }

    public String getCarData() {
        return "\nCar model: " + this.model + "\n" + "Car color: " + this.color + "\n" + "Metalic color: "
                + this.metalic + "\n" + "Car type: " + this.type + "\n" + "Car insurance: " + this.insurance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        car car1 = new car();
        System.out.print("Enter the car model: ");
        String model = sc.nextLine();
        car1.setModel(model);
        System.out.print("Enter the car color: ");
        String color = sc.nextLine();
        car1.setColor(color);
        System.out.print("Is the car color metalic? (true/false) ");
        boolean metalic = sc.nextBoolean();
        car1.setMetalic(metalic);
        System.out.print("Enter the car type: ");
        String type = sc.next();
        car1.setType(type);
        System.out.print("Enter the car insurance: ");
        String insurance = sc.next();
        car1.setInsurance(insurance);
        System.out.println(car1.getCarData());

        sc.close();

    }
}