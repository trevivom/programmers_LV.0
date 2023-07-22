class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for (int i=0; i<my_string.length(); i++) {
// 주어진 문자열의 길이만큼 반복 -> 각 문자 확인.            
            if (my_string.charAt(i) != letter.charAt(0)) {
// 현재 위치의 문자가 주어진 문자와 다른지를 비교.                
                answer += my_string.charAt(i);
// 만약 다르면, 해당 문자를 결과 문자열에 추가.
// 이를 위해 기존 answer 변수에 저장된 문자열 뒤에 현재 문자를 이어 붙임.
            }
        }
        return answer;
    }
}