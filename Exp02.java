package Examples;

import java.util.Scanner;

public class Exp02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the  first number:");
        int firstNum = input.nextInt();
        System.out.println("Enter the  second number:");
        int secondNum = input.nextInt();
        System.out.println("Enter the third number:");
        int thirdNum = input.nextInt();

        if(firstNum > secondNum && firstNum > thirdNum){
            System.out.println("The Greatest number is: " + firstNum);
        }else if(secondNum > firstNum && secondNum > thirdNum){
            System.out.println("The Greatest number is:: " + secondNum);
        }else if(thirdNum > firstNum && thirdNum > secondNum){
            System.out.println("The Greatest number is:: " + thirdNum);
        }
        input.close();
    } 
}
