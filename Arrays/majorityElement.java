class majorityElement {
    public int majorityElement(int[] nums) {
        int x =0, majority = 0;
        for (int i =0;i<nums.length;i++){
            if (x==0){
             majority =nums[i];
            }
        if(nums[i]== majority){
        x++;
        }else{
        x--;
         }
        }
    return majority;
  }
}
