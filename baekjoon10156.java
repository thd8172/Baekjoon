import java.util.Scanner;

public class baekjoon10156 {
    public static void main(String[] args) {
            //백준 2742
        Scanner sc = new Scanner(System.in);

        int  cook = sc.nextInt();
        int  bank = sc.nextInt();
        int  tm = sc.nextInt();

        if (cook*bank < tm){
            System.out.println(0);
        }
        else{
            System.out.println(cook * bank - tm);
        }


    }
}