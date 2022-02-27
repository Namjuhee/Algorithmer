package codingTest_2027;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
테스트 1 〉	통과 (0.19ms, 73.2MB)
테스트 2 〉	통과 (0.21ms, 72.1MB)
테스트 3 〉	통과 (0.25ms, 72.8MB)
테스트 4 〉	통과 (0.19ms, 65.8MB)
테스트 5 〉	통과 (0.17ms, 77.5MB)
테스트 6 〉	통과 (0.11ms, 76.4MB)
테스트 7 〉	통과 (0.17ms, 72.1MB)
테스트 8 〉	통과 (0.14ms, 73.3MB)
테스트 9 〉	통과 (0.18ms, 72.9MB)
테스트 10 〉	통과 (0.26ms, 76.2MB)
테스트 11 〉	통과 (0.13ms, 77MB)
*/

public class Algorithm_program {
	public int[] solution(int[] progresses, int[] speeds){
        Queue<Integer> queue = new LinkedList<>();
        int day = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            day = (100 - progresses[i]) /speeds[i] +
                ((100 - progresses[i]) %speeds[i] == 0 ? 0 : 1);
            queue.offer(day);
        }
        
        int count = 1;
        int now = queue.poll();
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(!queue.isEmpty()) {
            int next = queue.poll();
            if (now >= next){
                count++;
            }
            else {
                arr.add(count);
                count = 1;
                now = next;
            }
        }
        arr.add(count);
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i< answer.length; i++) {
            answer[i] = arr.get(i);
        }
        
        
        return answer;
    }
}
