import java.util.ArrayList;
import java.util.regex.*;


public class Mufasa {
	private String username;
	private String firstname;
	private String lastname;
	private String password1;
	private String password2;
	private String password3;
	private String password4;
	private String birthday;
	private String phonenumber;
	private String email1;
	private String email2;
	private String street;
	private String postalcode;
	private String country;
	private String holder;
	private String cardtype;
	private String cardnumber;
	private String expdate;
	private ArrayList<Bank> stocks;
	private BankAccount bankac;

	
	public void Main() {

	}
		
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		if(firstname.matches(".*\\d+.*")) {
			System.out.println("Invalid firstname, give another");
		}
		else this.firstname = firstname;
	}
	
	public String getlastname() {
		return lastname;
	}
	
	public void setlastname(String lastname) {
		if(lastname.matches(".*\\d+.*")) {
			System.out.println("Invalid firstname, give another");
		}
		else this.lastname = lastname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		if(!username.matches("[^A-Za-z0-9]+")) {
			if(username.matches(".*_.*+")) {
				System.out.println(username);
				Pattern pattern = Pattern.compile("_");
				Matcher matcher = pattern.matcher(username);
				int count = 0;
				while(matcher.find()) {
					count = count+1;
				}
				if (count > 1) {
					System.out.println("Too many _ character");
				}
				else this.username = username;
			}
			
			else System.out.println("Invalid special character");
			
		}
		
		if(username.length() > 15) {
			System.out.println("Too long username");
		}
		
		this.username = username;
	}
	
	
	public String getPassword1() {
		return password1;
	}
	
	public void password1(String password1) {
		if(password1.length() < 8) {	
			System.out.println("Password is too small");
		}
		else this.password1 = password1;
	}
	
	public String getPassword2() {
		return password2;
	}
	
	public void password2(String password2) {
		if(password2.length() < 8) {	
			System.out.println("Password is too small");
		}
		if(password1 != password2) {
			System.out.println("Second password is not same that first one");
		}
		else this.password2 = password2;
	}
	
	public String getPassword3() {
		return password3;
	}
	
	public void password3(String password3) {
		if(password3.length() < 8) {	
			System.out.println("Password is too small");
		}
		if(password1 == password3) {
			System.out.println("Third password is same that first one");
		}
		else this.password3 = password3;
	}
	
	
	public String getPassword4() {
		return password4;
	}
	
	public void password4(String password4) {
		if(password4.length() < 8) {	
			System.out.println("Password is too small");
		}
		if(password3 != password4) {
			System.out.println("Fourth password is not same that third one");
		}
		else this.password4 = password4;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		String [] days;
		if(birthday.contains("[a-z]+")) {
			System.out.println("Alphabets aren't allowed");
		}
		if(birthday.contains(".+")) {
			System.out.println(" . aren't allowed");
		}
		days = birthday.split("/");
		for(int i=0; i<days.length; i++) {
			int number = Integer.parseInt(days[i]);
			if(i==0) {
				if(number > 30) System.out.println("Day cannot be more than 30");
			}
			if(i==1) {
				if(number > 12) System.out.println("Month cannot be more than 12");
			}
			
			if(i==2) {
				if(days[i].length() != 4) System.out.println("Year is not correct");
			}
		}
		
		this.birthday = birthday;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	
	public void setPhonenumber(String phonenumber) {
		if(phonenumber.matches("[A-Za-z]+")) System.out.println("Only digits");
		else this.phonenumber =  phonenumber;
		
	}
	
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		if(!email1.matches("@+")) System.out.println("Missing @ character");
		else this.email1 = email1;
	}
	
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		if(email1 != email2) System.out.println("Second email is not same with first one.");
		else this.email2 = email2;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		if(!street.matches("[A-Za-z0-9]+")) System.out.println("Street address needs only digits and English alphabets");
		else this.street = street;
	}
	
	public String getPostalcode() {
		return postalcode;
	}
	
	public void setPostalcode(String postalcode) {
		if(postalcode.matches("[A-Za-z]+")) System.out.println("Postal code gets only digits and - ");
		else this.postalcode = postalcode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		if(!country.matches("[A-Za-z]+")) System.out.println("Country gets only English alphabets.");
		else this.country = country;
	}

	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		if(!holder.matches("[A-Za-z0-9]+")) System.out.println("Only digits and English alphabets are allowed");
		else this.holder = holder;
	}

	public String getCardType() {
		return cardtype;
	}
	public void setCardType(String cardtype) {
		if(cardtype == "") System.out.println("Card type is wrong");
		else this.cardtype = cardtype;
	}
	
	public String getCardNumber() {
		return cardnumber;
	}
	public void setCardNumber(String cardnumber) {
		if(cardnumber.matches("[A-Za-Z]+")) System.out.println("Only digits are allowed");
		else this.cardnumber = cardnumber;
	}
	
	
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		String [] days = expdate.split("/");
		for(int i=0; i<days.length; i++) {
			int number = Integer.parseInt(days[i]);
			if(i==0) {
				if(number > 12) System.out.println("Month cannot be more than 30");
			}
						
			if(i==1) {
				if(days[i].length() != 4) System.out.println("Year is not correct");
			}
			else this.expdate = expdate;
		}
	}
	public BankAccount getBank() {
		return bankac;
	}
	public void setBank(BankAccount sqtBank) {
		this.bankac = sqtBank;
	}
	public ArrayList<Bank> getStocks() {
		return stocks;
	}
	public void setStocks(ArrayList<Bank> stocks) {
		this.stocks = stocks;
	}
	
	
	public void addStock(Bank s) {
		this.stocks.add(s);
	}
	
	public Double getTotalValue() {
		Double result = 0.0;
		for (Bank stock : stocks) {
			result = result +1;
		}
		return result;
	}

}
