package Solitare_Project;

public class Card{
    private char suit;
    private char rank;

    public Card(char r, char s){
        rank = r;
        suit =s;
    }
    public void display(){
        if (getRank() == 'T'){
            System.out.print("10" + getSuit());
        }
        else {
            System.out.printf("%s%s", getRank(), getSuit());
        }
    }
    public int getValue(){
        if (rank == 'T' || rank == 'J' || rank == 'K' || rank == 'Q')
            return 10;
        else if (rank == 'A')
            return 1;
        else{
            int num = rank;
            return num - 48;
        }
    }
    public char getRank(){
        Card c = new Card(rank, suit);
        return c.rank;
    }
    public char getSuit(){
        Card c = new Card(rank, suit);
        return c.suit;
    }
}
