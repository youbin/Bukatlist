package soma.project.bukatlist;

import java.util.ArrayList;

import android.content.Context;

public class Wishlist {
	private int c_id;
	private Object c_book1;
	private Object c_book2;
	private Object c_book3;
	
	public Wishlist(Context context, int c_id, Object c_book1, Object c_book2,
			Object c_book3) {
		super();
		this.c_id = c_id;
		this.c_book1 = c_book1;
		this.c_book2 = c_book2;
		this.c_book3 = c_book3;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public Object getC_book1() {
		return c_book1;
	}
	public void setC_book1(Object c_book1) {
		this.c_book1 = c_book1;
	}
	public Object getC_book2() {
		return c_book2;
	}
	public void setC_book2(Object c_book2) {
		this.c_book2 = c_book2;
	}
	public Object getC_book3() {
		return c_book3;
	}
	public void setC_book3(Object c_book3) {
		this.c_book3 = c_book3;
	}
	
	
	
}
