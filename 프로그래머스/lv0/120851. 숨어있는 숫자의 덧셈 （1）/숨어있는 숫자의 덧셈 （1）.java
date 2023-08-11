class Solution {
    public int solution(String my_string) {
        int sum = 0;

        // 문자열 순회
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                // 숫자인 경우 합에 더함
                sum += Character.getNumericValue(c);
            }
        }

        return sum;
    }
}