class Solution {
    public int solution(String dartResult) {
        return CalculateTotalScore(dartResult);
    }
    private int CalculateTotalScore(String dartResult){
    int[] scores = new int[3];
    int roundIndex = -1;
    
    for(int i = 0; i<dartResult.length();i++){
        char c = dartResult.charAt(i);
        
        if(Character.isDigit(c)){
            roundIndex++;
            
            if(c=='1'&&dartResult.charAt(i+1)=='0'){
                scores[roundIndex] = 10;
                i++;
            }
            else{
                scores[roundIndex] = c - '0';
            }
        }
        else if(c=='S'||c=='D'||c=='T'){
            scores[roundIndex] = ApplyBonus(scores[roundIndex], c);
        }
        else if(c== '*'|| c=='#'){
            ApplyOption(scores, roundIndex, c);
        }
    }
    int totalScore = 0;
    for(int i = 0; i<scores.length; i++){
        totalScore += scores[i];
    }
    return totalScore;
}
private int ApplyBonus(int InScore, char InBonus){
    if(InBonus == 'S') return (int)Math.pow(InScore, 1);
    if(InBonus == 'D') return (int)Math.pow(InScore, 2);
    if(InBonus == 'T') return (int)Math.pow(InScore, 3);
    return InScore;
}
private void ApplyOption(int[] InScore, int InRoundIndex, char InOption){
    if(InOption == '*'){
        InScore[InRoundIndex] *= 2;
        if(InRoundIndex>0){
            InScore[InRoundIndex - 1] *= 2;
        }
    }
    else if(InOption == '#'){
        InScore[InRoundIndex] *= -1;
    }
}
}

