package codingTest_0123;

import java.util.*;

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
