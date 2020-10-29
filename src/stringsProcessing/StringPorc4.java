package stringsProcessing;

import java.util.Scanner;

public class StringPorc4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] ar = inp.split(" ");
        String out = " ";
        int k = 0;
        for(int i = 0; i<ar.length; i++){
            if(k<ar[i].length()){
                k = ar[i].length();
                out = ar[i];
            }
        }
        System.out.print(out);
    }
}
