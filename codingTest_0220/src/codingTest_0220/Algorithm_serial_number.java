package codingTest_0220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Algorithm_serial_number {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[N];
		for (int i=0; i<N; i++) {
			String sn = br.readLine();
			arr[i] = sn;
		}
		
		//A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
		Arrays.sort(arr, (a, b) -> a.length() - b.length());
		
		//만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
		for (int i=0; i<N; i++) {
			String Str = arr[i].replaceAll("[^0-9]", "");
			int intStr = Integer.parseInt(Str);
			int sum = 0;
			
			while(intStr > 0) {
				sum += intStr % 10;
				intStr /= 10;
			}
			//?
			
		}
		
		for (int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
