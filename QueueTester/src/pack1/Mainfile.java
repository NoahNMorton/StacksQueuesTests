package pack1;

import java.util.Scanner;

/**
 * Author: Noah Morton
 * Date created: 8/25/2016
 * Part of project: QueueTester
 **/
public class Mainfile {
    public static void main(String[] args) {

        System.out.println("Please select a choice:");
        byte choice = Menu();

        switch(choice){
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:

                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }

    }

    /**
     * Displays a menu of choices and returns the choice.
     * @return a byte, the choice of the user
     */
    private static byte Menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Print – Prints all the data in the queue \n" +
                "2. Offer/Add –Adds an item to the back of the queue \n" +
                "3. Peek/Element – Prints the value of the front item in the queue \n" +
                "4. Poll/Remove – Removes the front item from the queue and prints its value \n" +
                "5. Size – prints the number of items in the queue \n" +
                "6. Get – Prints the item in spot X. (X will come from the user) \n" +
                "7. Empty – Prints true when the queue is empty and false when it is not \n" +
                "8. Exit – Closes the program");

        return scanner.nextByte();
    }
}
