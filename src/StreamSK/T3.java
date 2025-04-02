package StreamSK;

import java.util.Optional;

public class T3 {
//	3.How do you handle null values safely using Optional to avoid NullPointerException when accessing the name of a person?
public static void main(String[] args) {
    // Creating a Person object (can be null)
    Person person = null;

    // Wrapping the person object in an Optional
    Optional<Person> optionalPerson = Optional.ofNullable(person);

    // Safely accessing the name using map and orElse
    String name = optionalPerson.map(Person::getName).orElse("Unknown"); // Default value if person is null

    System.out.println("Person's name: " + name);
}

}

