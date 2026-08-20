class Solution {
    public int solution(int a, int d, boolean[] included) {
        return calculate(a, d, included);
    }
    
    private int calculate(int InA, int InD, boolean[] InIncluded){
        int sum = 0;
        for(int i = 0; i < InIncluded.length; i++){
            if(InIncluded[i] == true){
                sum += InA + (i * InD);
            }
        }
        return sum;
    }
}