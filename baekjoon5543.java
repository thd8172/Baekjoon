import java.util.Scanner;

public class baekjoon5543 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int bug =  2001;
        int dr  =  2001;

        for (int i = 0; i < 3; i++){
            int shop  = sc.nextInt();
            if (shop < bug){
                bug = shop;
            }
        }
        for (int j = 0;  j < 2; j++){
            int shop = sc.nextInt();
            if (shop < dr){
                dr = shop;
            }
        }
        System.out.println(bug + dr - 50);
    }
}
