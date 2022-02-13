package codingTest_0213;
import java.util.Arrays;

//테스트 1 〉	통과 (0.44ms, 77.2MB)
//테스트 2 〉	통과 (0.32ms, 76.2MB)
//테스트 3 〉	통과 (1.22ms, 74.6MB)
//테스트 4 〉	통과 (0.36ms, 83.8MB)
//테스트 5 〉	통과 (0.32ms, 74.4MB)
//테스트 6 〉	통과 (0.35ms, 76.7MB)
//테스트 7 〉	통과 (0.35ms, 66.2MB)

public class Algorithm_knumber {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 예외가 왜 나나했는데 제대로 선언을 안했구나...
        for (int i = 0; i < commands.length; i++) {
            int begin = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            int[] test = Arrays.copyOfRange(array, begin-1, end);
            Arrays.sort(test);
            answer[i] = test[k-1];
        }
        return answer;
    }
}
