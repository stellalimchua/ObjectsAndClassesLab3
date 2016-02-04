/**
 * Created by Stella on 1/13/16.
 */


import java.util.Scanner;

public class JavaLab01 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = user_input.nextInt();
        int answer=0;


        for (int i = 1; i < number + 1; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
