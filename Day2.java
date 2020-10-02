class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Set<List<Integer>> output = new HashSet<>();
        List<Integer> sublist = new ArrayList<>();
        
        combinationSum(candidates , target , 0 , candidates.length-1 , output , sublist);
        List<List<Integer>> outputL = new ArrayList<>();
        outputL.addAll(output);
        return outputL;
    }
    
    public void combinationSum(int[] candidates, int target , int si , int ei , Set<List<Integer>> output , List<Integer> sublist){
        
        
        if(target == 0){
            List<Integer> list = new ArrayList<>(sublist);
            output.add(list);
            return;
        }
        
        if(si > ei || target < 0){
            return;
        }
        
        
        
        int num = candidates[si];
        sublist.add(num);
        combinationSum(candidates , target-num , si , ei , output , sublist);
        sublist.remove(sublist.size()-1);
        
         sublist.add(num);
        combinationSum(candidates , target-num , si+1 , ei , output , sublist);
        sublist.remove(sublist.size()-1);
        combinationSum(candidates , target , si+1 , ei , output , sublist);
        
        
    }
    
}