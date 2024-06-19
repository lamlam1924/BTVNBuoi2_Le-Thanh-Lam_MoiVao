package thucchienscanner;

import java.util.Scanner;

public class BT02 {

    public static boolean checkChanLe(int n) {
        return n % 2 == 0;
    }

    public static void veHinhVuong(int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void veTamGiacCan(int k) {
        for (int i = 0; i < k; i++) {
            for (int j = k-1; j > i; j--) { 
                System.out.print(" ");
            }
            for (int p = 0; p <= (2 * i ); p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int a = sc.nextInt();

        if (checkChanLe(a)) {
            veHinhVuong(a);
        } else {
            veTamGiacCan(a);
        }
    }
}
