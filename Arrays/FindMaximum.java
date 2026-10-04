public class FindMaximum {

    public static int getMaximum(int arr[]) {
        int maxi = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        System.out.println(getMaximum);
    }
}
