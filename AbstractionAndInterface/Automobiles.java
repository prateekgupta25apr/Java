package AbstractionAndInterface;

public abstract class Automobiles {
    byte numberOfSeats;
    String model;

    abstract void setNumberOfSeats(byte newNumberOfSeats);

    public void setModel(String model) {
        this.model = model;
    }
}
