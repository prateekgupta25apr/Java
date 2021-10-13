package ExceptionHandling;

public class ArrayException {
    public static void main(String[] args) {
        String[] name = {"Prateek", "Gupta"};
        for (int i=0;i<=name.length;i++) {
            try {
                System.out.println(name[i]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
