import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * Created by Ayhan on 2017/8/30.
 */
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = 0, a2 = 0, a3 = 0, a5 = 0;
        double a4 = 0;
        int countA2 = 1,countA4=0,count=in.nextInt();
        while (count>0) {
            int num = in.nextInt();
            int devie = num % 5;
            switch (devie) {
                    //13 1 2 3 4 5 6 7 8 9 10 20 16 18
                case 0:
                    if (num % 2 == 0) {
                        a1 += num;
                    }
                    break;
                case 1:
                    if (countA2 == 1) {
                        a2 = a2 + num;
                        countA2++;
                    }
                    else {
                        a2 = a2 - num;
                        countA2 = 1;
                    }
                    break;
                case 2:
                    a3++;
                    break;
                case 3:
                    a4 += num;
                    countA4++;
                    break;
                case 4:
                    if (a5 < num)
                        a5 = num;
                    break;
            }
            count--;
        }
        String result = "",aa4;
        a4 = a4/countA4;
        
        if (a1 ==0)
            result = "N ";
        else
            result = a1 +" ";
        if(a2 == 0)
            result = result+"N ";
        else
            result = result +a2+" ";
        if(a3 == 0)
            result = result +"N ";
        else
            result = result + a3+" ";
        aa4 = a4+"";
        if(aa4.equals("NaN")) {
            aa4 = "N";
            result = result +aa4 + " ";
        }
        else {
            aa4 = String.format("%.1f",a4);
            result = result +aa4 + " ";
        }
        if(a5 == 0)
            result = result +"N";
        else
            result = result + a5;
        
        System.out.println(result);
    }
}
