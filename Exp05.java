package Examples;

import java.util.Scanner;

public class Exp05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the natural number you want to see the term n and its sums.: ");
        int num = input.nextInt();

        System.out.print("The natural numbers are: ");

        for(int i = num; 0 < i; i--){
            sum = sum + i;
            System.out.print(i);
            if(i !=1){
                System.out.print(",");
            }
        }
        System.out.println("\nThe sum of the natural numbers " + sum);

        input.close(); // if i use vscode, im write this code

    }
}
