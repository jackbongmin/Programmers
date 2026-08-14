class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        return Survival(bandage, health, attacks);
    }
    private int Survival(int[] InBandage, int InMaxHealth, int[][] InAttacks){
        int currentHealth = InMaxHealth;
        int currentTime = 0;
        
        int castTime = InBandage[0];
        int healTime = InBandage[1];
        int healBonus = InBandage[2];
        
        for(int i =0; i< InAttacks.length; i++){
            int attackTime = InAttacks[i][0];
            int damage = InAttacks[i][1];
            
            int timeDiff = attackTime - currentTime -1;
            
            if(timeDiff >0){
                currentHealth = CalculateHeal(currentHealth, InMaxHealth, timeDiff, castTime, healTime, healBonus);
            }
            currentHealth -= damage;
            
            if(currentHealth <= 0){
                return -1;
            }
            currentTime = attackTime;
        }
        return currentHealth;
    }
    private int CalculateHeal(int InCurrentHealth, int InMaxHealth, int InTimeDiff, int InCastTime, int InHealTime, int InHealBonus){
        int totalHeal = InTimeDiff * InHealTime;
        
        int bonusCount = InTimeDiff / InCastTime;
        totalHeal += bonusCount * InHealBonus;
        
        return Math.min(InMaxHealth, InCurrentHealth + totalHeal);
    }
}