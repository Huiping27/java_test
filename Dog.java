// Derived class (Dog) inherits from Animal
public class Dog extends Animal {
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        // Polymorphism in action
        Animal myAnimal = new Animal(); // Animal reference and object
        myAnimal.makeSound(); // Outputs: Animal is making sound

        Animal myDog = new Dog(); // Animal reference but Dog object
        myDog.makeSound(); // Outputs: Dog is barking (method overriding)
    }
}
