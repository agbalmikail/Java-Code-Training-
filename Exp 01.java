package Examples;

import java.util.Scanner;

public class Exp1{
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.println("Is this number pozitife or negative?");
        double sayi = tara.nextDouble();
        if(sayi < 0){
            System.out.println("The Number is negative");
        }else{
            System.out.println("The Number is pozitive");
        }
        tara.close();
    }
}
