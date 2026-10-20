class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>dp=new HashSet<>();
        for (int i =0;i<nums.length;i++){
            if(dp.contains(nums[i])){
                return true;
            }
            dp.add(nums[i]);
        }
         return false;
    }
}
