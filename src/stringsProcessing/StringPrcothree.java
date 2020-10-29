package stringsProcessing;

import java.util.Scanner;

public class StringPrcothree {
    public static void main(String[] args_){
        Scanner scan = new Scanner(System.in);
        String inp = scan.next();
        int a = scan.nextInt();
        if (a >inp.length()){
            System.out.print(inp);
        } else {
            String a1 = inp.substring(0,a);
            String a2 = inp.substring(a,inp.length());
            System.out.print(a2.concat(a1));
           }
        }
    }

