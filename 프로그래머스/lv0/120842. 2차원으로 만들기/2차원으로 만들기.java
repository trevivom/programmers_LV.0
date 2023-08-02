class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rows = (num_list.length + n - 1) / n; 
        int[][] answer = new int[rows][n];

        // num_list의 원소들을 앞에서부터 n개씩 나눠서 2차원 배열로 저장
        for (int i = 0; i < num_list.length; i++) {
            int row = i / n;
            int col = i % n;
            answer[row][col] = num_list[i];
        }
        return answer;
    }
}
