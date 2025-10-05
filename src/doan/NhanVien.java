package doan;

public class NhanVien extends Nguoi{
	private String Manv;
	private String Chucvu;
	private int Luong;
	public NhanVien()
	{
		super();
		Manv="";
		Chucvu="";
		Luong=0;
	}
	public NhanVien(String manv,String chucvu,int luong,String ID, String ten, String ngaySinh, String gioiTinh, String DiaChi)
	{
		super(ID,ten,ngaySinh,gioiTinh,DiaChi);
		this.Manv=manv;
		this.Chucvu=chucvu;
		this.Luong=luong;
	}
	public void Nhap()
	{
		super.Nhap();
		System.out.println("Nhap ma nhan vien: ");
		Manv=sc.nextLine();
		System.out.println("Nhap chuc vu: ");
		Chucvu=sc.nextLine();
		System.out.println("Nhap luong: ");
		Luong=sc.nextInt();
	}
	public String getManv() {
		return Manv;
	}
	public void setManv(String manv) {
		Manv = manv;
	}
	public String getChucvu() {
		return Chucvu;
	}
	public void setChucvu(String chucvu) {
		Chucvu = chucvu;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	public String toString()
	{
		return super.toString()+"\n"+getManv()+" "+getChucvu()+" "+getLuong();
	}
	public static void main(String[] args) {
		NhanVien nv=new NhanVien();
		nv.Nhap();
		System.out.println(nv.toString());

	}
}
