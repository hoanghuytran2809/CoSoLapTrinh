package CongTruNhanChiaHaiSoNguyen_package;

import java.util.Scanner;

public class CongTruNhanChiaHaiSoNguyen_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("TONG HIEU TICH THUONG CUA HAI SO NGUYEN");
		System.out.println("Nhap so nguyen a: ");
		int a = sc.nextInt();
		System.out.println("Nhap so nguyen b: ");
		int b = sc.nextInt();
		
		int tong = a + b;
		System.out.println(String.format("Tong: %s + %s = %s", a, b, tong));
		int hieu = a - b;
		System.out.println(String.format("Hieu: %s - %s = %s", a ,b, hieu));
		int tich = a * b;
		System.out.println(String.format("Tich: %s * %s = %s", a ,b, tich));
		int thuong = a / b;
		System.out.println(String.format("Thuong: %s / %s = %s", a ,b, thuong));
		sc.close();

	}
}
