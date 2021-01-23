//Ashur Motlagh
//CECS 274-05
//Prog 4 - Human Pyramid
//Due Date: April 21
package RecursionProject;
import java.util.Scanner;
import java.util.ArrayList;

public class Recursion {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int Maxrow;
        String con ;
        System.out.println("Welcome to the Human Pyramid");
        do{
            ArrayList<Integer> ar = new ArrayList<>();
            System.out.print("How tall is your Pyramid? ");
            Maxrow = sc.nextInt();

            for(int row = 1; row <= Maxrow; row++)
                for(int col = 1; col <= row; col++)
                    ar.add((int) weightOnBack(row,col));

            display(ar,Maxrow);

            System.out.print("Do you want to run again? (y/n) ");
            con = sc.next();
        }while (con.equals("y"));
    }

    public static double weightOnBack(int r, int c){
        //base case
        if(r == 1 && c==1)
            return 0;
        else if (r == c)
            return 75 +(weightOnBack(r-1,c-1)/2);
        else if (c == 1)
            return 75 +(weightOnBack(r-1,c)/2);

        //general case
        else
            return 75*2 + (weightOnBack(r-1,c-1)/2 + weightOnBack(r-1,c)/2);
    }

    public static void display(ArrayList<Integer> ArrLst, int r){
        System.out.println("Here is the graph of your pyramid showing the weight each person is holding:");
        int placeHolder = 0;
        for (int i = 1; i <= r; i++) {
            for(int k = 0; k < (r-i); k++) {
                System.out.print("   ");
            }
            for(int a = 0; a < i; a++)
                System.out.printf("(%4d)",ArrLst.get(placeHolder++));
            System.out.println();
        }
    }
}
