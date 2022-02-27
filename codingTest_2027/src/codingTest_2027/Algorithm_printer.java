package codingTest_2027;

import java.util.PriorityQueue;
import java.util.Comparator;

// 중복 값 처리가 어려워서 실패...
// 생각해본 풀이
// Hashmap으로 A 2/B 1/C 3/D 2 이런식으로 구현한 다음에
// https://codechacha.com/ko/java-sort-map/
// value값 순서대로 정렬한 다음,
// location -> key값(A, B...)을 찾아서 Hashmap의 몇번째 순서인지를 구함
// 중복 값일 경우 key 순서대로 정렬+ 앞의 C보다 큰 수가 뒤에 올수있게 정렬하는걸로 구하면 어떨까
// C D(C보다 커서 A보다 앞) A B

public class Algorithm_printer {
	public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = 
            new PriorityQueue<Integer>(new Comparator<Integer>(){
                public int compare(Integer lhs, Integer rhs) {
                    if (lhs < rhs) return +1;
                    if (lhs.equals(rhs)) return 0;
                    return -1;
                }
            });
        
        int find = priorities[location];
        for (int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);
        }
        
        int answer = 0;
        int cnt = 1;
        
        // 3 2 2 1
        // 9 1 1 1 1 1
        while(!pq.isEmpty()) {
            int printer = pq.poll();
            if (find == printer) {      
                answer = cnt;

            } else{
                cnt++;
            }
        }
        
        return answer;
    }
}
