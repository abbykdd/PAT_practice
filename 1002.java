import java.util.Scanner;

/**
 * Created by Ayhan on 2017-08-22.
 */
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        int result = 0;
        for(int i = 0; i < num.length(); i++){
            result += num.charAt(i)-'0';
        }
        String resStr = "";
        while(result>0){
            if (resStr == ""){
                resStr = getPinYin(result%10);
                result = result/10;
            }
            else{
                resStr = getPinYin(result%10)+" "+resStr;
                result = result/10;
            }
        }
        
        
        System.out.print(resStr);
        
    }
    
    private static String getPinYin(int num) {
        switch (num) {
            case 1:
                return "yi";
            case 2:
                return "er";
            case 3:
                return "san";
            case 4:
                return "si";
            case 5:
                return "wu";
            case 6:
                return "liu";
            case 7:
                return "qi";
            case 8:
                return "ba";
            case 9:
                return "jiu";
            default:
                return "ling";
                
        }
    }
}
