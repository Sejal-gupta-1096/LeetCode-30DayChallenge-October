class Solution {
    public int bitwiseComplement(int N) {
        
        String binary = "";
        int num = N;
        
        while(num > 0){
            binary = num % 2 + binary;
            num = num/2;
        }
        
        int i = 0;
        while(i < binary.length()){
            System.out.println(binary);
           char c = binary.charAt(i);
            if(c == '0'){
                binary = binary.substring(0, i) + "1" + binary.substring(i+1);
            }else{
                binary = binary.substring(0, i) + "0" + binary.substring(i+1);
            }
            i++;
        }
         
        if(binary == "") binary = "1";
        int ans = Integer.parseInt(binary , 2);
        return ans;
        
    }
}