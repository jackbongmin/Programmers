import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        ToggleAscii(a);
    }
    
    public static void ToggleAscii(String Instr1){
        String result = "";
        for(int i = 0; i < Instr1.length(); ++i){
            char c = Instr1.charAt(i);
            
            if(c>=65 && c<= 90){
                result += (char)(c + 32);
            }
            else if(c>=97 && c<=122){
                result += (char)(c -32);
            }
        }
        System.out.print(result);
    }
}