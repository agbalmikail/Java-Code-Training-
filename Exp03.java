package Examples;

import java.util.Scanner;

public class Exp03 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.println("Which day would you learn?");
        int day = tara.nextInt();

        switch(day){
            case 1:
            System.out.println("It's Monday");break;
            case 2:
            System.out.println("It's Tuesday");break;
            case 3:
            System.out.println("It's Wednesday");break;
            case 4:
            System.out.println("It's Thursday");break;
            case 5:
            System.out.println("It's Friday");break;
            case 6:
            System.out.println("It's Saturday");break;
            case 7:
            System.out.println("It's Sunday");break;
        }
        tara.close();
    }
}
