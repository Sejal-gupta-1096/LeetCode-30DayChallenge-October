class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        
        
        int swapA = 0 , swapB = 0;
        int num1 = A[0] , num2 = B[0];
        boolean notAns = false;
        
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == num1 || B[i] == num1){
                if(A[i] == num1 && B[i] != num1){
                    swapB++;
                }else if(B[i] == num1 && A[i] != num1){
                    swapA++;
                }
            }else{
                notAns = true;
            }
        }
        
        System.out.println(notAns);
        
        if(notAns){
            swapA = 0;
            swapB = 0;
            notAns = false;
           for(int i = 0 ; i < A.length ; i++){
                if(A[i] == num2 || B[i] == num2){
                    if(A[i] == num2 && B[i] != num2){
                    swapB++;
                }else if(B[i] == num2 && A[i] != num2){
                    swapA++;
                }
                }else{
                    notAns = true;
                }
            } 
        }
        
        if(notAns) return -1;
        
        return Math.min(swapA,swapB);
        
    }
}