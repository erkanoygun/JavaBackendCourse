public class SafeHouse extends Location{

    public SafeHouse(Player player) {
        super("SafeHouse", player,null);
    }

    @Override
    boolean onLocation() {
        System.out.println("Welome Safe House");
        return true;
    }

    
}
