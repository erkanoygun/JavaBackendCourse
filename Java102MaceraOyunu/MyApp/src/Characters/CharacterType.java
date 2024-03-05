package Characters;

public class CharacterType {
    private int id;
    private int money;
    private int health;
    private int demage;
    private String name;

    public CharacterType(int id, int money, int health, int demage, String name)
    {
        this.id = id;
        this.money = money;
        this.health = health;
        this.demage = demage;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setDemage(int demage) {
        this.demage = demage;
    }
    public int getId() {
        return id;
    }
    public int getMoney() {
        return money;
    }
    public int getHealth() {
        return health;
    }
    public int getDemage() {
        return demage;
    }
}
