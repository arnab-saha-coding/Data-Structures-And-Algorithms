class maxConsecutiveCount {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter=0;
        int conscount=0;
        for (int i =0; i<nums.length;i++){
            if(nums[i]==1){
               counter += 1;
            }
            if(counter>conscount){
                conscount=counter;
            
            }else if (nums[i]==0){
            counter=0;
          }
        }
       return conscount;
    }
 }
