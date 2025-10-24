package doan;
public class KhachHang extends Nguoi {
    private int Makh;
	public static int soluong;
	public KhachHang()
	{
		super();
		Makh=0;
		soluong++;
	}
	public KhachHang(int makh,String ten, String ID, String ngaySinh, String gioiTinh, String DiaChi)
	{
		super(ID,ten,ngaySinh,gioiTinh,DiaChi);
		this.Makh=Makh;
	}
	public void Nhap()
	{       System.out.println("Nhap ma khach hang: ");
			Makh=sc.nextInt();
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
			
	}
	public int getMakh() {
		return Makh;
	}
	public void setMakh(int makh) {
		Makh = makh;
	}
	public String toString()
	{
		return super.toString()+" "+getMakh();
	}
	public int tongthanhvien()
	{
		return soluong;
	}
}