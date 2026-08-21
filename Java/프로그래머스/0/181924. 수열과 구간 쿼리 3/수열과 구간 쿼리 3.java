class Solution {
    public int[] solution(int[] arr, int[][] queries) { 
        
        return result(arr, queries);
    }
    
    private static int[] result(int[] InArr, int[][] InQueries){
        for(int i = 0; i<InQueries.length; i++){
            int inxA = InQueries[i][0];
            int inxB = InQueries[i][1];
            
            swap(InArr, inxA, inxB);
        }
        return InArr;
    }
    
    private static void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}