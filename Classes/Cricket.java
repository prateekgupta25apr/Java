package Classes;

public class Cricket {
    String[] players;
    byte matchesWon;
    byte matchesLost;
    String[] sponsor;
    String captain;

    void getPlayerNames() {
        for (String s : players) System.out.println(s);
    }

    void getStatistics() {
        System.out.println("Matches won : " + matchesWon + "\n" +
                "Matches lost" + matchesLost);
    }

    void getAllSponsors(){
        for (String s : sponsor) System.out.println(s);
    }

    void getCaptainName(){
        System.out.println("Captain :"+captain);
    }


}
