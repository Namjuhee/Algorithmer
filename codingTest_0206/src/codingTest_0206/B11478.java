package codingTest_0206;
import java.util.*;

//부분 문자열을 저장할 자료구조를 잘 선택하지 않으면 시간 초과로 오답이 나오는 문제입니다.
// ArrayList를 이용할 경우 시간 초과가 발생하여 HashSet을 이용해야 한다는 점만 유의하면 될 것 같습니다.

// 중복제거 할 떄 HashSet / 중복제거&정렬 TreeSet
// ArrayList 검색많음 ArrayList / 삽입삭제많음 LinkedList
// 출처: https://airzinc.tistory.com/entry/백준-11478JAVA [박상어 블로그]
public class B11478 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
 
        HashSet<String> list = new HashSet<>();
 
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (!list.contains(s.substring(i, j))) {
                    list.add(s.substring(i, j));
                }
            }
        }
 
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()+"\n");
        System.out.println(sb);
 
    }

}
