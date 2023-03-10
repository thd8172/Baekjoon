import java.util.Scanner;

public class man {
    public static void main(String[] args) {
        //알고리즘 10039번
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int y = sc.nextInt();
            sum += y > 40 ? y : 40;
        }
        System.out.println(sum / 5);
    }
}