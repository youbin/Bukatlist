package soma.project.object;

public class Feed {
	public Feed(String bookImg, String bookNickname, String type,
			int starscore, int likecount, int belongcount) {
		this.bookImg = bookImg;
		this.bookNickname = bookNickname;
		this.type = type;
		this.starscore = starscore;
		this.likecount = likecount;
		this.belongcount = belongcount;
		this.reviewImg = "";
		this.reviewNickname = "";
		this.review = "";
		this.commentImg = "";
		this.commentNickname = "";
		this.comment = "";
	}
	public Feed(String bookImg, String bookNickname, String type,
			int starscore, int likecount, int belongcount, String reviewImg,
			String reviewNickname, String review) {
		this.bookImg = bookImg;
		this.bookNickname = bookNickname;
		this.type = type;
		this.starscore = starscore;
		this.likecount = likecount;
		this.belongcount = belongcount;
		this.reviewImg = reviewImg;
		this.reviewNickname = reviewNickname;
		this.review = review;
		this.commentImg = "";
		this.commentNickname = "";
		this.comment = "";
	}
	public Feed(String bookImg, String bookNickname, String type,
			int starscore, int likecount, int belongcount, String reviewImg,
			String reviewNickname, String review, String commentImg,
			String commentNickname, String comment) {
		this.bookImg = bookImg;
		this.bookNickname = bookNickname;
		this.type = type;
		this.starscore = starscore;
		this.likecount = likecount;
		this.belongcount = belongcount;
		this.reviewImg = reviewImg;
		this.reviewNickname = reviewNickname;
		this.review = review;
		this.commentImg = commentImg;
		this.commentNickname = commentNickname;
		this.comment = comment;
	}
	private String bookImg;
	private String bookNickname;
	private String type;
	private int starscore;
	private int likecount;
	private int belongcount;
	private String reviewImg;
	private String reviewNickname;
	private String review;
	private String commentImg;
	private String commentNickname;
	private String comment;
	public String getBookImg() {
		return bookImg;
	}
	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	public String getBookNickname() {
		return bookNickname;
	}
	public void setBookNickname(String bookNickname) {
		this.bookNickname = bookNickname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getStarscore() {
		return starscore;
	}
	public void setStarscore(int starscore) {
		this.starscore = starscore;
	}
	public int getLikecount() {
		return likecount;
	}
	public void setLikecount(int likecount) {
		this.likecount = likecount;
	}
	public int getBelongcount() {
		return belongcount;
	}
	public void setBelongcount(int belongcount) {
		this.belongcount = belongcount;
	}
	public String getReviewImg() {
		return reviewImg;
	}
	public void setReviewImg(String reviewImg) {
		this.reviewImg = reviewImg;
	}
	public String getReviewNickname() {
		return reviewNickname;
	}
	public void setReviewNickname(String reviewNickname) {
		this.reviewNickname = reviewNickname;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getCommentImg() {
		return commentImg;
	}
	public void setCommentImg(String commentImg) {
		this.commentImg = commentImg;
	}
	public String getCommentNickname() {
		return commentNickname;
	}
	public void setCommentNickname(String commentNickname) {
		this.commentNickname = commentNickname;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
