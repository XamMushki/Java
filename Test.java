import java.util.Scanner;

class Person {
    private String name;
    protected int age;
    private String address;

    public Person() {
        this.name = "No name";
        this.address = "No Address";
        this.age = -1;

    }

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    String getDetails() {
        String details = "Name: " + name + "\nAddress: " + address + "\nAge: " + age;
        return (details);
    }
}

public class Test {
    public static void main(String[] args) {
        Person xam = new Person("Zahid Amin Mushki", "Eid-gah Colony, Janglat Mandi, Anantnag", 30);
        // Person xam = new Person();
        xam.age = 20;
        System.out.println(xam.getDetails());

    }

}
