class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        answer = (box[0] / n) * (box[1] / n) * (box[2] / n) ;
        // 박스 크기와 총 주사위의 크기를 동일시 해서 문제 풀기.
        return answer;
    }
}