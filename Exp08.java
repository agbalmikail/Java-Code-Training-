package Examples;

import java.util.Scanner;

public class Exp08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number you want to compare");
        int firstNum = input.nextInt();
        System.out.println("Enter the second number you want to compare");
        int secondNum = input.nextInt();
        System.out.println("Enter the third number you want to compare");
        int thirdNum = input.nextInt();

        if(firstNum == secondNum && secondNum == thirdNum){
            System.out.println("All numbers are eqaul");
        }else if(firstNum == secondNum || secondNum == thirdNum || firstNum == thirdNum){
            System.out.println("Neither all are equal or different");
        }else{
            System.out.println("All numbers are different");
        }
        input.close();
    }
}
