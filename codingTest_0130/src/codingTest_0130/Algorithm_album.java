package codingTest_0130;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Algorithm_album {
	public static int[] solution(String[] genres, int[] plays) {
        List<Integer> list = new ArrayList<>();
        int length = genres.length;
        Map<String, Integer> map = getSumOfGenres(genres, plays);
        Album[] albums = getAlbums(genres, plays, map);

        
        // 노래리스트의 횟수를 구하는 방법 참고
        // https://zzang9ha.tistory.com/343
        
        // 1) 재생 노래 횟수가 같을경우 => 고유 번호가 낮은 순으로 오름차순
        // 2) 재생된 장르 수가 같을경우 => 재생 노래 횟수 순 내림차순
        // * 재생된 장르 수(오름차순) -> 장르 내에서 재생된 노래 횟수(오름차순) -> 노래 별 고유 번호(내림차순)
        Arrays.sort(albums, (i1, i2) -> {
            if (i2.sum == i1.sum) {
                if (i2.plays == i1.plays) {
                    return Integer.compare(i1.index, i2.index);
                }
                return Integer.compare(i2.plays, i1.plays);
            }
            return Integer.compare(i2.sum, i1.sum);
        });

        for (int i = 0; i < length; i++) {
            System.out.println(albums[i].toString());
        }

        int count = 1;
        list.add(albums[0].index);
        for (int i = 1; i < length; i++) {
            if (count == 2 && albums[i].genres.equals(albums[i - 1].genres)) {
                continue;
            }
            if (!albums[i].genres.equals(albums[i - 1].genres)) {
                count = 0;
            }

            list.add(albums[i].index);
            count ++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static Album[] getAlbums(String[] genres, int[] plays, Map<String, Integer> map) {
        Album[] albums = new Album[genres.length];

        for (int i = 0; i < genres.length; i++) {
            Album album = new Album(genres[i], plays[i], map.get(genres[i]), i);
            albums[i] = album;
        }
        return albums;
    }

    private static Map<String, Integer> getSumOfGenres(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        return map;
    }

    static class Album {
        String genres;
        int plays;
        int sum;
        int index;

        private Album() {
        }

        public Album(String genres, int plays, int sum, int index) {
            this.genres = genres;
            this.plays = plays;
            this.sum = sum;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Album{" +
                    "genres='" + genres + '\'' +
                    ", plays=" + plays +
                    ", sum=" + sum +
                    ", index=" + index +
                    '}';
        }
    }

    public static void main(String[] args) {
        String[] genres = {"c", "a", "b", "a", "a", "b", "b", "b", "b", "c", "c", "c", "d"};
        int[] plays = {1, 500, 9, 600, 501, 800, 500, 300, 2, 2, 1, 2, 100000};

        int[] result = solution(genres, plays);
        System.out.println(Arrays.toString(result));
    }
}

/*테스트 1 〉	통과 (15.59ms, 73.1MB)
테스트 2 〉	통과 (18.73ms, 84.9MB)
테스트 3 〉	통과 (15.50ms, 69.5MB)
테스트 4 〉	통과 (15.30ms, 79MB)
테스트 5 〉	통과 (23.22ms, 84.7MB)
테스트 6 〉	통과 (25.87ms, 91.3MB)
테스트 7 〉	통과 (25.49ms, 78.8MB)
테스트 8 〉	통과 (19.47ms, 85.4MB)
테스트 9 〉	통과 (21.30ms, 76.3MB)
테스트 10 〉	통과 (19.95ms, 77.8MB)
테스트 11 〉	통과 (17.82ms, 79.7MB)
테스트 12 〉	통과 (17.16ms, 85.7MB)
테스트 13 〉	통과 (17.72ms, 86.4MB)
테스트 14 〉	통과 (26.61ms, 85.7MB)
테스트 15 〉	통과 (15.70ms, 77.5MB)*/
