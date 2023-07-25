class Solution {
     public String solution(int age) {
        String answer="";
        String ageWord = Integer.toString(age); 
//      int를 String 으로 변환.   
            for(int i=0; i < ageWord.length(); i++) { 
//      ageWord 의 length 만큼 반복.                
                answer+=(char) ((char) ageWord.charAt(i)+49);
            }
//      ageWOrd 에서 i 번째 인덱스에 해당된 문자를 가져온다.
//      char 로 형변환을 2번 적용하는 이유는 아스키 코드 값을 문자로 다시 변환하기 위함이다.
            return answer;
    }
}
