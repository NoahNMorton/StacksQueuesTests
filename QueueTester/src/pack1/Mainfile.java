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
        Scanner scan = new Scanner(System.in);
        Queue<Integer> mqueue = new Queue();

        switch(choice){
            case 1: //print all data in queue
                for (int i = 0; i<mqueue.size();i++) {
                    System.out.println(mqueue.get(i));
                }
                break;
            case 2: //offer/add item to back of queue
                System.out.println("Please enter an integer.");
                Integer input = scan.nextInt();
                mqueue.offer(input);
                break;
            case 3: //peek - prints first item in queue
                break;
            case 4: //poll - remove front item and print
                break;
            case 5: //size print size of queue

                break;
            case 6: //get print item in spot provided
                break;
            case 7: //prints if queue empty
                break;
            case 8: //exit game
                System.exit(0);
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
