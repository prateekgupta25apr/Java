package AbstractionAndInterface;

public class LamborghiniAventador extends Automobiles implements Vehicle{
    public static void main(String[] args) {
        // Up Casting
        Vehicle vehicle=new LamborghiniAventador();
        vehicle.getFuelType();
    }

    @Override
    void setNumberOfSeats(byte newNumberOfSeats) {
        numberOfSeats=newNumberOfSeats;
    }

    @Override
    public void getFuelType() {
        System.out.println(fuelType);
    }
}
