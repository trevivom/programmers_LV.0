import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
    	my_string = my_string.replaceAll("[a-z]", ""); 
        
        String[] arr = my_string.split("");
//      문자열 하나씩 나눠 배열로 저장.        
        int[]answer = new int[arr.length];
//      변환 결과를 저장할 정수형 배열 생성.        
        for (int i = 0; i < arr.length; i++) {
        	answer[i] = Integer.parseInt(arr[i]);
//      배열에 저장된 숫자 문자열을 정수로 변환하여 answer 배열에 저장. 
		}
        Arrays.sort(answer);
        
    	return answer;
    }
}