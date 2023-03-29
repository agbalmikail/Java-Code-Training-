package Examples;

import java.util.Scanner;

public class Exp06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value you want to see the multiplication table of a specific integer: ");
        int num = input.nextInt();
        
        for(int i = num; i >0; i--){
            System.out.println(num + " x " + i + " = " + (i * num));
        }
        input.close();
    }
}
