package Monsters;

public class Monster
{
    private int id;
    private int health;
    private int money;
    private int demage;

    
    public Monster(int id, int health, int money, int demage) {
        this.id = id;
        this.health = health;
        this.money = money;
        this.demage = demage;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void setDemage(int demage) {
        this.demage = demage;
    }
    public int getId() {
        return id;
    }
    public int getHealth() {
        return health;
    }
    public int getMoney() {
        return money;
    }
    public int getDemage() {
        return demage;
    }
}
