class Solution {
    public int solution(int n, String control) {
        return result(n, control);
    }
    
    private static int result(int InN, String InControl){
        for(int i = 0; i< InControl.length(); i++){
            char c = InControl.charAt(i);
            if(c == 'w'){
                InN += 1;
            }
            else if(c == 's'){
                InN -= 1;
            }
            else if(c == 'd'){
                InN += 10;
            }
            else if(c == 'a'){
                InN -= 10;
            }
        }
        return InN;
    }
    
}