import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
// Arrays.copyOfRange : 원본 배열에서 원하는 범위의 요소들을 추출하여
//      새로운 배열로 만들 때 유용하게 사용된다.
        return answer;
    }
}