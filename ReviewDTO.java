package Review;

public class ReviewDTO {

		private String sex;
		private String comment;
		
		
		public String getSex()
		{
			return sex;
		}
		public void setSex(String sex) 
		{
			this.sex = sex;
		}
		public String getCommnet()
		{
			return comment;
		}
		public void setComment(String comment) 
		{
			this.comment = comment;
		}
		public String toString() {
	        return "WordDTO [sex=" + sex + ", comment=" + comment + "]";
	    }
}
	


