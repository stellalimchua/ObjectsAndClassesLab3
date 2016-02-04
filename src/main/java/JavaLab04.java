/**
 * Created by Stella on 1/14/16.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class JavaLab04 {
    public static void main(String[] args){
        Integer x = 69;

        ArrayList<Integer> numOfTries = new ArrayList<Integer>();

// if arraylist does not contain number, arraylist.add number.
// then count = arraylist.size
        Scanner user_input = new Scanner(System.in);

        System.out.print("Guess the secret number between 1-100: ");
        Integer number = user_input.nextInt();

        while (number != x) {
            if (number > x) {
                System.out.println("Too high. Guess again.");
                System.out.print("Guess the secret number between 1-100: ");
                number = user_input.nextInt();
            } else {
                System.out.println("Too low. Guess again.");
                System.out.print("Guess the secret number between 1-100: ");
                number = user_input.nextInt();
            }
            numOfTries.add(number);
        }

        if (number == x) {
        System.out.println("You guessed correctly! WUUTTTT");}

        Integer count = numOfTries.size() + 1;

        System.out.println("It took you " + count + " tries.");

        }

}
