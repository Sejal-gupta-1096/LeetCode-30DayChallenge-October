class Solution {
    public String removeDuplicateLetters(String s) {
        
         boolean[] visited = new boolean[26];
        int[] last = new int[26];
        Stack<Character> stack = new Stack <>();
        
        for (int i = 0; i < s.length (); i++) {
            last[s.charAt (i) - 'a'] = i;
        }
        
        for (int i = 0; i < s.length (); i++) {
            char c = s.charAt (i);
            if (visited[c - 'a']) {
                continue;
            }
            while (!stack.isEmpty () && stack.peek () > c && last[stack.peek () - 'a'] > i) {
                visited[stack.peek () - 'a'] = false;
                stack.pop ();
            }
            stack.push (c);
            visited[c - 'a'] = true;
        }
        
        StringBuilder ans = new StringBuilder ();
        
        while (!stack.isEmpty ()) {
            ans.append (stack.pop ());
        }
        
        return ans.reverse().toString();

    }
}