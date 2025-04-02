package DAY8;

//custom immutable class
final class Person {
    private  final String name;
    private final int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }
}
class Immutable {
        public static void main(String[] args) {
            //person.setName("xyz");
        	Person person = new Person("John", 25);
            String test = new String("XYZ");
//            test.toString();
            
         System.out.println(person.getName());
          System.out.println(person.getAge());
            
          
        }
 }
