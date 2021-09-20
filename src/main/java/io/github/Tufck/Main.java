package io.github.Tufck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        new Main();
    }


    public Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int numberOne = scanner.nextInt();

        System.out.print("Enter second Number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Enter third number? y / n");
        String reply = scanner.next();

        Boolean threeTriggered = false;
        int numberThree = 0;

        if (reply.equals("y")){
            System.out.print("Enter third Number: ");
            numberThree = scanner.nextInt();
            threeTriggered = true;
        }

        int answer;

        if (threeTriggered) {
            answer = numberOne + numberTwo + numberThree;
            System.out.print(answer);
        } else if (!threeTriggered) {
            answer = numberOne + numberTwo;
            System.out.print(answer);
        }


    }

}


