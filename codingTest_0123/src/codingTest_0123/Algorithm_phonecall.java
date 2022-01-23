package codingTest_0123;

import java.util.*;

//테스트 1 〉	통과 (3.52ms, 56.6MB)
//테스트 2 〉	통과 (7.52ms, 57.2MB)
//테스트 3 〉	통과 (320.01ms, 219MB)
//테스트 4 〉	통과 (234.93ms, 139MB)
//참고
//https://suzxc2468.tistory.com/205
public class Algorithm_phonecall {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		HashMap<String, Integer> map = new HashMap<>(); 
        for(int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], i);

        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 1; j < phone_book[i].length(); j++) {
            	//맵에 key 값이 있는지 확인
                if(map.containsKey(phone_book[i].substring(0,j))) {
                    return false;
                } 
            } 
        };
        
        return answer;
	}
}
