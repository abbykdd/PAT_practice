import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Ayhan on 2017-09-10.
 */
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num != 6174) {
            int[] numArry = new int[4];
            for (int i = 0; i < numArry.length; i++) {
                numArry[i] = num % 10;
                num = num / 10;
            }
            Arrays.sort(numArry);
            String resultStr = "";
            if (numArry[0] == numArry[1] && numArry[0] == numArry[2] && numArry[0] == numArry[3]) {
                for (int i = 0; i < numArry.length; i++)
                    System.out.print(numArry[i]);
                System.out.print(" - ");
                for (int i = numArry.length - 1; i >= 0; i--)
                    System.out.print(numArry[i]);
                System.out.println(" = 0000");
                System.exit(0);
            } else {
                int numShun = Integer.valueOf(numArry[0] + "" + numArry[1] + numArry[2] + numArry[3]);
                int numFan = Integer.valueOf(numArry[3] + "" + numArry[2] + "" + numArry[1] + "" + numArry[0]);
                resultStr = String.valueOf(numFan - numShun);
                while (resultStr.length() < 4) {
                    resultStr = "0" + resultStr;
                }
                for (int i = numArry.length - 1; i >= 0; i--)
                    System.out.print(numArry[i]);
                System.out.print(" - ");
                for (int i = 0; i < numArry.length; i++)
                    System.out.print(numArry[i]);
                
                
                System.out.println(" = " + resultStr);
                num = numFan - numShun;
            }
        }
        
    }
}
