import java.util.Scanner;

/**
 * Created by Ayhan on 2017-08-22.
 */
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        while (num > 1 ){
            num = counting(num);
            count ++;
        }
        System.out.println(count);
    }
    public static int counting(int num) {
        if (num % 2 == 0)
            num = num / 2;
        else
            num = (3 * num + 1) / 2;
        return num;
    }
}
