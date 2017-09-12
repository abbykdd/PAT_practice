import java.util.Scanner;

/**
 * Created by Ayhan on 2017-09-05.
 */
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        StringBuilder jiaWin = new StringBuilder();
        StringBuilder yiWin = new StringBuilder();
        int equal = 0;
        while (count > 0) {
            char jiaCh = in.next().charAt(0);
            char yiCh = in.next().charAt(0);
            if (jiaCh == 'J') {
                if (yiCh == 'B')
                    jiaWin.append("J");
                else if (yiCh == 'J')
                    equal++;
                else {//if(yiCh == 'C') {
                    yiWin.append("C");
                }
            } else if (jiaCh == 'B') {
                if (yiCh == 'B')
                    equal++;
                else if (yiCh == 'J')
                    yiWin.append("J");
                else //if(yiCh == 'C') {
                    jiaWin.append("B");
            } else {//if(jiaCh == 'C'){
                if (yiCh == 'B')
                    yiWin.append("B");
                else if (yiCh == 'J')
                    jiaWin.append("C");
                else if (yiCh == 'C')
                    equal++;
                
            }
            count--;
        }
        
        String jiaWinStr = jiaWin.toString();
        String yiWinStr = yiWin.toString();
        System.out.println(jiaWinStr.length() + " " + equal + " " + yiWinStr.length());
        System.out.println(yiWinStr.length() + " " + equal + " " + jiaWinStr.length());
        
        printChar(jiaWinStr);
        System.out.print(" ");
        printChar(yiWinStr);
    }
    
    private static void printChar(String str) {
        int b = 0, c = 0, j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'B')
                b++;
            else if (str.charAt(i) == 'C')
                c++;
            else
                j++;
        }
        if (b >= c && b >= j)
            System.out.print("B");
        else if (c > b && c >= j)
            System.out.print("C");
        else
            System.out.print("J");
    }
}
