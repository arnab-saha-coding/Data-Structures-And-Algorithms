import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static double  average (int[] array){
    double sum = 0;
    for (int i = 0 ; i<array.length ;i ++) {
     sum = sum + array[i];
    }
        return sum/ array.length;
}

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
  
        System.out.println("enter the numbers of elements ");
        int j = sc.nextInt();
              int [] array = new int[j];
           System.out.println("enter the number of arrays  ");
        for (int i= 0; i < j ; i++) {
        array[i] = sc.nextInt();
        }

        double sum = average(array);
          System.out.println(" the average of array is " + sum);
              
        
    }
}
