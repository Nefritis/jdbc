package jdbc;

public class AuthorVo {
	private Long no;
	private String name;
	private String desc;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "AuthorVo [no=" + no + ", name=" + name + ", desc=" + desc + "]";
	}
	
}
