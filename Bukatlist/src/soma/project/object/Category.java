package soma.project.object;

import android.content.Context;

public class Category {
	private String c_id;
	private String c_name;
	private String c_color;
	private int c_bookCount;
	private int c_mainThumb;
	

	public Category(Context context, String c_id, String c_name, String c_color,
			int c_bookCount, int c_mainThumb) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_color = c_color;
		this.c_bookCount = c_bookCount;
		this.c_mainThumb = c_mainThumb;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_color() {
		return c_color;
	}
	public void setC_color(String c_color) {
		this.c_color = c_color;
	}
	public int getC_bookCount() {
		return c_bookCount;
	}
	public void setC_bookCount(int c_bookCount) {
		this.c_bookCount = c_bookCount;
	}
	public int getC_mainThumb() {
		return c_mainThumb;
	}
	public void setC_mainThumb(int c_mainThumb) {
		this.c_mainThumb = c_mainThumb;
	}

	
}