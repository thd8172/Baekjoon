import java.util.Scanner;

public class baekjoon10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int car = sc.nextInt();
                    System.out.println("날짜는 " + car + " 입니다.");
            int num = 0;
            for (int i = 0;  i < 5; i++){
                if(sc.nextInt() == car){
                    num ++;
                }
            }
        System.out.println(num);
    }
}