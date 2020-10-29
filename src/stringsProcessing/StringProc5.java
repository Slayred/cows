package stringsProcessing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringProc5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] inp1 = inp.split("");
        String[] out = new String[inp1.length];
        int k = 0;
        for (int i = out.length-1; i>=0;i--){
            out[i] = inp1[k];
            k++;
        }
        String out1 = Arrays.toString(out).replaceAll("[, \\[\\]]", "");
        if(inp.equals(out1)) System.out.print("yes");
        else System.out.print("no");
    }
}
