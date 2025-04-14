// Class with encapsulation
class Person {
    // Private fields
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) {  // Validation check
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person = new Person();

        // Set values using setter methods
        person.setName("Alice");
        person.setAge(25);

        // Get values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Try setting invalid age
        person.setAge(-5);  // Invalid age, will not be set
    }
}
