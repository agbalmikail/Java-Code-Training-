package Examples;

import java.util.Scanner;

public class Exp07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive Integer and this number must be less than 10.000.000.000 ");
        long num = input.nextLong();

        if(num < 0 || num > 10000000000L){
            System.out.println("You entered a wrong value");
            return;
        }

        int sum = 0;
        int digitsNumber = 0;
        while(num !=0){
            digitsNumber++;
            sum += num %10;
            num= num /10;
        }
        System.out.println("The value has " + digitsNumber + " digits");
        System.out.println("The sum of the digits number is: " + sum);

        input.close();
    }
}
