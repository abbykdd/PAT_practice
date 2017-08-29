import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count =1;
        String result = "";
        while(num > 0){
            if (num>100){
                num = num-100;
                result = result+"B";
            }
            else if(num>10){
                num = num - 10;
                result = result+"S";
            }
            else if(num>0){
                num = num - 1;
                result = result + count;
                count++;
            }
        }
        System.out.println(result);
    }
}
