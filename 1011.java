import java.util.Scanner;

/**
 * Created by Ayhan on 2017/8/30.
 */
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int num=1;
        while(count>=num){
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            if(a+b>c)
                System.out.println("Case #"+num+": true");
            else
                System.out.println("Case #"+num+": false");
            num++;
        }
    }
}
