class Solution {
    public int[] solution(int[] num_list) {
        return result(num_list);
    }
    private int[] result(int[] InNumList) {
        int[] answer = new int[InNumList.length + 1];
        
        for(int i=0; i<InNumList.length; i++) {
            answer[i] = InNumList[i];
        }
        
        int lastIdx = InNumList.length - 1;
        int prevIdx = InNumList.length - 2;
        
        if(InNumList[lastIdx] > InNumList[prevIdx]) {
            answer[answer.length - 1] = InNumList[lastIdx] - InNumList[prevIdx];
        } else {
            answer[answer.length - 1] = InNumList[lastIdx] * 2;
        }
        
        return answer;
    }
}