class Solution {
    public String solution(String code) {
        
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for(int i =0; i < code.length(); i++){
            char currentCode = code.charAt(i);
            
            if(code.charAt(i) == '1'){
                mode = 1 - mode;
            }
            else{
                if(mode == 0 && i % 2 == 0){
                    ret.append(currentCode);
                }
                else if(mode == 1 && i % 2 != 0){
                    ret.append(currentCode);
                }
            }
        }
        if(ret.length() == 0){
            return "EMPTY";
        }
        
        return ret.toString();
    }
}