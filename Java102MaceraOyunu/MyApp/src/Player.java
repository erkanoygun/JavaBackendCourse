import Characters.CharacterType;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private CharacterType charType;

    public void SelectCharacter(CharacterType character)
    {
        this.damage = character.getDemage();
        this.health = character.getHealth();
        this.money = character.getMoney();
        this.charName = character.getName();
        this.charType = character;
    }

    public Location SelectLocatin(int id)
    {
        if(id == 1)
        {
            Location selectLocation = new River(this);
            return selectLocation;
        }
        else if(id == 2)
        {
            Location selectLocation = new SafeHouse(this);
            return selectLocation;
        }
        return null;
    }

    public Player(String name) {
        this.name = name;
    }
    
    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharName() {
        return charName;
    }
    
    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }
    public int getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }

    public void setCharType(CharacterType charType) {
        this.charType = charType;
    }

    public CharacterType getCharType() {
        return charType;
    }
    
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }
}
