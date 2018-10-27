
public class Bank {

	private String bankname;
	private int sum;
	
		public Bank(String bankname, int sum) {
			this.bankname = bankname;
			this.sum = sum;
		}
		
	public String getBankname() {
		return bankname;
	}
	
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	public int getSummary() {
		return sum;
	}
	public void setSummary(int sum) {
		this.sum = sum;
	}


}
