package truong.vx.SB_TongHopGK;

public class SinhVien {
	private int mssv;
	private String name;
	private float diemTB;
	public SinhVien(int mssv, String name, float diemTB) {
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
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	
}

