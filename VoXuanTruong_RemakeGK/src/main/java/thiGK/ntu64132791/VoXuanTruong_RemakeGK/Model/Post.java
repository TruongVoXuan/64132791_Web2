package thiGK.ntu64132791.VoXuanTruong_RemakeGK.Model;

public class Post {
	private int id;
	private String title;
	private String content;
	private int categoryId;
	
	public Post() {}

	public Post(int id, String title, String content, int categoryId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	

}
