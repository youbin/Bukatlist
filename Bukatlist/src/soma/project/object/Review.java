package soma.project.object;

public class Review {
	private String nickname;
	private String picture;
	private String review;
	
	public Review(String nickname, String picture, String review) {
		this.nickname = nickname;
		this.picture = picture;
		this.review = review;
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
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
}
