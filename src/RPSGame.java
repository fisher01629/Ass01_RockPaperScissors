import java.util.Scanner;
public class RPSGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerAMove = "";
        String playerBMove = "";
        boolean done = false;
        String playAgain = "";
        boolean playAgainValidity = false;
        do {
            done = false;
            do {
                System.out.print("Player A make a move [RPS]: ");
                if (in.hasNextLine()) {
                    playerAMove = in.nextLine();
                    if (playerAMove.equalsIgnoreCase("R") || playerAMove.equalsIgnoreCase("P") || playerAMove.equalsIgnoreCase("S"))
                        done = true;
                    else {
                        System.out.println("You've entered an invalid move: " + playerAMove);
                    }
                }

            } while (!done);
            done = false;
            do {
                System.out.print("Player B make a move [RPS]: ");
                if (in.hasNextLine()) {
                    playerBMove = in.nextLine();
                    if (playerBMove.equalsIgnoreCase("R") || playerBMove.equalsIgnoreCase("P") || playerBMove.equalsIgnoreCase("S"))
                        done = true;
                    else {
                        System.out.println("You've entered an invalid move: " + playerBMove);
                    }
                }
            } while (!done);
            if (playerAMove.equalsIgnoreCase("R")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock! It's a draw!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock! Player B wins!");
                } else
                    System.out.println("Rock breaks Scissors! Player A wins!");
            } else if (playerAMove.equalsIgnoreCase("P")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock! Player A wins!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper! It's a draw!");
                } else
                    System.out.println("Scissors cuts paper! Player B wins!");
            } else {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors! Player B wins!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper! Player A wins!");
                } else
                    System.out.println("Scissors vs Scissors! It's a draw!");
            }
            playAgainValidity = false;
            do {
                System.out.print("Do you want to play again (Y/N)? ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("N") || playAgain.equalsIgnoreCase("Y")) {
                    playAgainValidity = true;
                } else {
                    System.out.println("Invalid response. Try Again");
                }
            } while (!playAgainValidity);
        }while(playAgain.equalsIgnoreCase("Y"));
    }
}