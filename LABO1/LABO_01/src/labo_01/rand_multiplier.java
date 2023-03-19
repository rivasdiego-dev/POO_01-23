package labo_01;

import java.util.Scanner;
import java.util.Random;

public class rand_multiplier {

    public void start() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int randNum = rand.nextInt(10) + 1;

        int result = num * randNum;

        System.out.println("El resultado de multiplicar " + num + " por " + randNum + " is: " + result);
    }
}
