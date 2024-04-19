package mx.utng;

import java.util.Scanner;

public class ciclos {

    public static void main(String[] args) {
        //ciclo For
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tabla deseas");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
        //    System.out.println("5x"+i+"="+5*i);
        System.out.printf("%dx%d=%d\n" ,n,i,n*i);
    
        }

        short[] valores = {1,2,3,4,5,6,8,9};
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%dx%d=%d\n" ,n,valores[i],n*valores[i]);

        }
        System.out.println("\n\n");
        for (short s : valores) {
         System.out.printf("%dx%d=%d\n" ,n,s,n*s);

        }
        System.out.println("");

        //while
        short i = 0;
        while (++i <=10) {
            System.out.println(i);
            
        }

        //do-while

        i = 1;
        do{
            System.out.println(i);

        }while(i++ <10);
    }
    
}
