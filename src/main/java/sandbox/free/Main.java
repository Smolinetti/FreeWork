package sandbox.free;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Anton", 1500, 45, 10000);
        Player player2 = new Player("Svetlana", 2000, 55, 20000);
        Player player3 = new Player("Arsi");

//        player1.nickname = "Anton";
//        player2.nickname = "Svetlana";
//        player3.nickname = "Arsi";

        System.out.println();
        System.out.println(player1.nickname + " и " + player2.nickname + " = " + player3.nickname);




    }
}
