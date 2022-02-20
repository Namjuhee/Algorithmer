package codingTest_0220;

import java.lang.*;
import java.util.*;

/*테스트 1 〉	통과 (0.50ms, 73.4MB)
테스트 2 〉	통과 (0.60ms, 78.4MB)
테스트 3 〉	통과 (0.55ms, 77.7MB)
테스트 4 〉	통과 (0.57ms, 71.8MB)
테스트 5 〉	통과 (0.59ms, 65.3MB)
테스트 6 〉	통과 (0.86ms, 73.2MB)
테스트 7 〉	통과 (0.42ms, 78.6MB)
테스트 8 〉	통과 (0.33ms, 76.2MB)
테스트 9 〉	통과 (0.35ms, 76.5MB)
테스트 10 〉	통과 (0.68ms, 74.7MB)
테스트 11 〉	통과 (0.89ms, 77.5MB)
테스트 12 〉	통과 (0.40ms, 77.1MB)
테스트 13 〉	통과 (0.63ms, 70.5MB)
테스트 14 〉	통과 (0.90ms, 80.6MB)
테스트 15 〉	통과 (0.69ms, 74.3MB)
테스트 16 〉	통과 (0.46ms, 82.8MB)*/

// 접근은 맞게 했는데 구현에서 애를 먹었다
// citations[i]번 이상 인용된 횟수는
// H-index 는 citations.length - i이고,
// 인용된 횟수가 H-index 이상이면 답

public class Algorithm_H_Index {
	public int solution(int[] citations) {
        int answer = 0;
        int n = 0; //인용된 횟수를 받을 변수
        int h = 0;
        
        Arrays.sort(citations);
        
        for (int i = 0; i < citations.length; i++) {
            // 인용된 횟수가 H-index랑 같은 값일 때를 구하려했지만
            // 비효율적으로 구현
            n = citations[i];
            h = citations.length - i;
            
            if (h <= n) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}