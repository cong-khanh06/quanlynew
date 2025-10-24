package doan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

import java.io.*;


public class QuanLyKhachHang implements IQuanly {
	KhachHang qlkh[];
	private Scanner sc=new Scanner(System.in);
	int n;
	public QuanLyKhachHang()
	{
		n=0;
		qlkh=new KhachHang[0];
	}
	
	public void them()
	{
		qlkh=Arrays.copyOf(qlkh, n+1);
		qlkh[n]=new KhachHang();
		qlkh[n].Nhap();
		n++;
	}
	public void xoa()
	{
		int lc;
		do
		{	System.out.println("-------MENU------");
			System.out.println("1.Xoa theo ma khach hang.");
			System.out.println("2.xoa theo ID.");
			System.out.println("Nhap tieu chi ban muon xoa: ");

			lc=sc.nextInt();
			sc.nextLine();
			switch(lc)
			{
				case 1:System.out.println("vui long nhap ma khach: ");
						int ma=sc.nextInt();
						boolean check1=false;
						for(int i=0;i<n;i++)
						{
							if(qlkh[i].getMakh()==ma)
							{
								for(int j=i;j<n-1;j++)
								{
									qlkh[j]=qlkh[j+1];
								}
								
								qlkh=Arrays.copyOf(qlkh, n-1);
								n--;
								check1=true;
								break;
								
							}
						}
						if(check1==false)
						System.out.println("khong co khach hang ban muon xoa!!!");
						break;
						
				case 2:
					System.out.println("nhap ID: ");
					String id=sc.nextLine();
					boolean check2=false;
					for(int i=0;i<n;i++)
					{
						if(qlkh[i].getID().equals(id))
						{
							for(int j=i;j<n-1;j++)
							{
								qlkh[j]=qlkh[j+1];
							}
							qlkh=Arrays.copyOf(qlkh, n-1);
							check2=true;
							n--;
							break;
						}
					}
					if(check2==false)
					System.out.println("khong co khach hang ban muon xoa!!!");
					break;				
						
			}
			
		}while(lc!=1 && lc!=2);
	}
	public void timkiem()
	{
		int lc;
		do
		{	System.out.println("-------MENU------");
			System.out.println("1.Tim theo ma khach hang.");
			System.out.println("2.Tim theo ID.");
			System.out.println("Nhap tieu chi ban muon tim: ");

			lc=sc.nextInt();
			sc.nextLine();
			switch(lc)
			{
				case 1:System.out.println("vui long nhap ma khach hang: ");
						int ma=sc.nextInt();
						boolean check1=false;
						for(int i=0;i<n;i++)
						{
							if(qlkh[i].getMakh()==ma)
							{
								System.out.println(qlkh[i].toString());
								check1=true;
								break;
								
							}
						}
						if(check1==false)
						System.out.println("khong co khach hang ban muon tim!!!");
						break;
						
				case 2:
					System.out.println("nhap ID: ");
					String id=sc.nextLine();
					boolean check2=false;
					for(int i=0;i<n;i++)
					{
						if(qlkh[i].getID().equals(id))
						{
							check2=true;
							System.out.println(qlkh[i].toString());
							break;
						}
					}
					if(check2==false)
					System.out.println("khong co khach hang ban muon tim!!!");
					break;				
						
			}
			
		}while(lc!=1 && lc!=2);
	}
	public void sua()
	{
		System.out.println("nhap ma khach hang cua khach hang can sua: ");
		int ma=sc.nextInt();
		boolean check=false;
		for(int i=0;i<n;i++)
{if(qlkh[i].getMakh()==ma)
			{
				check=true;
				System.out.println("-------MENU-------");
				System.out.println("1.Sua ma khach hang.");
				System.out.println("2.Sua ho ten.");
				System.out.println("Moi ban nhap lua chon: ");
				int lc=sc.nextInt();
				sc.nextLine();
				switch(lc)
				{
					case 1:
						System.out.println("Nhap ma khach hang moi: ");
						int manew=sc.nextInt();
						qlkh[i].setMakh(manew);
						break;
					case 2: 
						System.out.println("Nhap ten khach hang moi: ");
						String tennew =sc.nextLine();
						qlkh[i].setTen(tennew);
						break;
				}
				break;
			}
			
		}
		if(check==false)
		{
			System.out.println("Khong ton tai khach hang can sua!!!");
		}
	}
	public void xuat()
	{
		System.out.println("-------Danh sach-------");
		for(int i=0;i<n;i++)
		{
			System.out.println("thong tin khach hang thu "+(i+1));
			System.out.println(qlkh[i].toString());
		}
	}
	public void sapxep()
	{
		System.out.println("1.Sap xep tang dan theo ma khach hang.");
		System.out.println("3.Nhap lua chon-------");
		int lc=sc.nextInt();
		switch(lc)
		{
			case 1:
				for(int i=0;i<n-1;i++)
				{
					int min=i;
					for(int j=i+1;j<n;j++)
					{
						if(qlkh[min].getMakh()>qlkh[j].getMakh())
						{
							min=j;
						}
					}
					if(i!=min)
					{
						KhachHang t=qlkh[min];
						qlkh[min]=qlkh[i];
						qlkh[i]=t;
					}
				}
				break;
				default :
					break;
		}	
	}
	public void Readfile()
	{
		try {
			BufferedReader ip =new BufferedReader(new FileReader("data.txt"));
			
			String line=ip.readLine();
			n=qlkh.length;
			while(line!=null)
			{
				String a[]=line.split(",");
				qlkh=Arrays.copyOf(qlkh, n+1);
				if(a.length==8)
				{
				qlkh[n]=new KhachHang(Integer.parseInt(a[0]),a[1],(a[2]),a[3],
									a[4],a[5]);
				n++;
				}
				line=ip.readLine();
			}
			ip.close();	
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public void Writefile()
	{
		try 
		{
			FileWriter fw = new FileWriter("thongtin.out");
			for(int i=0;i<qlkh.length;i++)
			{
				fw.write(qlkh[i].toString()+"\n");
			}
			fw.close();
		} 
		catch (Exception e)
		{
				System.out.println(e);
		}

	}
	public void Menu()
	{			
		int lc;
		do {
            System.out.println("-------MENU-------");
			System.out.println("1.Them khach hang.");
			System.out.println("2.Xoa khach hang");
			System.out.println("3.Tim kiem khach hang.");
			System.out.println("4.Sua khach hang.");
			System.out.println("5.Xuat thong tin khach hang.");
			System.out.println("6.sap xep danh sach tang dan");
			System.out.println("7.Doc file.");
			System.out.println("8.Xuat file.");
			System.out.println("0.thoat chuong trinh.");
			System.out.println("---- Nhap lua chon: ");
			 lc=sc.nextInt();
			 sc.nextLine();
			switch(lc)
			{
				case 1:
					this.them();
					break;
				case 2:
					this.xoa();
					break;
				case 3:
					this.timkiem();
					break;
				case 4:
					this.sua();
					break;
				case 5:
					this.xuat();
					break;
case 6:
					this.sapxep();
					break;
				case 7:
					this.Readfile();
					break;
				case 8:
					this.Writefile();
					break;
				default:
					break;
					
			}
		}while(lc!=0);
		
	}
	
	
	public static void main(String args[])
	{
		QuanLyKhachHang ql=new QuanLyKhachHang();
		ql.Menu();
		
	}
}