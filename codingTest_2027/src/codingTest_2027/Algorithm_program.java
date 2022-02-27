package codingTest_2027;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
