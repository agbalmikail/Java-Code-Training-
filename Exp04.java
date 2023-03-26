package Examples;

import java.util.Scanner;

public class Exp04 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.println("Give a year");
        int year = tara.nextInt();

        boolean leapYear = (year % 4 == 0 && year % 400 == 0);

        System.out.println("Is it leap year? " + leapYear);

        tara.close();
    }
}
