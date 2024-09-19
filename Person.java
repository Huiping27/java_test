public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;//this keyword is used to refer to the current object.
        this.age = age; 
        this.gender = gender;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 20, "male");
        person1.printInfo();
    }
}


