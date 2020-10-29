package stringsProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class StringProc7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        char[] ch = new char['z' - 'a'+1];
        char i = 'a';
        for(int j = 0; j < ch.length;j++) {
                ch[j] = i;
                i++;
        }

    }
}
