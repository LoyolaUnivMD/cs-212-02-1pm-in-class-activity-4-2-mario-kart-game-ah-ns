import java.util.Scanner;

class MarioKartPlayer {
    //Attributes
    String playerName, character;
    int speed;

    //General Constructor
    public MarioKartPlayer(String playerName, String character, int speed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    public MarioKartPlayer() {
        this.playerName = "unknown";
        this.character = "unknown";
        this.speed = 1;
    }

    // Boost method (increase speed)
    public void boost() {
        System.out.println(playerName + " performed a boost!\n");
        speed++;
    }

    // Display info of player
    public void displayInfo() {
        System.out.println("Player Name: " + playerName + "\nCharacter: " + character + "\nSpeed: " + speed + "\n");
    }
}

class MarioKartGame {
    public static void main(String[] args) {
        System.out.println("Mario Kart!\n");
        Scanner input = new Scanner(System.in);
        // Prompt user input for player data
        System.out.println("Enter your name: ");
        String playerName = input.next();
        System.out.println("Enter your character: ");
        String character = input.next();
        System.out.println("What is your speed? ");
        int speed = input.nextInt();
        // Instantiate object yoshi
        MarioKartPlayer yoshi = new MarioKartPlayer(playerName, character, speed);

        // Prompt user input for player data
        System.out.println("Enter your name: ");
        playerName = input.next();
        System.out.println("Enter your character: ");
        character = input.next();
        System.out.println("What is your speed? ");
        speed = input.nextInt();
        // Instantiate object bowser
        MarioKartPlayer bowser = new MarioKartPlayer(playerName, character, speed);
        // Display the information of both characters
        yoshi.displayInfo();
        bowser.displayInfo();
        // Call the boost method on yoshi and display updated info
        yoshi.boost();
        yoshi.displayInfo();
        // Call the boost method on bowser and display updated info
        bowser.boost();
        bowser.displayInfo();
    }
}
