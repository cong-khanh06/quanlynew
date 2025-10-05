package doan;

import java.util.Scanner;

public class Nguoi {
    public Scanner sc = new Scanner(System.in);
    private String ID;
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String DiaChi;

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

    public Nguoi ten(String ten) {
        setTen(ten);
        return this;
    }

    public Nguoi ngaySinh(String ngaySinh) {
        setNgaySinh(ngaySinh);
        return this;
    }

    public Nguoi gioiTinh(String gioiTinh) {
        setGioiTinh(gioiTinh);
        return this;
    }

    public Nguoi ID(String ID) {
        setID(ID);
        return this;
    }

    public Nguoi DiaChi(String DiaChi) {
        setDiaChi(DiaChi);
        return this;
    }

    public void Nhap() {
        System.out.println("Nhap ID:");
        setID(sc.nextLine());
        System.out.println("Nhap ho ten:");
        setTen(sc.nextLine());
        System.out.println("Nhap ngay sinh:");
        setNgaySinh(sc.nextLine());
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
        setDiaChi(sc.nextLine());
    }

    public String toString() {
        return getID() +
                "    " + getTen() + "    " + getNgaySinh() +
                "       " + getGioiTinh() +
                "       " + getDiaChi();
    }

    public void Xuat() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "ID", "Ho va ten", "Ngay sinh", "Gioi tinh", "Dia chi");
    }
}

