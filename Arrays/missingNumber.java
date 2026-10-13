class misssingNumber {
    // Returns the missing element.
    public int missingNumber(int[] nums) {
        boolean[] present = new boolean[nums.length + 1]
        for (int value : nums) {
            present[value] = true;
        }

        for (int value = 0; value <= nums.length; value++) 
            if (!present[value]) {
                return value;
            }
        }

        return -1;
    }
}
class Main {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        Solution sol = new Solution();

        System.out.println(sol.missingNumber(nums));
    }
}
