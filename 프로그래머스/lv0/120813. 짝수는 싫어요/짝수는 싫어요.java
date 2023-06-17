class Solution {
    public int[] solution(int n) {
        int[] answer;
        int a = 0;
        
        answer = new int[n / 2 + n % 2];
        
        for (int i = 1; i <= n; i+=2) {
                answer[a++] = i;       
        }
        return answer;
    }
}