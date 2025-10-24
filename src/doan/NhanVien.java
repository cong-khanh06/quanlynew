package doan;

import java.util.Scanner;

public class NhanVien extends Nguoi{
	private int Manv;
	private String Chucvu;
	private double Luong;
	public static int soluong;
	public NhanVien()
	{
		super();
		Manv=0;
		Chucvu="";
		Luong=0;
		soluong++;
	}
	public NhanVien(int manv,String chucvu,int luong,String ID, String ten, String ngaySinh, String gioiTinh, String DiaChi)
	{
		super(ID,ten,ngaySinh,gioiTinh,DiaChi);
		this.Manv=manv;
		this.Chucvu=chucvu;
		this.Luong=luong;
	}
	public void Nhap()
	{
		 	System.out.println("Nhap ID:");
		 	ID=sc.nextLine();
		 	System.out.println("Nhap ho ten:");
	        ten=sc.nextLine();
	        System.out.println("Nhap ngay sinh:");
	        ngaySinh=sc.nextLine();
	        System.out.println("Chon gioi tinh:\n1: Nam\n2: Nu");
	        int key;
	        do {
	            key = Integer.parseInt(sc.nextLine());
	            switch (key) {
	                case 1:
	                    setGioiTinh("Nam");
	                    break;
	                case 2:
	                    setGioiTinh("Nu");
	                    break;
	            }
	            if (key != 1 && key != 2)
	                System.out.println("Yeu cau nhap lai!\n");
	        } while (key != 1 && key != 2);
	        System.out.println("Nhap dia chi: ");
	        DiaChi=sc.nextLine();
			System.out.println("Nhap ma nhan vien: ");
			Manv=sc.nextInt();
			System.out.println("Nhap luong: ");
			Luong=sc.nextDouble();
			sc.nextLine();
			System.out.println("Nhap chuc vu: ");
			Chucvu=sc.nextLine();
	}
	public int getManv() {
		return Manv;
	}
	public void setManv(int manv) {
		Manv = manv;
	}
	public String getChucvu() {
		return Chucvu;
	}
	public void setChucvu(String chucvu) {
		Chucvu = chucvu;
	}
	public Double getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	public String toString()
	{
		return super.toString()+" "+getManv()+" "+getChucvu()+" "+String.format("%.2f",getLuong());
	}
	public int tongthanhvien()
	{
		return soluong;
	}
}
