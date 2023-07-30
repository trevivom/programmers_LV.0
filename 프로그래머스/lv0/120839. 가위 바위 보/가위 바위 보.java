class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] s = rsp.split("");
        for(int i = 0; i < rsp.length(); i++) {
            if (s[i].equals("0")) {
                answer += 5; 
// 입출력 예 참고해서 answer += 5;                 
            } else if (s[i].equals("2")) {
                answer += 0;
// 위와 동일.                
            } else if (s[i].equals("5")) {
                answer += 2;
// 위와 동일.                
            }
        }
        return answer;
    }
}