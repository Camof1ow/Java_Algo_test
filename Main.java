public class Main {
    public static void main(String[] args) {
        // write your code here

        Solution tmp = new Solution();
        long solution = tmp.solution(1,5);
        System.out.println("나와라 얍 :: " + solution);


        Solution1 tmp1 = new Solution1();
        double solution1 = tmp1.solution1(new int[] {2,20,5,10,9});
        System.out.println("나와라 얍 :: " + solution1);

    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) { // 정수 a가 b보다 작을떄 (자기전 삼항연산자로 풀어보기)
            for (int i = a; i <= b; i++) { //a부터 b까지 아래를 반복 ( B 바로 전까지 반복은 i < b 연산자, == 동등 연산자 사용시 같을때까지 반복인데 같은 적이 없어서 0회 0번 더한다.)
                answer += i; // answer에 i 더하기
            }
        } else if (a > b) { // 정수 a가 b보다 클때
            for (int i = b; i <= a; i++) { // b부터 a까지 아래를 반복
                answer += i; // answer에 i 더하기
            }
        } else {
            answer = a; // a=b 일때 그냥 a값으로 선언
        }

        return answer; // 출력
    }
}


class Solution1 {
    public double solution1(int[] arr) { // 원소가 정수인 배열명 arr
        int sum = 0; // 변수 초기화

        for (int num : arr){  // 대입받을 변수 num 정의 ( 처음부터 하나씩 array 내 원소가 차례로 대입됨), 배열명
            sum += num;  // sum = (sum + num) 배열 내 원소갯수만큼
        }

        double answer = sum / arr.length; //  합계/배열길이 = 유리수인 answer
        return answer; // 출력

    }
}