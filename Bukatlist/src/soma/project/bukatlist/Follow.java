package soma.project.bukatlist;

import java.util.ArrayList;

import android.content.Context;

public class Follow {
	private int u_id;
	private String u_name;
	private Object follower;
	private Object following;
	
	public Follow(Context context, int u_id, String u_name, Object follower) {
		super();
		this.u_id = u_id;
		this.u_name =u_name;
		this.follower = follower;
//		this.following = following;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public Object getFollower() {
		return follower;
	}
	public void setFollower(Object follower) {
		this.follower = follower;
	}
	public Object getFollowing() {
		return following;
	}
	public void setFollowing(Object following) {
		this.following = following;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	
}
