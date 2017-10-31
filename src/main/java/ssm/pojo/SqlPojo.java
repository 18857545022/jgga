package ssm.pojo;

public class SqlPojo {
	
	private String month;
	private String zjhm;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getZjhm() {
		return zjhm;
	}
	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}
	@Override
	public String toString() {
		return "sqlPojo [month=" + month + ", zjhm=" + zjhm + "]";
	}
	
	

}
