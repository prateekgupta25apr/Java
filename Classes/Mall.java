package Classes;

public class Mall {
    byte totalShops;
    String []shopDetails;
    int taxes;
    long revenue;
    int maintenance;

    void getShopDetails(){
        System.out.println("Total numbers of shops : "+totalShops);

        System.out.println("Shop details");
        for (String s:shopDetails) System.out.println(s);
    }

    long getProfit(){return revenue-taxes-maintenance;}
}
