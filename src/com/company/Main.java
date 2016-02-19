package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter gender: ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.next().equalsIgnoreCase("man"))
            {
                Man man = new Man();
                man.setGender(true);
                System.out.println("Enter first name: ");
                man.setFirst_name(scanner.next());
                System.out.println("Enter second name: ");
                man.setSecond_name(scanner.next());
                System.out.println("Enter height: ");
                man.setHeight(scanner.nextFloat());
                System.out.println("Enter weight: ");
                man.setWeight(scanner.nextFloat());
            }
            if(scanner.next().equalsIgnoreCase("woman"))
            {
                Woman woman = new Woman();
                woman.setGender(false);
                System.out.println("Enter first name: ");
                woman.setFirst_name(scanner.next());
                System.out.println("Enter second name: ");
                woman.setSecond_name(scanner.next());
                System.out.println("Enter height: ");
                woman.setHeight(scanner.nextFloat());
                System.out.println("Enter weight: ");
                woman.setWeight(scanner.nextFloat());
            }
        }
    }



    public static People test(People human1, People human2)
    {
        if(human1.relationships(human2) == null){
            System.out.println("Something got wrong. They parted.");
        }
        if(human1.relationships(human2) != null){human1.relationships(human2);}
        return null;
    }
}
