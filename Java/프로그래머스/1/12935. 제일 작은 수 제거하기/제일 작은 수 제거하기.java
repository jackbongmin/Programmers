class Solution {
    public int[] solution(int[] arr) {
        return result(arr);
    }
    private int[] result(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
            min = arr[i];
            }
        }
        int answer[] = new int[arr.length-1];
        int index = 0;
        if(arr.length <= 1) return new int[]{-1};
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            answer[index] = arr[i];
            index++;
        }

        return answer;
    }
}
