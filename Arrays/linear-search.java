public class ArrayProblems {

    static boolean findTarget(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7, 9};

        boolean ans = findTarget(arr, 90);

        System.out.println(ans);
    }
}
