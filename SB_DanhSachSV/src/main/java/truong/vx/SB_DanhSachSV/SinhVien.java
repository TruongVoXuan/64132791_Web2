package truong.vx.SB_DanhSachSV;

public class SinhVien {
	private int mssv;
	private String name;
	private String year_of_birth;
	private String sex;
	public SinhVien(int mssv, String name, String year_of_birth, String sex) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.year_of_birth = year_of_birth;
		this.sex = sex;
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
	public String getYear_of_birth() {
		return year_of_birth;
	}
	public void setYear_of_birth(String year_of_birth) {
		this.year_of_birth = year_of_birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
