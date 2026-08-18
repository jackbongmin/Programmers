class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String sum = ineq + eq;
        boolean result = false;
        
        switch(sum){
            case ">=":
                result = (n >= m);
                break;
            case "<=":
                result = (n <= m);
                break;
            case ">!":
                result = (n > m);
                break;
            case "<!":
                result = (n < m);
                break;
        }
        
        return result ? 1 : 0;
    }
}