import java.util.Scanner;

/**
 * Created by Ayhan on 2017/8/24.
 */
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.valueOf(in.nextLine());
        while (count > 0) {
            count--;
            String str = in.nextLine().toUpperCase();
            System.out.println(getResult(str));
        }
    }
    
    public static String getResult(String str) {
        char[] ch = str.toCharArray();
        if (str.equals("PAT"))
            return "YES";
        for (int i = 0; i < ch.length; i++) {
            if (ch.length > 3) {
                if (ch[i] == 'P') {
                    if (ch[i + 1] == 'A' || ch[i + 1] == ' ')
                        if (ch[i + 2] == 'A') {
                            if (ch[i + 3] == 'T') {
                                if(ch.length>4) {
                                    for (int j = i + 4; i < ch.length; i++) {
                                        if (ch[j] != 'A' && ch[j] != ' ')
                                            return "NO";
                                    }
                                    return "YES";
                                }else
                                    return "YES";
                            }
                        } else if (ch[i + 2] == 'T') {
                            for (int j = i + 3; i < ch.length; i++) {
                                if (ch[j] != 'A' && ch[j] != ' ')
                                    return "NO";
                            }
                            return "YES";
                        }
                        else
                            return "NO";
                }
                else if(ch[i] == 'A'|| ch[i] == ' ')
                    continue;
                else
                    return "NO";
            }
            
        }
        return "NO";
    }
}
