package Quiz;

import java.util.Random;
public class Quiz2 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        LoadArray(numbers);
        double ave = arrayAverage(numbers);
        System.out.println(ave);
    }

    public static void LoadArray(int[] n) {
        int x = 0;
        Random rand = new Random();
        for (int i = 0; i < n.length; i++) {
            x = rand.nextInt(51) + 50; //max - min +1    50-100
            n[i] = x;
        }
    }

    public static double arrayAverage(int[] z) {
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            sum += z[i];
        }
        double retValue;
        retValue = (double) sum / 20;
        return retValue;
    }
}
