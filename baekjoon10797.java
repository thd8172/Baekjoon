import java.util.Scanner;

public class baekjoon10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              int car  = sc.nextInt();
              int bnm = 0;
              for (int i = 0; i < 5; i++){
                  if (sc.nextInt() == car){
                      bnm++;
                  }
              }
        System.out.println(bnm);
    }
}