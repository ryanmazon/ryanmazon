import java.util.*;
public class Main {
    public static void main(String[] args) {
        //declare variables
        boolean inGame = true;
        int gameNumber = 1;
        Scanner scanner = new Scanner(System.in);
        P1Random rng = new P1Random();

        //start game loop which only ends once user exits
        while (inGame) {
            int handCount = 0;
            System.out.println("START GAME #" + gameNumber + "\n");
            int cardVal = rng.nextInt(13) + 1;
            if (cardVal < 11 && cardVal >1) {
                System.out.println("Your card is a " + cardVal + "!");
                handCount += cardVal;
            }
            if (cardVal == 1) {
                System.out.println("Your card is a ACE!");
                handCount += 1;
            }
            if (cardVal == 11) {
                System.out.println("Your card is a JACK!");
                handCount += 10;
            }
            if (cardVal == 12) {
                System.out.println("Your card is a QUEEN!");
                handCount += 10;
            }
            if (cardVal == 13) {
                System.out.println("Your card is a KING!");
                handCount += 10;
            }
            handCount += cardVal;
            System.out.println("Your hand is: " + handCount + "\n");
            System.out.println("1. Get another card\n" +
                    "2. Hold hand\n" +
                    "3. Print statistics\n" +
                    "4. Exit\n");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            if (option == 1) {
                while (option == 1) {
                    cardVal = rng.nextInt(13) + 1;
                    if (cardVal < 11 && cardVal > 1) {
                        System.out.println("Your card is a " + cardVal + "!");
                        handCount += cardVal;
                    }
                    if (cardVal == 1) {
                        System.out.println("Your card is a ACE!");
                        handCount += 1;
                    }
                    if (cardVal == 11) {
                        System.out.println("Your card is a JACK!");
                        handCount += 10;
                    }
                    if (cardVal == 12) {
                        System.out.println("Your card is a QUEEN!");
                        handCount += 10;
                    }
                    if (cardVal == 13) {
                        System.out.println("Your card is a KING!");
                        handCount += 10;
                    }
                    System.out.println("Your hand is: " + handCount + "\n");
                    if (handCount > 21) {
                        option = 2;
                        System.out.println("You exceeded 21! You lose.\n");
                        gameNumber++;
                        break;
                    }
                    System.out.println("1. Get another card\n" +
                            "2. Hold hand\n" +
                            "3. Print statistics\n" +
                            "4. Exit\n");
                    System.out.print("Choose an option: ");
                    option = scanner.nextInt();
                }
                if (option == 2) {
                        int dealerVal = rng.nextInt(11) + 16;
                        System.out.println("\nDealer's Hand: " + dealerVal);
                        System.out.println("Your hand is: " + handCount + "\n");
                        if (dealerVal < 22 && handCount < dealerVal) {
                            System.out.println("Dealer wins!\n");
                            gameNumber++;
                        }
                        else if (dealerVal == handCount) {
                            System.out.println("It's a tie! No one wins!\n");
                            gameNumber++;
                        }
                        else {
                            System.out.println("You win!\n");
                            gameNumber++;
                        }
                        break;
                }
            }
            if (option == 2) {

            }
        }
    }
}
