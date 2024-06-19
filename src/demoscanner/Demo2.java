
package demoscanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();
        
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        
        System.out.print("Nhap dia chi: ");
        String address = sc.nextLine();
        
        System.out.print("Nhap sdt: ");
        int numberPhone = Integer.parseInt(sc.nextLine());
        
        System.out.print("Nhap chuyen nganh: ");
        String major = sc.nextLine();
    }
}
