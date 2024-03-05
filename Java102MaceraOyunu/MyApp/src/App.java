import java.util.Random;
import java.util.Scanner;
import Characters.Archer;
import Characters.Knight;
import Characters.Samurai;

public class App {

    private static Player player;
    private static Random rand;
    private static Scanner scan;

    public static void main(String[] args) throws Exception {
        rand = new Random();
        scan = new Scanner(System.in);
        StartGame();
    }

    private static void StartGame() {
        // String input = scan.nextLine();
        System.out.println("Please input your name: ");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        Inventory inventory = new Inventory();
        player.setInventory(inventory);
        System.out.println("Select A Character:\n1-Archer\n2-Knight\n3-Samurai");
        int charId = scan.nextInt();

        if (charId == 1) {
            player.SelectCharacter(new Samurai());
        } else if (charId == 2) {
            player.SelectCharacter(new Archer());
        } else if (charId == 3) {
            player.SelectCharacter(new Knight());
        }

        System.out.println("Welcome:" + player.getName());
        System.out.println(
                "Your Char Skills:\n" + "Char Name: " + player.getCharName() + "\nChar healt: " + player.getHealth() +
                        "\nChar demage: " + player.getDamage() + "\nMoney: " + player.getMoney());

        System.out.println("Please Chose a Location:\n1-River\n2-SafeHouse");
        int locID = scan.nextInt();
        Location selectLoc = player.SelectLocatin(locID);
        Action(selectLoc);
    }

    private static void Action(Location selectLocation) {
        if (selectLocation.getName() == "River") {

            if (!player.getInventory().isWater()) {
                while (true) {
                    int attackRandom = rand.nextInt(50);

                    if (attackRandom >= 0 && attackRandom < 25) {
                        player.setHealth((player.getHealth() - selectLocation.getMonster().getDemage()));
                        if (player.getHealth() <= 0) {
                            System.out.println("-----------Game Over----------");
                            break;
                        }
                    } else {
                        selectLocation.getMonster()
                                .setHealth(selectLocation.getMonster().getHealth() - player.getDamage());
                        if (selectLocation.getMonster().getHealth() <= 0) {
                            System.out.println("-----------Monster did death, you win a water----------");
                            player.getInventory().setWater(true);

                            System.out.println("Where you want to go?");
                            System.out.println("Please Chose a Location:\n1-River\n2-SafeHouse");
                            int locID = scan.nextInt();
                            Location selectLoc = player.SelectLocatin(locID);
                            Action(selectLoc);

                            break;
                        }
                    }
                }
            } else {
                System.out.println("You are already have win award of place");
                System.out.println("Please Chose a Location:\n1-River\n2-SafeHouse");
                int locID = scan.nextInt();
                Location selectLoc = player.SelectLocatin(locID);
                Action(selectLoc);
            }

        } else if (selectLocation.getName() == "SafeHouse") {
            if (player.getInventory() != null) {
                if (player.getInventory().isWater()) {
                    System.out.println("You Win");
                } else {
                    // Player health reload initial value.
                    player.setHealth(player.getCharType().getHealth());
                }
            } else {
                System.out.println("Please Chose a Location:\n1-River\n2-SafeHouse");
                int locID = scan.nextInt();
                Location selectLoc = player.SelectLocatin(locID);
                Action(selectLoc);
            }

        }
    }
}