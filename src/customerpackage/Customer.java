package customerpackage;

import java.util.Date;

public class Customer implements Comparable<Customer> {
	
	private int custid;
	private String custname;
	private String email;
	private String mobile;
	private Date dob;
	private Address address;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}	
	public Customer() {
		super();
	}	
	public Customer(int custid, String custname, String email, String mobile, Date dob, Address address) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", email=" + email + ", mobile=" + mobile
				+ ", dob=" + dob + "]";
	}
	@Override
	public int compareTo(Customer o) {
		
		if(this.custid > o.custid){
			return 1;
		}
		else if(this.custid < o.custid){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	
	

}
