import java.util.Scanner;

/**
 * Created by Ayhan on 2017-09-05.
 */
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String num = in.next();
        int dividor = in.nextInt();
        StringBuilder  shang = new StringBuilder();
        int remainder = 0;
        int divident;
        for (char digit : num.toCharArray()){
            int digitVal = digit - '0';
            remainder = digitVal + remainder * 10;
            divident = 0;
            while (remainder >= dividor) {
                remainder -= dividor;
                divident += 1;
            }
            
            shang.append(String.valueOf(divident));
        }
        
        String shangStr = shang.toString();
        if (shangStr.substring(0, 1) == "0")
            shangStr = shang.substring(1);
        
        System.out.println(shangStr + " " + String.valueOf(remainder));
    }
}
