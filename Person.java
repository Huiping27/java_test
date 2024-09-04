public class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor to initialize instance variables
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the state of the object
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter and Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
