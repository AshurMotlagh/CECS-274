//Ashur Motlagh
//CECS 274-05
//Prog 2 - Solitaire Prime
//Due Date: March 3, 2020
package Solitare_Project;
import java.util.Scanner;

public class solitaire {
    public static void main(String [] args) {
        Deck myDeck = null; // making the initial deck blank
        int choice;

        do{
            choice = menu();
            if (choice > 6 || choice < 0){
                System.out.println("Invalid choice start over");
                continue;
            }
            switch (choice) {
                case 1:
                    myDeck = new Deck(); // making a new deck
                    System.out.println("\nA new deck has been created.");
                    break;
                case 2:
                    myDeck.display(); // displaying the deck
                    break;
                case 3:
                    myDeck.shuffle(); // shuffling the deck 52 times
                    System.out.println("\nThe deck has been shuffled.");
                    break;
                case 4:
                    playSolitaire(myDeck); // play the game
                    break;
                case 6:
                    int win = 0; // counter
                    int lose = 0; // counter

                    for( int i =0; i< 1000; i++){
                        myDeck = new Deck();
                        myDeck.shuffle();
                        if(playSolitaire(myDeck) == true)
                            win ++;
                        else
                            lose++;
                    }
                    System.out.println(("In 1000 games, you won: "+win + " and lost: "+lose));
                    break;
            }

        } while (choice != 5);
        System.out.println("Thank you for playing the game");
    }

    public static int menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to Solitaire Prime! \n---------------------------- \n1. New Deck \n2. Display Deck \n3. Shuffle Deck \n4. Play Solitaire Prime \n5. Exit \n6). Simulate 1000 games");
        System.out.print("Please select the operation: ");
        int option = in.nextInt();
        System.out.println("----------------------------");
        return option;
    }

    public static boolean isPrime(int x){
        if(x == 1){
            return false;
        }
        for(int i = 2; i <= x/2; i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean playSolitaire(Deck d){
        int pile = 0;
        d = new Deck();
        d.shuffle();
        for (int i = 0; i < 52; i++){
            Card c = d.Deal();
            c.display();
            System.out.print(", ");
            pile += c.getValue();

            if (isPrime(pile)){
                System.out.println("Prime: " + pile);
                pile = 0;
            }
        }
        if(pile == 0 && d.cardsLeft() == 0) {
            System.out.println("You win");
            return true;

        }
        else{
            System.out.println("you lose");
            return false;
        }
    }
}