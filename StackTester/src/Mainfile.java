import java.util.Scanner;

/**
 * Author: Noah Morton
 * Date created: 8/25/2016
 * Part of project: QueueTester
 **/
@SuppressWarnings("WeakerAccess")
public class Mainfile {
    public static void main(String[] args) {
        do {
            System.out.println("Please select a choice:");
            byte choice = Menu(); //display menu and get choice.
            Scanner scan = new Scanner(System.in);
            Stack<Integer> mstack = new Stack<>();

            switch (choice) {
                case 1: //print all data in stack
                    System.out.println("printing");
                    for (int i = 0; i < mstack.size(); i++) {
                        System.out.println(mstack.get(i));
                    }
                    System.out.println("done printing");
                    break;
                case 2: //size
                    System.out.println("The size of the stack is "+mstack.size());
                    break;
                case 3: //empty
                    String isEmpty = (mstack.empty()) ? "is" : "is not";
                    System.out.println("The stack " + isEmpty + " empty.");
                    break;
                case 4: //get
                    System.out.println("Get from what index?");
                    System.out.println("The value is: " + mstack.get(scan.nextInt()));
                    break;
                case 5: //add to top of stack
                    System.out.println("What should be added?");
                    mstack.push(scan.nextInt());
                    break;
                case 6: //peek
                    System.out.println("The top value is: "+mstack.peek());
                    break;
                case 7: //pop
                    System.out.println(mstack.pop());
                case 8: //exit game
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (true);
    }

    /**
     * Displays a menu of choices and returns the choice.
     *
     * @return a byte, the choice of the user
     */
    private static byte Menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Print – Prints all the items on the stack\n"
                + "2. Size – Prints the number of items on the stack\n"
                + "3. Empty – Prints if stack is empty\n"
                + "4. Get – Prints the item in spot X of the stack.\n"
                + "5. Push –Adds an item to the top of the stack\n"
                + "6. Peek – Prints the value of the top item in the stack\n"
                + "7. Pop – Removes the top item from the stack and prints its value\n"
                + "8. Exit – Closes the program");

        return scanner.nextByte();
    }
}
