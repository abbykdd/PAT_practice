import java.util.Scanner;

/**
 * Created by Ayhan on 2017-09-05.
 */
class Main {
    public static void main(String[] main){
        Scanner in = new Scanner(System.in);
        int a,da,b,db;
        a = in.nextInt();
        da = in.nextInt();
        b = in.nextInt();
        db = in.nextInt();
        String pa,pb;
        pa = getString(a,da);
        pb = getString(b,db);
        System.out.println(Integer.valueOf(pa)+Integer.valueOf(pb));
    }
    public static String getString(int num, int dNum){
        String pNum="";
        while(num>0){
            if (num%10 == dNum){
                pNum += dNum;
            }
            num = num/10;
        }
        return pNum;
    }
}
