package codingTest_0213;
import java.util.Arrays;

//선택 정렬 사용
//시간 초과
public class Algorithm_MAXnumber {
	public String solution(int[] numbers) {
        String answer = "";
        selection_sort(numbers, numbers.length);
        for (int i=0; i < numbers.length; i++) {
            answer += numbers[i] + "";
        }
        return answer;
    }
    
    private static void selection_sort(int[] number, int size) {
        for (int i = 0; i < size - 1; i++) {
            int max_index = i;
            
            for(int j = i+1; j < size; j++) {
                int index_one = number[max_index] % 10;
                int j_one = number[j] % 10;
                if (j_one > index_one) {
                    max_index = j;
                } else if (j_one == index_one) {
                    if(number[j]/10 < number[max_index]/10) {
                        max_index = j;
                    }
                }
            }
            
            swap(number, max_index, i);
        }
    }
    
    private static void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }
}
