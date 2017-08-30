import java.util.Scanner;

/**
 * Created by Ayhan on 2017/8/29.
 */
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int count = in.nextInt();
        int[] ary = new int[len];
        for(int i=0;i<len;i++)
            ary[i] = in.nextInt();
        while(count>0){
            for(int i=0,j=len-1; i<len;i++){
                int temp = ary[i];
                ary[i] = ary[j];
                ary[j] = temp;
            }
            count--;
        }
        for(int i=0;i<len-1;i++)
            System.out.print(ary[i]+" ");
        System.out.println(ary[len-1]);
    }
}
