class Solution {
    public String solution(String my_string, int n) {
        
        String answer = "";                     
        for(int i =0; i<my_string.length(); i++){ 
//      i 변수를 0 ~ 'my_string'의 length 보다 작을 때까지 1씩 증가하며 탐색.
            for(int j=0; j<n; j++){                 
//      j 변수를 0 ~ 'n'보다 작을 때까지 1씩 증가, 해당 문자열의 i 번 인덱스에 있는 문자를 n 번 반복하여 answer에 추가.
                answer += my_string.charAt(i);   
//     내부 for 루프가 완료 되면, 다음 인덱스의 문자를 처리하고 각 문자들을 n 번씩 반복하여 answer에 추가하는 작업 반복.
            }
        }
        return answer; // 최종적으로 구성된 answer 문자열 반환.
    }
}