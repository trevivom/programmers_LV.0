class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
//      새로운 answer 이란 배열 생성, 모든 요소 0으로 초기화됨.
        
        for (int i = 0; i < emergency.length; i++) {
//      emergency 배열에 순차적으로 접근.            
            for (int j = 0; j < emergency.length; j++) {
//      그 안에서(내부적으로) emergency[i] 와 emergency[j] 를 비교하면서 
//      다른 for문 반복.                
                if (emergency[i] < emergency[j]) {
                    answer[i]++;
//      위의 if 문은 내부 for문에서의 조건문.                    
                }
            }
            answer[i]++;
//      내부 for문이 끝나면 emergency[i] 보다 작거나 같은 값의 개수가 결정되나
//      자기 자신도 포함되어 카운트 되니, 1을 더해줘야 함.
        }
        return answer;
    }
}
