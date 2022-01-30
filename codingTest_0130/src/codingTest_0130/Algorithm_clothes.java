package codingTest_0130;
import java.util.*;

//테스트 1 〉	통과 (0.08ms, 76.2MB)
//테스트 2 〉	통과 (0.05ms, 76.5MB)
//테스트 3 〉	통과 (0.07ms, 75.1MB)
//테스트 4 〉	통과 (0.07ms, 75MB)
//테스트 5 〉	통과 (0.04ms, 75.4MB)

//* 스스로 생각한 부분
//* HashMap구조
//* getOrDefault

//경우의 수 측정하는 방법 참고
//https://codingfriend.tistory.com/m/30
public class Algorithm_clothes {
	public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
        	String c = clothes[i][1];
            map.put(c, map.getOrDefault(c, 1) + 1);
    }
//map.getOrDefault(c, 1) + 1의 뜻은
//map 안에 값이 존재하지 않으면 default 값인 1을 넣고 값을 +1 더해주겠다는 뜻이고,
//map 안에 값이 이미 존재하면 c key에 해당하는 값을 가져와서 1을 더해준 값을 저장해준다는 뜻이다. 
        
        for (String key : map.keySet()) {
            answer *= map.get(key);
        }
        //keySet() 변환 - get() value값 출력
        return answer - 1;
    }
}
