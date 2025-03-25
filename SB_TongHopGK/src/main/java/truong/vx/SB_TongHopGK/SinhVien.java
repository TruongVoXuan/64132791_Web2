package truong.vx.SB_TongHopGK;

public class SinhVien {
	private int mssv;
	private String name;
	private double diemTB;
	public SinhVien(int mssv, String name, double diemTB) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.diemTB = diemTB;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
}

