import java.util.Scanner;

public class baekjoon5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int yun = 0;
        int  k = 0;
        int j = 0;
        for (int i = 0; i < 4; i++ ){
             k = sc.nextInt();
            num += k;
        }

        for (int u = 0; u < 4; u++){
             j  = sc.nextInt();
            yun += j;
        }
        if (num>yun){
            System.out.println(num);
        }else if (yun > num){
            System.out.println(yun);
        }
    }
}