package com.practice.javatopics;

import java.util.Scanner;

public class ConditionalStatements {
    /*
    1. Prompt user to enter age.
    2. Read age input.
    3. If age < 0 or age > 120, display "Invalid age".
    4. Otherwise, display age category: child, teenager, adult, or senior citizen.    * */
    private final Scanner scanner; // Declaring the Scanner object at the class level
    public ConditionalStatements(){ // Constructor to initialize the scanner object
        scanner = new Scanner(System.in);
    }
    public void ageModifier(){
        System.out.println("Enter the Age: ");
        int age = scanner.nextInt();
        if(age<0){
            System.out.println("Invalid age! Age cannot be negative.");
        }else if(age>120){
            System.out.println(("Invalid age! Age cannot be greater than 120."));
        }else{
            if(age<13){
                System.out.println("You are a child");
            }else if(age<20){
                System.out.println("You are a teenager");
            }else if(age<65){
                System.out.println(("You are a adult"));
            }else{
                System.out.println(("You are a senior citizen"));
            }
        }

    }
    public void closeScanner(){
        scanner.close();
    }
    public static void main(String[] args) {
        ConditionalStatements ageCheck = new ConditionalStatements();
        ageCheck.ageModifier();
        ageCheck.closeScanner();
    }
}
