//Ashur Motlagh
//CECS 274-05
//Prog 3 - Linked List
//Due Date: March 26
package Linked_List;

import java.util.Scanner;
import java.util.Random;

public class mainll {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
        String choice;

        for(int j = 0; j < 100; j++){
            String ght;
            ght = randomWord();
            L1.add(ght);
        }
        L1.display();
        do {
            choice = menu(L1);
            System.out.println("-----------------------------------------------------------------");
            switch (choice) {
                case "A":
                    String nW;
                    nW = randomWord();
                    L1.add(nW);
                    L1.display();
                    System.out.println("\n" + nW + " was added at location " + L1.find(nW));
                    break;
                case "D":
                    L1.delete();
                    L1.display();
                    break;
                case "F":
                    Scanner in = new Scanner(System.in);
                    System.out.print("Search for a word: ");
                    String user = in.nextLine();
                    if (L1.find(user) == 0)
                        System.out.println(user + " not found");
                    else
                        System.out.println(user + " was found at "+ L1.find(user));
                    break;
            }
        } while (!choice.equals("Q"));
    }

    public static String menu(LinkedList x) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nA)dd, (D)elete, (F)ind, (Q)uit List Size: "+ x.size);
        String option = in.nextLine();
        return option.toUpperCase();
    }

    public static String randomWord() {
        String let;
        Random rand = new Random();
        String[] Constant = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        String[] Vowel = {"a", "e", "i", "o", "u"};
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            if (i == 1){
                let = Vowel[rand.nextInt(5)];
                str.append(let);
            }
            let = Constant[rand.nextInt(21)];
            str.append(let);
        }
        String word = str.toString();
        return word;
    }
}