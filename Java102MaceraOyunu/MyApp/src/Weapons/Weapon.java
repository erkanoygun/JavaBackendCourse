package Weapons;

public class Weapon {
    private int id;
    private int demage;
    private int money;


    public Weapon(int id, int demage, int money) {
        this.id = id;
        this.demage = demage;
        this.money = money;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    public void setDemage(int demage) {
        this.demage = demage;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getId() {
        return id;
    }
    public int getDemage() {
        return demage;
    }
    public int getMoney() {
        return money;
    }


}
