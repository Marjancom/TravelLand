/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelland;

import java.util.Scanner;

/**
 *
 * @author qa-popodne
 */
public class Travel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Car car = new Car(5,10);
//        car.PassangersOut(7);
//        car.GetPassangersIn(2);
//        System.out.println(String.format("Posljednja stanica molim da svih %d putnika napusti autobus !!!!",car.numOfPassangers));      
          Scanner reader = new Scanner(System.in);
          int inputConsole;
            System.out.println("Dobrodosli u aplikaciju autobus");
        do {
            System.out.println("Molimo unesite jedan od brojeva");
            System.out.println("1.Zelim da napravim autobus");
            System.out.println("2.Zelim da vozim autobus");
            System.out.println("3.Napusti program");
         
            inputConsole=reader.nextInt();;
            if (inputConsole==1)
            {
                System.out.println("Zelim da izaberem autobus ");
            }          
            if (inputConsole==2)
            {                   
                System.out.println("Uneli ste 2");
            }
         
        } while (inputConsole!=3);
           reader.close();

//        defaultCar.GetFields();
//        Car novi = new Car("audi", 250, 1000,"BG1069TC",188,25,55,10);
//        novi.GetFields();       
//        Scanner reader = new Scanner(System.in);  // Reading from System.in
//        System.out.println("Enter a number: ");
//        int n = reader.nextInt(); // Scans the next token of the input as an int.
//        System.out.println("Uneli ste: " + n);
//
////        once finished
//        reader.close();
    }   
}