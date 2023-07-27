class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {  
//      i가 1부터 n까지 반복.            
            if (n % i == 0) {     
//      n이 i로 나눈 나머지 값이 0 이면 순서쌍이기에 적합하면 순서쌍의 개수(answer) 증가.
                answer++;
            }
        }
        return answer;
    }
}