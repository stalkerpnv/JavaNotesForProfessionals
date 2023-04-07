package chapter01;

public class Player {
    private String name;
    private int rank;

    public Player(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return  name + ", rank = " + rank;
    }
}
