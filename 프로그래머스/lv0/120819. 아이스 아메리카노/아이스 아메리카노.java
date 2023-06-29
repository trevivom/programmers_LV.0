class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        
        // 변수
        int takeCup = money / 5500;
        int change = money - (takeCup * 5500);
        
        answer = new int[] {takeCup, change};
        return answer;
    }
}