class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int k = 1;
//      변수 k 는 i 값을 나타내는 변수.        
        
        while(true) { // 무한루프 시작.
//      i 팩토리얼 값을 계산, 그 값을 n 과 비교하여
//      조건을 만족할 때까지 계속 반복.            
            num *= k; // num * k 곱해 i 팩토리얼 값을 계산.
            if (num > n) {
                answer = k;
                break;
            }
            k++;
        }
        return answer - 1; 
//      i 팩토리얼 값이 n을 초과하는 가장 큰 정수 i 를 구하는 것이므로
//      1을 뺀 값을 반환하면 되는 구조.
    }
}