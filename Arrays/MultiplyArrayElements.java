import java.util.Arrays;
public class Main {
public static int[] multiply(int[] array){
    int m =10;
    int[] newarray = new int[array.length];
    for (int i = 0 ; i<array.length ;i ++) {
     newarray[i] = m * array[i];
    }
        return newarray;
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
            int [] result = multiply(array);
            System.out.println(Arrays.toString(result));
        
    }
}
