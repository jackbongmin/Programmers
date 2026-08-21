class Solution {
    public String solution(int[] numLog) {
        return result(numLog);
    }
    private static String result(int [] InNumLog){
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i<InNumLog.length; i++){
            if(InNumLog[i] - InNumLog[i-1] == 1){
                answer.append('w');
            }
            else if(InNumLog[i] - InNumLog[i-1] == -1){
                answer.append('s');
            }
            else if(InNumLog[i] - InNumLog[i-1] == 10){
                answer.append('d');
            }
            else if(InNumLog[i] - InNumLog[i-1] == -10){
                answer.append('a');
            }
        }
        return answer.toString();
    }
}