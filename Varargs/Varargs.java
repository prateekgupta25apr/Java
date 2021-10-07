


public class Varargs {
    public static void main(String[] args) {
        System.out.println(sum(1,3,4,5));
        System.out.println(sum(1,2));
        System.out.println(sum(1,5,7,3,9,0));
        System.out.println(sum(5));
        System.out.println(sum());
    }

    static int sum(int...num){
        int sum=0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}
