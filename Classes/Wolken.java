package Classes;

public class Wolken {
    byte id;
    String name;
    String email;
    long contactNumber;

    public Wolken() {
    }

    public Wolken(String name) {
        this.name = name;
    }

    public Wolken(byte id, String name, String email, long contactNumber) {
        this(name);
        this.id = id;
        this.email = email;
        this.contactNumber = contactNumber;
    }
}
