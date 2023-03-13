
    import java.util.Scanner;

    public class baekjoon10808{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String S = sc.next();
            int[] count = new int[26]; // 알파벳 개수를 저장할 배열

            // 각 알파벳이 단어에 몇 개가 포함되어 있는지 구함
            for (int i = 0; i < S.length(); i++) {
                count[S.charAt(i) - 'a']++;
            }

            // 결과 출력
            for (int i = 0; i < 26; i++) {
                System.out.print(count[i] + " ");
            }
        }
    }

