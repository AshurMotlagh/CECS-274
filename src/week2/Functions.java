package week2;

public class Functions {
    public static int add2(int x1, int x2){
        return x1+x2;
    }

    public static void main(String [] args){
        // static makes it so the method or function does not belong to a class
        int sum;
        sum = add2(3,6); // referencing the add2 function
        System.out.println("sum" + sum);
    }
}
