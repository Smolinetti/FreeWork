package sandbox.free;

public class Player {
    String nickname;
    int points;
    int level;
    int money;

    public Player(String nickname, int points, int level, int money) {
        this.nickname = nickname.toUpperCase();
        this.points = points;
        this.level = level;
        this.money = money;
    }

    public Player(String nickname) {
        this(nickname, 0, 1, 100);

    }

}
