package doan;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLyNhanVien {
	NhanVien qlnv[];
	int n;
	Scanner sc=new Scanner(System.in);
	public void Nhap()
	{
		System.out.println("Nhap so luong nhan vien: ");
		n=sc.nextInt();
		qlnv=new NhanVien[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap thong tin nhan vien thu"+(i+1));
			qlnv[i]=new NhanVien();
			qlnv[i].Nhap();
			
		}
	}
	public void them()
	{
		qlnv=Arrays.copyOf(qlnv, n+1);
		qlnv[n]=new NhanVien();
		qlnv[n].Nhap();
		n++;
	}
	public void xoa()
	{
		int lc;
		do
		{	System.out.println("-------MENU------");
			System.out.println("1.Xoa theo ma nhan vien.");
			System.out.println("2.xoa theo ID.");
			System.out.println("Nhap tieu chi ban muon xoa: ");

			lc=sc.nextInt();
			sc.nextLine();
			switch(lc)
			{
				case 1:System.out.println("vui long nhap ma nhan vien: ");
						String ma=sc.nextLine();
						boolean check1=false;
						for(int i=0;i<n;i++)
						{
							if(qlnv[i].getManv().equals(ma))
							{
								for(int j=i;j<n-1;j++)
								{
									qlnv[j]=qlnv[j+1];
								}
								
								qlnv=Arrays.copyOf(qlnv, n-1);
								n--;
								check1=true;
								break;
								
							}
						}
						if(check1==false)
						System.out.println("khong co nhan vien ban muon xoa!!!");
						break;
						
				case 2:
					System.out.println("nhap ID: ");
					String id=sc.nextLine();
					boolean check2=false;
					for(int i=0;i<n;i++)
					{
						if(qlnv[i].getID().equals(id))
						{
							for(int j=i;j<n-1;j++)
							{
								qlnv[j]=qlnv[j+1];
							}
							qlnv=Arrays.copyOf(qlnv, n-1);
							check2=true;
							n--;
							break;
						}
					}
					if(check2==false)
					System.out.println("khong co nhan vien ban muon xoa!!!");
					break;				
						
			}
			
		}while(lc!=1 && lc!=2);
	}
	public void timkiem()
	{
		int lc;
		do
		{	System.out.println("-------MENU------");
			System.out.println("1.Tim theo ma nhan vien.");
			System.out.println("2.Tim theo ID.");
			System.out.println("Nhap tieu chi ban muon tim: ");

			lc=sc.nextInt();
			sc.nextLine();
			switch(lc)
			{
				case 1:System.out.println("vui long nhap ma nhan vien: ");
						String ma=sc.nextLine();
						boolean check1=false;
						for(int i=0;i<n;i++)
						{
							if(qlnv[i].getManv().equals(ma))
							{
								System.out.println(qlnv[i].toString());
								check1=true;
								break;
								
							}
						}
						if(check1==false)
						System.out.println("khong co nhan vien ban muon tim!!!");
						break;
						
				case 2:
					System.out.println("nhap ID: ");
					String id=sc.nextLine();
					boolean check2=false;
					for(int i=0;i<n;i++)
					{
						if(qlnv[i].getID().equals(id))
						{
							check2=true;
							System.out.println(qlnv[i].toString());
							break;
						}
					}
					if(check2==false)
					System.out.println("khong co nhan vien ban muon tim!!!");
					break;				
						
			}
			
		}while(lc!=1 && lc!=2);
	}
	public void sua()
	{
		System.out.println("nhap ma nhan vien cua nhan vien can sua: ");
		String ma=sc.nextLine();
		boolean check=false;
		for(int i=0;i<n;i++)
		{
			if(qlnv[i].getManv().equals(ma))
			{
				check=true;
				System.out.println("-------MENU-------");
				System.out.println("1.Sua ma nhan vien.");
				System.out.println("2.Sua ho ten.");
				System.out.println("3.Sua luong.");
				System.out.println("4.Sua chuc vu.");
				System.out.println("Moi ban nhap lua chon: ");
				int lc=sc.nextInt();
				sc.nextLine();
				switch(lc)
				{
					case 1:
						System.out.println("Nhap ma nhan vien moi: ");
						String manew=sc.nextLine();
						qlnv[i].setManv(manew);
						break;
					case 2: 
						System.out.println("Nhap ten nhan vien moi: ");
						String tennew =sc.nextLine();
						qlnv[i].setTen(tennew);
						break;
					case 3:
						System.out.println("Nhap luong nhan vien moi: ");
						int luongnew=sc.nextInt();
						qlnv[i].setLuong(luongnew);
						break;
					case 4:
						System.out.println("Nhap chuc vu nhan vien moi: ");
						String chucvunew=sc.nextLine();
						qlnv[i].setChucvu(chucvunew);
						break;
				}
				break;
			}
			
		}
		if(check==false)
		{
			System.out.println("Khong ton tai nhan vien can sua!!!");
		}
	}
	public void xuat()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("thong tin nhan vien thu "+(i+1));
			System.out.println(qlnv[i].toString());
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		QuanLyNhanVien qlnv=new QuanLyNhanVien();
		qlnv.Nhap();
		System.out.println("-------MENU-------");
		System.out.println("1.Them nhan vien.");
		System.out.println("2.Xoa nhan vien.");
		System.out.println("3.Tim kiem nhan vien.");
		System.out.println("4.Sua nhan vien.");
		System.out.println("5.Xuat thong tin nhan vien.");
		System.out.println("0.thoat chuong trinh.");
		System.out.println("---- Nhap lua chon: ");
		int lc;
		do {
			 lc=sc.nextInt();
			switch(lc)
			{
				case 1:
					qlnv.them();
					break;
				case 2:
					qlnv.xoa();
					break;
				case 3:
					qlnv.timkiem();
					break;
				case 4:
					qlnv.sua();
					break;
				case 5:
					qlnv.xuat();
					break;
				default:
					break;
					
			}
		}while(lc!=0);
		
		
	}
}
