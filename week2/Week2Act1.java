package week2;

public class Week2Act1 {
    public static void main(String[] args) {
        
    
        int[] theaterRow = {0,0,0,1,0,0,0,0};

        

        for(int r = 0; r < theaterRow.length; r++ ){
            System.out.print(theaterRow[r] + " "); 
        }

        int availaleSeats = 0;
        for (int i = 0; i < theaterRow.length; i++){
            if (theaterRow[i] == 0){
                availaleSeats++;
            }
        }
        System.out.println("\nThere are " + availaleSeats + " left.");

        
        
    }
}
