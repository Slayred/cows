package stringsProcessing;

import java.util.Scanner;

public class StringPorcFirst {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        String inp = scan.nextLine();
        char[] ch = inp.toCharArray();
        int first = 0;
        int second = 0;
        for (int i = 0; i <3; i++) {
            first +=Character.getNumericValue(ch[i]);
        }
        for (int i = 3;i < ch.length;i++) second +=Character.getNumericValue(ch[i]);
        if(first == second) System.out.print("Lucky");
        else System.out.print("Regular");
    }
}
