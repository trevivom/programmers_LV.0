class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        
        for(int i = 1; i < k; i++) {
            index += 2; // 우측 한 명 건너뜀.
        }
        index %= numbers.length;
        answer = numbers[index];
        return answer;
    }
}