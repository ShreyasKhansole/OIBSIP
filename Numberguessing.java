
//Number guessing Program
/* Hello Everyone My Name is Shreyas Khansole i am complte code number guessing useing java.
 
  */
import java.util.*;

import java.io.*;

public class Numberguessing {
    public static void Number_guessing() {
        Scanner sc = new Scanner(System.in);
        int num = 1 + (int) (100 * Math.random());
        int rounds = 5;
        int guess, i, again, Score = 0;

        System.out.println("Welcome to Game");
        System.out.println("plz input any number 1 to 100 ");

        for (i = 0; i <= 4; i++) {
            System.out.print("Try to Guess number=");
            guess = sc.nextInt();

            if (guess > 100 || guess < 0) {
                System.out.println("Sorry!! You have to enter number between 1 to 100");
            } else if (guess == num) {
                System.out.println("congratulations!! Your Guess is Right");
                Score += 10;
                System.out.println("Youe Score is 10 out of" + Score);
            } else if (guess > num && i != rounds - 1) {
                System.out.println("oops!!! Number is less than" + guess);
            } else if (guess < num && i != rounds - 1) {
                System.out.println("oops!!! Number is Greater than" + guess);
            }
        }

        if (rounds == i) {
            System.out.println("you have completed round");
            System.out.println("The Number is" + num);
            System.out.println("Do you want to continue");
            System.out.println("Enter 1 for countinue");
            again = sc.nextInt();

            if (again == 1) {
                Number_guessing();

            } else {
                System.out.println("Thank You!! See You again...");
            }
        }
        sc.close();

    }

    public static void main(String args[]) {
        Number_guessing();
    }

}
