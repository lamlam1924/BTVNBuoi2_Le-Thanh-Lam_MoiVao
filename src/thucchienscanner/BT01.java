package thucchienscanner;

import java.util.Scanner;

public class BT01 {

    public static boolean perfectNumber(int a) {
        int sum = 0;        
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return a == sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen thu nhat: ");
        int n1 = Integer.parseInt(sc.nextLine());        
        System.out.print("Nhap so nguyen thu hai: ");
        int n2 = Integer.parseInt(sc.nextLine());
        
        System.out.println(perfectNumber(n1));
        System.out.println(perfectNumber(n2));
    }
    
}
