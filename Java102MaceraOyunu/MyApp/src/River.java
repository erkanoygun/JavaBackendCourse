import Monsters.Bear;

public class River extends Location{

    public River(Player player) {
        super("River", player,new Bear());
    }

    @Override
    boolean onLocation() {
        System.out.println("Welome River");
        return true;
    }
    
}
