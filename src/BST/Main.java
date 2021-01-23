//Ashur Motlagh
//CECS 274-05
//Prog 5 - Binary Search Tree
//Due Date: May 7 2020
package BST;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        BST tree = new BST();
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int userInput;

        do{
            userInput = menu();
            switch(userInput){
                case 1:
                    tree = new BST();
                    System.out.println("Created an Empty Tree");
                    break;

                case 2:
                    System.out.print("Enter the number you want to add: ");
                    int user = in.nextInt();
                    tree.add(user);
                    break;

                case 3:
                    for(int i = 0; i<= 20; i++)
                        tree.add( rand.nextInt(1001));
                    break;

                case 4:
                    tree.display();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("The Root is: "+tree.getRoot());
                    System.out.printf("\nThe Height is: %d", tree.height());
                    System.out.printf("\nThe number of items in the BST are: %d", tree.size());
                    System.out.printf("The Min is: %d", tree.min());
                    System.out.printf("\nThe Max is: %d", tree.max());
//                    System.out.printf("\nThe Sum of the values are: %d", tree.sum());
                    System.out.printf("\nThe Average of the values are: %d", tree.sum()/tree.size());
                    break;
            }

        }while(userInput != 6);

    }
    public static int menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n-----------------------------------------------\n1) Create Empty BST \n2) Add a number to the BST \n3) Add 20 random numbers to your BST \n4) Display the BST in sorted order \n5) Show Stats \n6) Exit");
        System.out.print("Please select the operation: ");
        int option = in.nextInt();
        System.out.println("-----------------------------------------------");
        return option;
    }
}
