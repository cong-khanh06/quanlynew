package doan;

import java.io.*;
import java.util.*;

public class QuanLySanPham implements IQuanly {
    private SanPham[] ds;
    private int n;
    private Scanner sc = new Scanner(System.in);

    public QuanLySanPham() {
        ds = new SanPham[0];
        n = 0;
    }

    @Override
    public void them() {
        ds = Arrays.copyOf(ds, n + 1);
        ds[n] = new SanPham();
        ds[n].Nhap();
        n++;
    }

    @Override
    public void sua() {
        System.out.print("Nhập mã sản phẩm cần sửa: ");
        String ma = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSP().equalsIgnoreCase(ma)) {
                found = true;
                System.out.println("1. Sửa tên sản phẩm");
                System.out.println("2. Sửa giá");
                System.out.println("3. Sửa số lượng");
                System.out.println("4. Sửa loại sản phẩm");
                System.out.print("Chọn mục cần sửa: ");
                int lc = sc.nextInt();
                sc.nextLine();

                switch (lc) {
                    case 1:
                        System.out.print("Nhập tên mới: ");
                        ds[i].setTenSP(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Nhập giá mới: ");
                        ds[i].setGia(sc.nextDouble());
                        break;
                    case 3:
                        System.out.print("Nhập số lượng mới: ");
                        ds[i].setSoLuong(sc.nextInt());
                        break;
                    case 4:
                        System.out.print("Nhập loại mới: ");
                        sc.nextLine();
                        ds[i].setLoaiSP(sc.nextLine());
                        break;
                }
                break;
            }
        }
        if (!found)
            System.out.println("Không tìm thấy sản phẩm!");
    }

    @Override
    public void xoa() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String ma = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSP().equalsIgnoreCase(ma)) {
                for (int j = i; j < n - 1; j++)
                    ds[j] = ds[j + 1];
                ds = Arrays.copyOf(ds, n - 1);
                n--;
                found = true;
                System.out.println("Đã xóa sản phẩm!");
                break;
            }
        }
        if (!found)
            System.out.println("Không tìm thấy sản phẩm để xóa!");
    }

    @Override
    public void timkiem() {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String ma = sc.nextLine();
        boolean found = false;

        for (SanPham sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
System.out.println(sp.toString());
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Không tìm thấy sản phẩm!");
    }

    @Override
    public void Readfile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sanpham.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                ds = Arrays.copyOf(ds, n + 1);
                ds[n] = new SanPham(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4]);
                n++;
            }
            br.close();
            System.out.println("Đọc file thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }

    @Override
    public void Writefile() {
        try {
            FileWriter fw = new FileWriter("sanpham_out.txt");
            for (SanPham sp : ds) {
                fw.write(sp.toString() + "\n");
            }
            fw.close();
            System.out.println("Ghi file thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    public void xuat() {
        System.out.println("----- DANH SÁCH SẢN PHẨM -----");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + ds[i].toString());
        }
    }

    public void sapxep() {
        Arrays.sort(ds, Comparator.comparing(SanPham::getGia));
        System.out.println("Đã sắp xếp theo giá tăng dần!");
    }

    public void Menu() {
        int lc;
        do {
            System.out.println("----- MENU QUẢN LÝ SẢN PHẨM -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Xuất danh sách");
            System.out.println("6. Sắp xếp theo giá");
            System.out.println("7. Đọc file");
            System.out.println("8. Ghi file");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            lc = sc.nextInt();
            sc.nextLine();
            switch (lc) {
                case 1 -> them();
                case 2 -> xoa();
                case 3 -> sua();
                case 4 -> timkiem();
                case 5 -> xuat();
                case 6 -> sapxep();
                case 7 -> Readfile();
                case 8 -> Writefile();
            }
        } while (lc != 0);
    }

    public static void main(String[] args) {
        QuanLySanPham ql = new QuanLySanPham();
        ql.Menu();
    }
}
