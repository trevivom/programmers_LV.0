class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [2]; // 정수 배열 생성.
        
        int even = 0; // 변수 초기화 (짝수, 홀수)
        int odd = 0;
        int length = num_list.length; // 배열의 길이에 대한 변수.
        for (int i = 0; i < length; i++) { // index의 숫자가 짝수 여부 확인.
            if (num_list[i] % 2 == 0) { // 만약 짝수라면 해당 개수 증가 후 answer 배열의 첫 번째 인덱스에 저장.
                even++;
                answer[0] = even;
            } else // 홀수일 경우 해당(odd) 개수 증가, answer 배열 2번째 인덱스에 저장.
                odd++;
                answer[1] = odd;
        }
        return answer;
    }
}