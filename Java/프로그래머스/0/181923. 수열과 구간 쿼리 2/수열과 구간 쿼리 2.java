class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        return result(arr, queries);
    }
    private static int[] result(int[] InArr, int [][] InQueries){
        int[] answer = new int[InQueries.length];
        
        for(int i = 0; i < InQueries.length; i++){
            int idx1 = InQueries[i][0];
            int idx2 = InQueries[i][1];
            int idx3 = InQueries[i][2];
            
            int min = 1000001;
            for(int j = idx1; j <= idx2; j++){
                if(InArr[j] > idx3 && InArr[j]<min){
                    min = InArr[j];
                }
            }
            
            if(min == 1000001) {
                answer[i] = -1;
            } 
            else {
                answer[i] = min;
            }
        }
        return answer;
    }
}