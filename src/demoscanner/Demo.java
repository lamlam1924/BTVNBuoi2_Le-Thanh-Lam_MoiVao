package demoscanner;

import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();
        
        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        
        System.out.print("Nhap sdt: ");
        int sdt = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nhap chuyen nganh: ");
        String chuyenNganh = sc.nextLine();
    }
    
}
