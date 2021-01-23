package Marathon_Project;//Ashur Motlagh
//CECS 274-05
//Prog 1 -Marathon
//Due Date Feb 11, 2020

import java.util.Scanner;

public class marathon {
    public static void formatTime(double user, String name, double eliud) {
        double userDom = user; // creating a copy of user
        double eliudDom = eliud; // creating a copy of eliud
        System.out.println("\nPace Table"); // setting up the table
        System.out.println("Mile\t\t\t Eliud\t\t  " + name); // setting up the table

        for(int i = 0; i < 26; i++) { // looping for the comparison table
            int userHour = (int) (user / 3600);
            int userMin = (int) (user / 60) % 60 ;
            int userSec = (int) user % 60;

            int eliudHour = (int) (eliud / 3600);
            int eliudMin = (int) (eliud / 60) % 60;
            int eliudSec = (int) eliud % 60;

            System.out.printf(i+1 + "\t\t\t\t" +"%2d:%02d:%02d \t %2d:%02d:%02d%n", eliudHour,eliudMin,eliudSec,userHour,userMin,userSec);
            user = user + userDom; // incrementing the user's pace
            eliud = eliud + eliudDom; // incrementing Eliud's pace

            if(i ==25) { // calculating the last 385 yards
                user = userDom * 26.21875;
                eliud = eliudDom * 26.21875; 
                userHour = (int) (user / 3600);
                userMin = (int) (user / 60) % 60 ;
                userSec = (int) user % 60;

                eliudHour = (int) (eliud / 3600);
                eliudMin = (int) (eliud / 60) % 60;
                eliudSec = (int) eliud % 60;
                System.out.printf("26m, 385y" + "\t\t" +"%2d:%02d:%02d \t %2d:%02d:%02d", eliudHour,eliudMin,eliudSec,userHour,userMin,userSec);
            }
        }
    }
    public static void main(String [] args){
        // creating variables for future use
        Scanner sc = new Scanner(System.in);
        String name;
        double distance;
        int hour;
        int min;
        int sec;

        System.out.println("Welcome to the Los Angeles Marathon Training Program");
        System.out.print("What is your first name? ");
        name =sc.nextLine();
        System.out.print("How far did you run today? ");
        distance = sc.nextDouble();
        System.out.println("How long did it take? ");
        System.out.print("How many hours: ");
        hour = sc.nextInt();
        System.out.print("How many minutes: ");
        min = sc.nextInt();
        System.out.print("How many seconds: ");
        sec = sc.nextInt();

        // process of  getting the total number of seconds from users input and the pace
        int totalSeconds = (hour * 3600) + (min * 60) + sec;
        double pace = (double) totalSeconds / distance;
        int paceMin = (int) (pace / 60) ;
        int paceSec = (int) pace - (paceMin*60);

        // process of getting the total Marathon_Project.marathon time and the predicted Marathon_Project.marathon time for the user.
        int totalTime = (int)(pace * 26.21875);
        int paceHour = totalTime / 3600;
        int paceMin2 = (totalTime / 60) % 60;
        int paceSec2 = totalTime % 60;

        // process of calculating the fastest human Marathon_Project.marathon time (Eliud Kipchoge)
        int eliudHour = 1 * 3600;
        int eliudMin = 59 * 60;
        int eliudSec = 40;
        int eliudTotal = eliudHour + eliudMin + eliudSec;
        double eliudPace = eliudTotal / 26.21875;

        System.out.println("\nHi "+ name);
        System.out.printf("Your pace is %2d:%02d%n", paceMin,paceSec);
        System.out.printf("At this rate your Marathon_Project.marathon time will be %2d:%02d:%02d%n", paceHour,paceMin2,paceSec2);
        System.out.println("Good luck with your training!");

        formatTime(pace,name,eliudPace); // passing variables to new method / function
    }
}