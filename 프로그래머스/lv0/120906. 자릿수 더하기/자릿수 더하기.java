class Solution {
	public int solution(int n) {
		int answer = 0;
		
		while (n > 0) {
			answer += n % 10; // 일의 자리.
			n /= 10; // 십의 자리, 그 이상.
		}
		return answer;
	}
}
