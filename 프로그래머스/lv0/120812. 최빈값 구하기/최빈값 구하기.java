import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
//         HashMap 을 생성 -> map 변수에 할당. Integer 형식의 키, 값 구성.
        
        int max = 0; // 최대 빈도수 표현하기 위한 max 변수.

        for (int num : array) { // array 배열의 각 요소를 num 변수에 대입, 반복문
            int frequency = map.getOrDefault(num, 0) + 1;
//             map 에서 num 키에 대한 값을 가져오고, 존재하지 않으면 기본값으로 0을 반환, 그리고 1을 더해 frequency 변수에 저장.
            map.put(num, frequency);
//             map 에서 num 을 키로 frequecny 를 값으로 하는 쌍을 저장. 이 과정으로 num 의 빈도수가 업데이트됨.
            max = Math.max(max, frequency);
//             max 변수 중 더 큰값으로 업데이트. 
        }

        int answer = -1;
        boolean isCheck = false;

   
        for (int key : map.keySet()) { 
//             map 의 모든 키에 대해 반복문을 실행.
            if (map.get(key) == max) {
                if (answer != -1) { // answer != -1 일 경우 이미 중복된 최빈값O
                    isCheck = true;  
                    break;
                }
                answer = key;
            }
        }

        if (isCheck) {
            return -1; 
        } else {
            return answer; 
        }
    }
}