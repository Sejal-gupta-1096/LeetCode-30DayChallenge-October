class Pair{
    int freq,index;
}

class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer , Pair> map = new HashMap<>();
        HashSet<String> ans = new HashSet<>();

        
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                Pair p = map.get(nums[i]);
                p.freq++;
                map.put(nums[i] , p);
            }else{
                Pair p = new Pair();
                p.index = i;
                p.freq = 1;
                map.put(nums[i] , p);
            }
        }
        
       
        for (Integer key : map.keySet())  {
            if(map.containsKey(key+k) && (map.get(key+k).index != map.get(key).index || map.get(key).freq > 1)){
                int sum = key+k;
                String str = key + " " + sum;
                ans.add(str);
            }
        }
        
        return ans.size();
    }
}