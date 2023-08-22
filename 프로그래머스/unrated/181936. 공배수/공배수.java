class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        answer = (number % n == 0 && number % m == 0) ? 1 : 0;
//      (조건) ? 참일 때 값 : 거짓일 때 값; (삼항연산자)        
        return answer;
    }
}