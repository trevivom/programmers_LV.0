class Solution {
    public int[] solution(int[] numbers, String direction) {
        if (numbers == null || numbers.length == 0) {
            return numbers;
        }
        
        int length = numbers.length;
        int[] answer = new int[length];
        System.arraycopy(numbers, 0, answer, 0, length);
        // numbers 배열 요소 -> answer 배열로 복사.
        
        if ("right".equals(direction)) {
            // 오른쪽으로 회전
            int temp = answer[length - 1];
            for (int i = length - 1; i > 0; i--) {
                answer[i] = answer[i - 1];
            }
            answer[0] = temp;
        } else if ("left".equals(direction)) {
            // 왼쪽으로 회전
            int temp = answer[0];
            for (int i = 0; i < length - 1; i++) {
                answer[i] = answer[i + 1];
            }
            answer[length - 1] = temp;
        } 
        return answer;
 // direction 값이 "right" 또는 "left"가 아닌 경우, 원본 배열을 그대로 리턴
    }
}
