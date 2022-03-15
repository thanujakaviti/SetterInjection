package in.jt;

public class Student {
	private int sid;
	private String sname;
	private Address address;
	
	
	public Student() {
		super();
		System.out.println("Student :: Constructor");
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.err.println("SETTER METHOD :: Address Object Is Injecting Into Student Object");
		this.address = address;
		
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}
	
	
	
	//alt+shift+s  : for developing toString(), setter and getters , constructors
}
