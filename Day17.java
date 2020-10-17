class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        
        if(s.length() <= 10) return list;
        
       
        
        for(int i = 0 ; i <= s.length()-10 ; i++){
            String str = s.substring(i,i+10);
            if(set.contains(str)) set2.add(str);
            set.add(str);
        }
        
        return new ArrayList<String>(set2);
    }
    
   
 }