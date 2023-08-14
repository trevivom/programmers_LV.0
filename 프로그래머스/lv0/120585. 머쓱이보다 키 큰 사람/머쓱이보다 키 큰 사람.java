class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
//      array의 길이 만큼 반복.            
            if (array[i] > height) {
//      array배열의 i 번째 숫자가 height 보다 클 경우
//      answer 1 증가.                
                answer++;
            }
        }
        return answer;
    }
}