package w2d4;

public class prodotto {
	private String name;
	private double price;
	private String cat;
	private String date;
	private String user;
	
	public prodotto(String name,double avg,String cat) {
		this.name=name;
		this.price=avg;
		this.cat=cat;
		
	}
	public double getPrice(){
		return this.price;
	}
	public String getCat() {
		return this.cat;
		
	}
	public String getName() {
		return this.name;
	}
	public double setPrice(double pri) {
		this.price= pri;
		return price;
		
	}
	public String getDate() {
		return date;
	}
	public void setDate(String i) {
		this.date = i;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
}
