class Solution {
    public int solution(int a, int b, int c) {
        return result(a, b, c);
    }
    private int result(int a, int b, int c){
        
        int sum = a + b + c;
        int sum2 = a*a + b*b + c*c;
        int sum3 = a*a*a + b*b*b + c*c*c;
        
        if(a != b && b!=c && c != a){
            return sum ;
        }
        else if(a == b && b == c){
            return sum*sum2*sum3;
        }
        else{
            return sum*sum2;
        }
    }
}