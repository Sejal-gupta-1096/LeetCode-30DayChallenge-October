class Solution {
    public boolean buddyStrings(String A, String B) {
        
        if(A.length() != B.length()) return false;
        
        if(A.equals(B)){
            Set<Character> set = new HashSet<>();
            for(int i = 0 ; i < A.length() ; i++){
                if(set.contains(A.charAt(i))) return true;
                else set.add(A.charAt(i));
            }
            return false;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0 ; i < A.length() ; i++){
            if(A.charAt(i) != B.charAt(i)){
                list.add(i);
            }
        }
        
        
        if(list.size() < 2) return false;
        
        StringBuilder string = new StringBuilder(A); 
        string.setCharAt(list.get(0) , A.charAt(list.get(1)));
        string.setCharAt(list.get(1) , A.charAt(list.get(0)));
        A = string.toString();
        
        if(A.equals(B)) return true;
        return false;
        
    }
}