package beerbottles;

import java.util.Scanner;

public class BeerBottleGame1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("There are 21 beer bottles...");
        System.out.println("There are 2 players - Computer and you.");
        System.out.println("At a time, each one can pick up any no. of bottles between 1 and 4 (inclusive)");

        System.out.print("Would you like to play? ");
        String playGame = scanner.nextLine();

        if (playGame.equalsIgnoreCase("Yes")) {
            playGame(true);  // User plays first
        } else if (playGame.equalsIgnoreCase("No")) {
            playGame(false);  // Computer plays first
        } else {
            System.out.println("Invalid input. Exiting game.");
        }

        scanner.close();
    }

    public static void playGame(boolean userPlaysFirst) {
        int totalBottles = 21;

        while (totalBottles > 0) {
            System.out.println("The bottles remaining are: " + totalBottles);

            if (userPlaysFirst) {
                int userPicks = getUserInput();
                totalBottles -= userPicks;

                if (totalBottles <= 1) {
                    System.out.println("You will have to pick up the last..you are the loser!");
                    break;  // Exiting the loop when the game is over
                }
            }

            int computerPicks = getComputerPick(totalBottles);
            totalBottles -= computerPicks;

            System.out.println("Computer has picked " + computerPicks);

            if (totalBottles == 1) {
                System.out.println("The bottles remaining are: 1");
                System.out.println(userPlaysFirst ? "Computer wins! You lose." : "You win!");
                break;  // Exiting the loop when the game is over
            }

            if (!userPlaysFirst) {
                int userPicks = getUserInput();
                totalBottles -= userPicks;

                if (totalBottles <= 1) {
                    System.out.println("You will have to pick up the last..you are the loser!");
                    break;  // Exiting the loop when the game is over
                }
            }
        }
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        while (true) {
            try {
                userInput = Integer.parseInt(scanner.nextLine());
                if (userInput >= 1 && userInput <= 4) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }

        return userInput;
    }

    public static int getComputerPick(int remainingBottles) {
    	
        int computerPicks = (remainingBottles % 5 == 1) ? 1 : (remainingBottles - 1) % 5;
        return computerPicks;
    }
}
