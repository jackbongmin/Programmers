class Solution {
    public int solution(int[] num_list) {
        return result(num_list);
    }
    
    private int result(int[] num_list){
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        int sum = 0;
        
        for(int i =0; i < num_list.length; i++){
            if(num_list[i]%2==0){
                even.append(num_list[i]);
            }
            else{
                odd.append(num_list[i]);
            }
        }
        sum = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
        return sum;
        
    }
}