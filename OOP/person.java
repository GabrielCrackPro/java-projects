import java.util.Scanner;

public class person {
    private String name;
    private int age;
    private String sex;
    private float weight;
    private float height;

    person() {
    } // Default constructor

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }

    public float getWeight() {
        return this.weight;
    }

    public float getHeight() {
        return this.height;
    }

    // Methods
    public boolean isAdult() {
        return (this.age >= 18);
    }

    public String getData() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nSex: " + this.sex + "\nHeight: " + this.height
                + "\nWeight: " + this.weight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        person person1 = new person();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        person1.setName(name);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        person1.setAge(age);
        System.out.print("Enter sex (m/f): ");
        String sex = sc.next();
        person1.setSex(sex);
        System.out.print("Enter height: ");
        float height = sc.nextFloat();
        person1.setHeight(height);
        float weight = sc.nextFloat();
        person1.setWeight(weight);

        person1.getData();

        sc.close();
    }
}