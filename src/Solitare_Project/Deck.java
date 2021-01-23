package Solitare_Project;

import java.util.Random;

public class Deck{
    private Card [] storage;
    private int top;


    public Deck(){
        char[] suits = {'H', 'D', 'S', 'C'};
        char [] ranks = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
        storage = new Card[52];
        top = 0;

        int count = 0;
        Card C1;
        for(int s = 0; s < suits.length; s++)
            for(int r = 0; r < ranks.length; r++){
                C1 = new Card(ranks[r], suits[s]);
                storage[count++] = C1;
        }
    }
    public void display(){
        for(int i =0; i< 52; i++) {
            if (i % 13 == 0) {
                System.out.print("\n");
            }
            storage[i].display();
            System.out.print(", ");
        }
    }
    public void shuffle(){
        Random rand = new Random();
        Card temp;

        for(int i = 0; i < 52; i++){
            int newC = rand.nextInt(52);
            temp = storage[i];
            storage[i] = storage[newC];
            storage[newC] = temp;

        }
    }
    public Card Deal(){
//        Card C1 = storage[top];
//        top++;
//        return C1;
        return storage[top++];
    }
    public int cardsLeft(){
        if ((52 - top) == 0)
            return 52 - top;
        else
            return 1;
    }
}