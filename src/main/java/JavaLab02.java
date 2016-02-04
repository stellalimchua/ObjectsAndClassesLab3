/**
 * Created by Stella on 1/13/16.
 */

import java.util.Scanner;

public class JavaLab02 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String first_name;
        System.out.print("Enter your first name:");
        first_name = user_input.next();

        if(first_name.equals("Alice")) {
            System.out.println("Hello Alice");
        } else if (first_name.equals("Bob")) {
            System.out.println("Hello Bob");
        } else {
            System.out.println("Bye, Felicia.");
        }

    }
}