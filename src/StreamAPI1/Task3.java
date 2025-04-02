package StreamAPI1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task3 {
public static void main(String[] args) {

//Find the first name that starts with "J" from a list of names.


List<String> names = Arrays.asList("John", "Alice", "Jake", "Bob");
Optional<String> result = names.stream().filter(name -> name.startsWith("J")).findFirst();
//System.out.println("No names starting with J found."+names);
//System.out.println("No names starting with J found."+result.get());
if (result.isPresent())
{
System.out.println("First name starting with J: " + result.get());
} 
else {
System.out.println("No names starting with J found.");
}
}
}
