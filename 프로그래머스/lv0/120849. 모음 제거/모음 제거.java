class Solution {
    public String solution(String my_string) {
        
        return my_string.replaceAll("[aeiou]", "");
    }
}
// replaceAll([],"") 은 문자열에서 정규식 패턴 [] 에 해당하는 모든 문자를 빈 문자열 "" 로 대체하는 역할을 한다.
// []는 정규식 패턴으로 문자 클래스를 나타냄.