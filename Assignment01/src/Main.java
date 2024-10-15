import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player A, enter your move (R, P, S): ");
        String playerAMove = getValidMove(scanner);
        System.out.println("Player B, enter your move (R, P, S): ");
        String playerBMove = getValidMove(scanner);
        displayResult(playerAMove, playerBMove);
    }
    private static String getValidMove(Scanner scanner) {
        String move;
        while (true) {
            move = scanner.next().toUpperCase();
            if (move.equals("R") || move.equals("P") || move.equals("S")) {
                break;
            } else {
                System.out.println("Invalid move. Please enter R, P, or S: ");
            }
        }
        return move;
    }
    private static void displayResult(String playerAMove, String playerBMove) {
        if (playerAMove.equals(playerBMove)) {
            System.out.println(playerAMove + " vs " + playerBMove + " - It's a Tie!");
        } else if (playerAMove.equals("R") && playerBMove.equals("S")) {
            System.out.println("Rock breaks Scissors - Player A wins!");
        } else if (playerAMove.equals("P") && playerBMove.equals("R")) {
            System.out.println("Paper covers Rock - Player A wins!");
        } else if (playerAMove.equals("S") && playerBMove.equals("P")) {
            System.out.println("Scissors cuts Paper - Player A wins!");
        } else if (playerBMove.equals("R") && playerAMove.equals("S")) {
            System.out.println("Rock breaks Scissors - Player B wins!");
        } else if (playerBMove.equals("P") && playerAMove.equals("R")) {
            System.out.println("Paper covers Rock - Player B wins!");
        } else if (playerBMove.equals("S") && playerAMove.equals("P")) {
            System.out.println("Scissors cuts Paper - Player B wins!");
        }
    }
}
