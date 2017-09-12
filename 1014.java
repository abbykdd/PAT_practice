
import java.util.Scanner;

/**
 * Created by Ayhan on 2017-08-31.
 */
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char week,hour;
        char[] weekAndHour = test1and2(in.next(),in.next());
        int mins = test3and4(in.next(),in.next());
        printWeek(weekAndHour[0]);
        printHour(weekAndHour[1]);
        if(mins<10)
            System.out.println("0"+mins);
        else
            System.out.println(mins);
    }
    public static char[] test1and2(String str1,String str2){
        char[] ch = new char[2];
        int ind = 0;
        for(int i=0;i<str1.length();i++) {
            if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
                if (str2.indexOf(str1.charAt(i)) >= 0) {
                    ch[ind] = str1.charAt(i);
                    ind++;
                }
        }
        return ch;
    }
    public static int test3and4(String str3,String str4){
        for(int i=0;i<str3.length();i++){
            if(str4.indexOf(str3.charAt(i)) >= 0){
                return str4.indexOf(str3.charAt(i));
            }
        }
        return -1;
    }
    public static void printWeek(char week){
        switch(week-'A'){
            case 0:
                System.out.print("MON ");
                break;
            case 1:
                System.out.print("TUE ");
                break;
            case 2:
                System.out.print("WED ");
                break;
            case 3:
                System.out.print("THU ");
                break;
            case 4:
                System.out.print("FRI ");
                break;
            case 5:
                System.out.print("SAT ");
                break;
            case 6:
                System.out.print("SUN ");
                break;
        }
    }
    public static void printHour(char hour){
        int cha = hour-'A';
        System.out.print(9+cha+1+":");
    }
    
}
