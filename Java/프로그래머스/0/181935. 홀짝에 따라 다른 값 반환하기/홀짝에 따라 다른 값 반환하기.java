class Solution {
    public int solution(int n) {
        return (n % 2 == 0) ? even(n) : odd(n);
    }
    private int odd(int n){
        int oddsum = 0;
        for (int i=1;i<=n;i+=2){
            oddsum += i;
        }
        return oddsum;
    }
    private int even(int n){
        int evensum=0;
        for(int i=2; i<=n; i+=2){
            evensum += i*i;
        }
        return evensum;
    }
}