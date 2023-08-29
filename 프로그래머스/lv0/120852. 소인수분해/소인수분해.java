import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        
        for(int i = 2; i <= n; i++) {
            while( n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        answer = set.stream().mapToInt(i ->i).sorted().toArray();
       
        return answer;
    }
}