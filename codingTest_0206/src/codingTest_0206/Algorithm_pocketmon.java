package codingTest_0206;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
// 입력받은 요소를 해시에 입력
// 입력 받을 갯수/문제 갯수로 배열의 크기 지정
// key 값으로 value찾기, value값으로 key값 찾기

// 참고
// https://maivve.tistory.com/140
// Scanner X  -->  BufferReader/StringTokenizer
public class Algorithm_pocketmon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> Nmap = new HashMap<>();
		String[] nameArr = new String[N + 1]; //*왜 N+1일까?
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i < N + 1; i++) { //*왜 N+1일까?
			String name = br.readLine();
			Nmap.put(name, i);
			nameArr[i] = name;
		}
		
		while(M --> 0) {
			String findStr = br.readLine();
			if(isStringNumber(findStr)) { // 숫자(인덱스)를 입력받은 경우
				int index = Integer.parseInt(findStr);
				sb.append(nameArr[index]);
			}
			else {	// 문자를 입력받은 경우
				sb.append(Nmap.get(findStr));
			}
			sb.append("\n");
		}
				
		//try {
		//	for(i=0; i < M; i++) {
		//		if (scanner.hasNextInt()) {
		//			answer[i] = scanner.next();
		//			System.out.println("입력받은 값 : " + answer[i]);
		//			System.out.println("출력하는 값 : " + Nmap.get((int) getKey(Nmap, answer[i])));
		//		}
		//		else {
		//			answer[i] = scanner.next();
		//			System.out.println("입력받은 값 : " + answer[i]);
		//			System.out.println("출력하는 값 : " + getKey(Nmap, answer[i]));
		//		}
		//	}
		//}catch(InputMismatchException e) {
			
		//}
		
		System.out.println(sb.toString());
	}
	
	public static boolean isStringNumber(String s) {
		   try {
		       Double.parseDouble(s);
		       return true;
		   }
		   catch (NumberFormatException e) {
		       return false;
		   }
		}
}

