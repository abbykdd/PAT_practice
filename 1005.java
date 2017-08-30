
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ayhan on 2017/8/26.
 */
class Main {
    //6 6 7 8 5 11 3
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] ary = new int[count];
        for(int i=0;i<count;i++){
            ary[i]=in.nextInt();
        }
        Arrays.sort(ary);
        String testStr1="",result="";
        count--;
        while(count>0) {
            int testNum1 = ary[count];
            testStr1 = test(testNum1);
            if (!isTheNumCovered(testNum1,testStr1, ary, ary.length-1)) {
                result = result + testNum1 + " ";
                
            }
            count--;
            
        }
        
        result = result.substring(0,result.length()-1);
        System.out.println(result);
        
    }
    
    
    private static String test(int testNum) {
        String result = "";
        while (testNum > 1 ){
            testNum = counting(testNum);
            result = result + testNum+" ";
        }
        
        return result;
    }
    public static boolean isTheNumCovered(int testNum1,String testStr1,int[] ary,int count) {
        while (count > 0) {
            int testNum2 = ary[count];
            String testStr2 = test(testNum2);
            if (testNum1 != testNum2) {
                if (testStr1.length() <= testStr2.length()) {
                    String one = testStr2.substring(testStr2.length() - testStr1.length());
                    if (testStr2.substring(testStr2.length() - testStr1.length()).equals(testStr1))
                        return true;
                }
            }
            count--;
        }
        return false;
    }
    public static int counting(int num) {
        if (num % 2 == 0)
            num = num / 2;
        else
            num = (3 * num + 1) / 2;
        return num;
    }
}
