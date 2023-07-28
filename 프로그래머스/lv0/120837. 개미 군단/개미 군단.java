class Solution {
    public int solution(int hp) {
        int answer = 0; // 초기화.

        answer = hp / 5; // 5로 최대한 적게 나누기.
        hp %= 5;

        answer += hp  / 3; // 3으로 최대한 적게 나누기.
        hp %= 3;

        answer += hp; // 남은 값 1로 최대한 적게 나누기.
        return answer;
    }
}
