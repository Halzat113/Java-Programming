package player_task;

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "player_task.Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
