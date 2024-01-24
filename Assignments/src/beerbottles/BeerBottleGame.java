//package beerbottles;
//
//import java.util.Scanner;
//
//public class BeerBottleGame {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("There are 21 beer bottles...");
//        System.out.println("There are 2 players - Computer and you.");
//        System.out.println("At a time, each one can pick up any no. of bottles between 1 and 4 (inclusive)");
//
//        System.out.print("Will you like to play first? ");
//        String playFirst = scanner.nextLine();
//
//        if (playFirst.equalsIgnoreCase("Yes")) {
//            playGame();
//        } else {
//            
//            playGame();
//        }
//
//        scanner.close();
//    }
//   
//    
//    public static void playGame() {
//        int totalBottles = 21;
//
//        while (totalBottles > 0) {
//            System.out.println("The bottles remaining are: " + totalBottles);
//            System.out.print("How many you would like to pick up? ");
//            int userPicks = getUserInput();
//
//            totalBottles -= userPicks;
//
//            if (totalBottles <= 0) {
//                System.out.println("You will have to pick up the last..you are the loser!");
//                break;  // Exiting the loop when the game is over
//            }
//
//            int computerPicks = getComputerPick(totalBottles);
//            totalBottles -= computerPicks;
//            if (totalBottles == 1) {
//            System.out.println("Computer has picked " + computerPicks);
//            }
//            if (totalBottles == 1) {
//                System.out.println("The bottles remaining are: 1");
//                System.out.println("Computer wins! You lose.");
//                break;  // Exiting the loop when the game is over
//            }
//        }
//    }
//
//    public static int getUserInput() {
//        Scanner scanner = new Scanner(System.in);
//        int userInput = 0;
//
//        while (true) {
//            try {
//                userInput = Integer.parseInt(scanner.nextLine());
//                if (userInput >= 1 && userInput <= 4) {
//                    break;
//                } else {
//                    System.out.println("Please enter a number between 1 and 4.");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter a number between 1 and 4.");
//            }
//        }
//
//        return userInput;
//    }
//
//    public static int getComputerPick(int remainingBottles) {
//        if (remainingBottles == 1) {
//            System.out.println("The bottles remaining are: 1");
//            System.out.println("Computer wins! You lose.");
//            return 1;  // Computer picks the last bottle
//        }
//
//        //int computerPicks = (remainingBottles - 1) % 5 + 1;
//        int computerPicks = (remainingBottles - 1) % 5;
//        if (computerPicks == 0) {
//            computerPicks = 1;
//        }
//
//        return computerPicks;
//    }
//}
//
