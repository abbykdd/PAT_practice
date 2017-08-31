
import java.util.Scanner;

/**
 * Created by Ayhan on 2017/8/30.
 */
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int begainNum = in.nextInt();
        int endNum = in.nextInt();
        int count=0,i=2,counter=0;
        for(;count <endNum;i++ ){
            if(isNumPrim(i)){
                count++;
                if(count>=begainNum){
                    counter++;
                    if(counter%10 == 0||count == endNum){
                        System.out.println(i);
                        continue;
                    }
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static boolean isNumPrim(int num){
        for(int i=2;i <= Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
