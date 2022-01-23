package codingTest_0123;

import java.util.Arrays;
//정확성  테스트
//테스트 1 〉	통과 (0.33ms, 72.6MB)
//테스트 2 〉	통과 (0.25ms, 75MB)
//테스트 3 〉	통과 (1.66ms, 77.5MB)
//테스트 4 〉	통과 (3.34ms, 79.1MB)
//테스트 5 〉	통과 (3.95ms, 82.8MB)
//효율성  테스트
//테스트 1 〉	통과 (111.56ms, 97.6MB)
//테스트 2 〉	통과 (270.79ms, 88.7MB)
//테스트 3 〉	통과 (297.57ms, 94.8MB)
//테스트 4 〉	통과 (341.28ms, 109MB)
//테스트 5 〉	통과 (359.24ms, 112MB)

public class Algorithm_runner {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                if (participant[i+1].equals(completion[i])){
                    return participant[i];
                }
            }
        }
        return participant[i];
        //answer로 출력하려면 어떻게 해야하는지 확인
    }
}
