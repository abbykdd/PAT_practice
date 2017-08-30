import java.util.Scanner;

/**
 * Created by Ayhan on 2017/8/29.
 */
class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1 = getPriemNum(num),count=0;
        num = num1-1;
        while(num>0){
            int num2 = getPriemNum(num);
            num = num2-1;
            if(num1-num2==2){
                count ++;
            }
            num1 = num2;
        }
        System.out.println(count);
    }
    public static int getPriemNum(int num){
        if(num>2) {
            for (int i = num; i > 2; i--) {
                int j = i - 1;
                for (; j > 1; j--) {
                    if (i % j == 0) {
                        j = 0;
                        continue;
                    }
                }
                if(j == 1)
                    return i;
            }
        }
        else if(num==2){
            return 2;
        }
        return -1;
    }
}
