package teste;

import java.io.*;
import java.util.Scanner;

public class Soma {
	public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int total = 0;
        for(int i = 0; i < n; i ++){
            int num = s.nextInt();
            int numFinal = s.nextInt();
            for(; num <= numFinal; num++){
                int raiz = (int)Math.sqrt(num);
                if(	num == raiz * raiz){
                    total++;
                }
            }
            System.out.println(total);
            total = 0;
        }
    }
}