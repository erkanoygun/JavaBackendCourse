import Weapons.Weapon;

public class Inventory
{
    private boolean water;
    private boolean food;
    private Weapon weapon;
    private String armorName;
    private boolean fireWood;


    public void setFireWood(boolean fireWood) {
        this.fireWood = fireWood;
    }


    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public boolean isFireWood() {
        return fireWood;
    }


    public boolean isWater() {
        return water;
    }
    public boolean isFood() {
        return food;
    }
    
    public String getArmorName() {
        return armorName;
    }
    
    public void setWater(boolean water) {
        this.water = water;
    }
    public void setFood(boolean food) {
        this.food = food;
    }
    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }
}