import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        // nextInt() 메소드를 사용해 사용자로부터 정수 값을 입력받아 n 변수에 저장. --> 삼각형의 크기를 결정하는 데 사용된다.
        String x = "*"; // x 라는 문자열 변수를 선언, "*" 문자를 할당.
        for(int i = 0; i<n; i++) { // i는 반복횟수.
            for(int j = 0; j<=i; j++) { // j는 별의 개수
            System.out.print(x);
        }
            System.out.println();
        }

    }
}