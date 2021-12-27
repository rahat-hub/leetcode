class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target == nums[i] + nums[j]){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}


/*

1 2 3 54 2 3 55 5 41 2 4 45 60 6 21 4 8 18 99 74 2 2 

*/