
import java.util.*;
public class Array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = {21,23,19,4,67,76,3,20,31,1};

        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }

        System.out.println("enter a number from the list above: ");
        int user = sc.nextInt();
        for (int i = 0; i < values.length; i++){
            if (values [i] == user){
                System.out.println(i +  1);
            }
            
        }

    }
    
}