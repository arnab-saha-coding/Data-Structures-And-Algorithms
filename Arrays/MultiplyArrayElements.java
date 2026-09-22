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
        int[] array ={2,3,4,1};
            int [] result = multiply(array);
            System.out.println(Arrays.toString(result));
        
    }
}
