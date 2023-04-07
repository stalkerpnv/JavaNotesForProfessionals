package chapter01;

import java.util.Arrays;

public class Team {
    String name;
    Player[] players;

    Team(String name, int countOfPlayers) {
        this.name = name;
        players = new Player[countOfPlayers];
    }

    @Override
    public String toString() {
        return Arrays.deepToString(players);
    }

    public static void main(String[] args) {
        Team ct = new Team("ct", 5);
        for (int i = 0; i < 5; i++) {
            ct.players[i] = new Player(("Player").concat(Integer.toString(i + 1)), (i + 1));

        }
        Team t = new Team("t", 5);
        for (int i = 0; i < 5; i++) {
            t.players[i] = new Player(("Player").concat(Integer.toString(i + 1)), (i + 1));

        }
        System.out.println(ct);
    }
}
