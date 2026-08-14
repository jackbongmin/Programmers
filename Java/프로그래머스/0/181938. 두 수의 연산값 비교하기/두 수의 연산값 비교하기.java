class Solution {
    public int solution(int a, int b) {
        
        String str = ""+a+b;
        int ab = Integer.parseInt(str);
        int ab2 = a * b * 2;
        
        return Math.max(ab, ab2);
    }
}