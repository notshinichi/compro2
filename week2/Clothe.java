package week2;

public class Clothe {
    public static void main(String[] args) {

        String [] clothTypes = {"shirt", "pants"};

        //2 ways to make 2d arrays

        //if you don't know the data firsthnad yourself. just structure

        String [][] clothColors = new String [2][3];

        //first row
        clothColors[0][0] = "red";
        clothColors[0][1] = "blue";
        clothColors[0][2] =  "green";

        //second row
        clothColors[1][0] = "orange";
        clothColors[1][1] = "yellow";
        clothColors[1][2] = "violet";

        //if the data is alr known
        /*String[][] clothColors2 = {
            {"red", "blue", "green"},
            {"orange", "yellow", "violet"}
        };*/

        for(int r = 0; r < clothColors.length; r++){
            System.out.println(clothTypes[r]);
            for (int c = 0; c < clothColors[r].length; c++){
                System.out.printf("%-7s", clothColors[r][c]);
            }
            System.out.println();
        }
    }
    
}