class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int maxValue = 0; // 최댓값에 대한 변수명.
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > maxValue) {
                    maxValue = numbers[i] * numbers[j];
                }
            }
        }
        answer = maxValue;
        
        return answer;
    }
}