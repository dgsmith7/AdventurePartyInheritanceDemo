package AdventurePartyInheritanceDemo;

public class Main {
    public static Player[] players = new Player[5];

    public static void main(String[] args) {
        System.out.println();
        players[0] = new Player();  // calls default contructor from super class
        players[1] = new Warrior("Laura the Lioness");  // call subclass constructor
        players[2] = new Mage("Kenneth the Wise");
        players[3] = new Elf("Lola the Enchanted"); // calls overloaded constructor from Elf class
        players[4] = new Elf();  // calls default constructor from Elf class
        for (int i = 0; i < players.length; i++) {
            // polymorphism - calls methods from super class and from each different subclass with same line - polymorphism sorting out which method to call
            players[i].getName();
            players[i].attack();
            System.out.println();
        }
    }
}

