package doan;

import java.util.Scanner;
public abstract class Nguoi {
    protected String ID;
    protected String ten;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String DiaChi;
   public Scanner sc=new Scanner(System.in);

    public Nguoi() {
        ten = "";
        ngaySinh = "";
        gioiTinh = "";
        ID = "";
        DiaChi = "";
    }

    public Nguoi(String ID, String ten, String ngaySinh, String gioiTinh, String DiaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.ID = ID;
        this.DiaChi = DiaChi;
    }

    public abstract void Nhap();

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDiaChi() {
        return this.DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String toString() {
        return getID() + "  " + getTen() + " " + getNgaySinh() + " " + getGioiTinh() +" " + getDiaChi();
    }
}

