public class Tutorial2 {

    public static void main(String[] args) {

        /* Start While Loop */
        int count = 0;
        while (count < 5) {
            System.out.println("Happy" + count);
            count = count + 1;
        }
        /* End While Loop */

        /* Start For Loop */
        for (int i = 10; i > 6; i--) {

            System.out.println("Welcome" + ' ' + i);
        }
        /* End For Loop */

        /* START if*/
        int input = 5;
        if (input ==2) {
            System.out.println("The input value " + input + " is equal to 2");
        } else if (input > 5) {
            System.out.println("The input value " + input + " is greater than 5");
        } else {
            System.out.println("The value of input is " + input);
        }
        /* End IF */
    }
}

