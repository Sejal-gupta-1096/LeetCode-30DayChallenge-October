class Solution {
    public int rob(int[] nums) {
       
        int[] memo = new int[nums.length+1];
        
        for(int i = 0 ; i < memo.length ; i++){
            memo[i] = -1;
        }
        
        if(nums.length == 1) return nums[0]; 
        
        int res1 = rob(nums , 0 , nums.length-2 , memo);
        
        for(int i = 0 ; i < memo.length ; i++){
            memo[i] = -1;
        }
        
        int res2 = rob(nums , 1 , nums.length-1 , memo);
        
       return Math.max(res1 , res2);
    }
    
    public int rob(int[] nums , int si , int ei , int[] memo){
        
        if(si > ei){
            return 0;
        }
        
        if(memo[si+1] != -1){
            return memo[si+1];
        }
        
        int included = nums[si] + rob(nums , si+2 , ei , memo);
        int excluded = rob(nums , si+1 , ei , memo);
        
        memo[si+1] = Math.max(included , excluded);
        return memo[si+1];
    }
}