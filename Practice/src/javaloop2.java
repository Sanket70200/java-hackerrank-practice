import java.util.Scanner;
import java.util.*;
import java.io.*;

class javaloop2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int current = a;
            int power = 1;

            for (int j = 0; j < n; j++) {
                current += b * power;
                System.out.print(current + " ");
                power *= 2;
            }
            System.out.println();
        }

        in.close();
    }
}
