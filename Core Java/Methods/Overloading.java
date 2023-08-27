
public class Overloading {
    public static void main(String[] args) {
        greet();
        greet("Prateek");
        greet("Prateek", "Gupta");

    }

    static void greet() {
        System.out.println("Hello");
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static void greet(String firstname, String lastname) {
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
