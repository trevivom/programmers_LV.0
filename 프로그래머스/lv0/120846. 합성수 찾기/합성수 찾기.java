class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if(i%j == 0) count++;
                if(count > 2) {
//      약수의 개수가 3개 이상일 경우 합성수로 취급    
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}