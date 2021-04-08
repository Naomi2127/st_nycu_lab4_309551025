import java.util.Scanner;

public class Main {

    public static void main (String args[]){
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>Rock-paper-scissors game<<<");
        System.out.println("Enter player 1's choice (rock, paper or scissors):");
        String p1 = scanner.next();
        if (!game.check_input(p1)) {
            System.out.println("Bad Choice!");
            System.exit(0);
        }

        System.out.println("Enter player 2's choice (rock, paper or scissors):");
        String p2 = scanner.next();
        if (!game.check_input(p2)) {
            System.out.println("Bad Choice!");
            System.exit(0);
        }

        System.out.println(game.result(p1,p2));
    }
}