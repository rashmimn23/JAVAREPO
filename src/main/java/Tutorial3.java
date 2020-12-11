import java.util.Scanner;

public class Tutorial3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter input ");

        // String value = input.nextLine();
               /* Start Do while
        int value;
         do {
            value = input.nextInt();
            System.out.println("You entered " + value);
        }
        while (value != 5);
        System.out.println("Got number 5");
        End Do while */

        String text = input.nextLine();

        switch (text) {

            case "restart":
                System.out.println("Server restarted");
                break;
            case "start":
                System.out.println("Server started");
                break;
            case "stop":
                System.out.println("Server stopped");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }


    }
}

