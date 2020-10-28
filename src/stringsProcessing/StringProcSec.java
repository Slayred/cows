package stringsProcessing;

import java.util.Scanner;

public class StringProcSec {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine().toLowerCase();
        char [] ch = inp.toCharArray();
        int q = -1;
        for (int i = 1; i<ch.length-1;i++){
            if ((ch[i-1] == 't' && ch[i] == 'h') && ch[i+1] == 'e'){
                q = i-1;
                break;
            }

        }
        System.out.print(q);
    }
}
