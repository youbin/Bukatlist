package soma.project.object;

public class Comment {
	private String nickname;
	private String picture;
	private String comment;
	
	public Comment(String nickname, String picture, String comment) {
		this.nickname = nickname;
		this.picture = picture;
		this.comment = comment;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
