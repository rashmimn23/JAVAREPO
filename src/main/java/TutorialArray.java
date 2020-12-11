public class TutorialArray {
    public static void main(String[] args) {

        String[] places = new String[3];

        places[0] = "Mauritius";
        places[1] = "Thailand";
        places[2] = "Indonesia";

        for (int i = 0; i < places.length; i++) {
            System.out.println("The place we visited is " + places[i]);
        }
/*
        String[] names = {"Rashmi", "Ravindra","Kunda"};

        for(String name:names){
            System.out.println(name);
        }

 */
        int[][] num = {{2, 3, 5}, {89, 65}, {789, 654, 123, 963}};
        System.out.println(num[2][1]);

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
