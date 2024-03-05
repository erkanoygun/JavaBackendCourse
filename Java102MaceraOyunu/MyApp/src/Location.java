import Monsters.Monster;

public abstract class Location {

    private String name;
    private Player player;
    private Monster monster;

    public Monster getMonster() {
        return monster;
    }

    public Location(String name, Player player,Monster monster) {
        this.name = name;
        this.player = player;
        this.monster = monster;
    }

    abstract boolean onLocation();


    public void setName(String name) {
        this.name = name;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public String getName() {
        return name;
    }
    public Player getPlayer() {
        return player;
    }

}
