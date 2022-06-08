package entity;

public class Teacher {
	private String tname;
	private String subject;
	

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Teacher [tname=" + tname + ", subject=" + subject + "]";
	}
}
