class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseString;
        morseString = letter.split(" ");
//      letter 문자열을 공백을 기준으로 분리하여 'morseString' 배열에 저장.   
        StringBuilder sb = new StringBuilder(); // sb 객체 생성.
        for (String word : morseString) { // morseSTring 배열에 있는 각각의 모스 부호에 대해 반복.
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) sb.append(Character.toString(i + 'a'));
//      현재 반복중인 'word'와 'morse' 배열에 'i' 번째 요소를 비교.
//      만약 두 문자열이 같다면, 해당 모스 부호가 영어 알파벳으로 어떤 문자에 해당하는지를 'Character.toString(i + 'a')' 를사용하여 찾고, 'sb'에 추가한다.                
            }
        }
        return sb.toString();
    }
}
