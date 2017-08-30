import java.util.Scanner;

/**
 * Created by Ayhan on 2017/8/29.
 */
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String sents = in.nextLine();
        int count =0;
        String result = "";
        while(count < sents.length()){
            int endInd = sents.indexOf(" ",count);
            if(endInd>0) {
                String word = sents.substring(count, endInd);
                count = endInd + 1;
                result = word + " " + result;
            }
            else if(endInd==-1){
                String word = sents.substring(count);
                result = word + " " + result;
                count = sents.length();
            }
        }
        System.out.println(result.substring(0,result.length()-1));
    }
}
