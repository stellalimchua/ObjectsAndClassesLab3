/**
 * Created by Stella on 1/14/16.
 */

import java.util.Scanner;
import java.math.BigInteger;

public class JavaLab03 {
    public static void main(String[] args){
        int c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = user_input.nextInt();
        int answer=0;

        String sumOrProduct;
        System.out.print("Sum or product?: ");
        sumOrProduct = user_input.next();

        if (sumOrProduct.equals("sum")) {
            for (int i = 1; i < number + 1; i++) {
                answer += i;
            }
            System.out.println(answer);
        } else if (sumOrProduct.equals("product")) {
            for (c = 1; c <= number; c++) {
                fact = fact.multiply(inc);
                inc = inc.add(BigInteger.ONE);
            }
            System.out.println(number + "!=" + fact);
        } else {
            System.out.println("I SAID enter sum or product.");
        }



    }
}
