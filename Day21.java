class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        ArrayList<Integer> list = new ArrayList<>();
         for(int text:asteroids) {
         list.add(text);
      }
        
        int i = list.size()-1;
        while(i >= 0){
            int num = list.get(i);
            if(list.get(i) > 0 && i+1 < list.size() && list.get(i+1) < 0){
                if(Math.abs(list.get(i+1)) < num){
                    list.remove(i+1);
                }else if(Math.abs(list.get(i+1)) > num){
                    list.remove(i);
                }else{
                     list.remove(i+1);
                    list.remove(i);
                    i--;
                }
            }else{
               i--; 
            }
            
        }
        
        int[] res = new int[list.size()];
         for(int j = 0 ; j < list.size() ; j++){
             res[j] = list.get(j);
         }
        
        return res;
    }
}