package doan;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;
    private String loaiSP;
    public static int dem = 0;

    Scanner sc = new Scanner(System.in);

    public SanPham() {
        maSP = "";
        tenSP = "";
        gia = 0;
        soLuong = 0;
        loaiSP = "";
        dem++;
    }

    public SanPham(String maSP, String tenSP, double gia, int soLuong, String loaiSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.loaiSP = loaiSP;
        dem++;
    }

    public void Nhap() {
        System.out.println("Nhập mã sản phẩm: ");
        maSP = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.println("Nhập giá: ");
        gia = sc.nextDouble();
        System.out.println("Nhập số lượng: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập loại sản phẩm: ");
        loaiSP = sc.nextLine();
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String toString() {
        return maSP + " | " + tenSP + " | " + gia + " | " + soLuong + " | " + loaiSP;
    }
    public static void main(String[] args) {
		
	}
}
