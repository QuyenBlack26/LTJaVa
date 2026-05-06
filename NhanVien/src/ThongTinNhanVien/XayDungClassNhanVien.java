package ThongTinNhanVien;
import java.util.*;

public class XayDungClassNhanVien 
{
	public class NhanVien
	{
		private String Ho,Ten;
		private int SoLuongSP;
		
		public NhanVien(String Ho, String Ten, int SoLuongSP)
		{
			this.Ho = Ho;
			this.Ten = Ten;
			this.SoLuongSP = SoLuongSP; 
		}
		
		public String getho()
		{
			return Ho;
		}
		public void setho(String ho)
		{
			this.Ho = ho;
		}
		
		public String geten()
		{
			return Ten;
		}
		public void setten(String ten)
		{
			this.Ten = ten;
		}
		
		public int getSoLuongSP()
		{
			return SoLuongSP;
		}
		public void setSoLuongSP(int SP)
		{
			this.SoLuongSP = SP;
		} 

		
		
	}

	public static void main(String[] args) 
	{
		int n = 0;
		System.out.println("Nhap so Nhan Vien muon nhap : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		// TODO Auto-generated method stub
		try
		{	
			for (int i = 0; i < n ; i++ )
			{
				String Ho = sc.nextLine();
				String Ten = sc.nextLine();
				int SoLuongSP = sc.nextInt();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			
		}

	}


}
