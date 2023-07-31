class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share);
//      재귀함수. balls 와 share 의 개수가 같거나 share 가 0인 경우 항상 1을 반환
//      그렇지 않은 경우, balls 개의 구슬 중 share 개의 구슬을 선택하는 
//      모든 경우의 수를 계산하기 위해 재귀함수 사용.        
        return answer;
    }
    private int combination(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        } else {
            return combination(balls - 1, share - 1) + combination(balls - 1, share);
        }
    }
}