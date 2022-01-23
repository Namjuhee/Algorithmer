package codingTest_0123;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
//정확성  테스트
//테스트 1 〉	통과 (0.07ms, 70.9MB)
//테스트 2 〉	통과 (0.07ms, 74.9MB)
//테스트 3 〉	통과 (0.48ms, 81.7MB)
//테스트 4 〉	통과 (0.72ms, 79.1MB)
//테스트 5 〉	통과 (0.69ms, 80.5MB)
//효율성  테스트
//테스트 1 〉	통과 (36.30ms, 82MB)
//테스트 2 〉	통과 (66.80ms, 89.8MB)
//테스트 3 〉	통과 (106.15ms, 97.8MB)
//테스트 4 〉	통과 (76.83ms, 95.5MB)
//테스트 5 〉	통과 (99.46ms, 95.2MB)

//https://coding-grandpa.tistory.com/76?category=981507
public class Algorithm_runner_hash {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		for (String player : participant)
			map.put(player, map.getOrDefault(player, 0) + 1);
			//이 함수는 'player'라는 Key에 해당하는 Value가 있으면 가져오고, 아닐 경우 0을 Default로 지정하여 사용하겠다는 의미의 함수이다.
			//"Value를 전부 1로 하면 되지 않을까?"라는 의문이 생긴다면, 동명이인이 있는 예외 케이스를 고민해보면 좋다.
			//즉, HashMap이 Count Table과 동일한 역할을 해야 되기 때문에, 단순히 0/1로 있다 없다를 표현하는 것으로는 부족하고, A라는 이름을 가진 참가자가 몇 명인지를 알아야 하는 것이다.
		
		for (String player : completion)
			map.put(player, map.get(player) - 1);
		
			Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
			
		while(iter.hasNext()){
			Map.Entry<String, Integer> entry = iter.next();
			if (entry.getValue() != 0){
				answer = entry.getKey();
				break;
				}
			}
		return answer;
    }
	
	public static void main(String[] args){
		String[] part = {"leo", "kiki", "eden"};
		String[] comp = {"eden", "kiki"};
		Algorithm_runner_hash sol = new Algorithm_runner_hash();
		System.out.println(sol.solution(part, comp));
		}

}
