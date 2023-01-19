package w2d4;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
	static prodotto[] arrayPr= {			
	new prodotto("girello",30,"baby"),
	new prodotto("jolly power",120,"book"),
	new prodotto("pistola giopcattolo",27,"boys"),
	new prodotto("regoli",10,"baby"),
	new prodotto("nintendo switch",300,"boys"),
	new prodotto("monopoly",30,"boys")};
	static prodotto p1=new prodotto("eqw",10,"baby");
	static prodotto p2=new prodotto("stoc",200,"baby");
	static prodotto p3=new prodotto("sidis",2012,"baby");
	static prodotto p4=new prodotto("dasd",2012,"baby");
	static prodotto p5=new prodotto("letsker",2012,"baby");
	public static prodotto[] carrello;
	
	public static void main(String[] args) {
		carrello = new prodotto[100];
		getExpensiveBooks();
		getBoyItems();
		
		buyItems(p2);
		buyItems(p3);
		buyItems(p4);
		/*carrello[0]=p1;
		carrello[1]=p2;
		carrello[2]=p3;
		carrello[3]=p4;
		carrello[4]=p5;*/
		
	
		getBabyInCart();
		
	}
	public static void getBoyItems() {
		
		Stream<prodotto> boysStuff = Arrays.stream(arrayPr);
		Predicate<prodotto> boyz = items -> items.getCat()==( "boys");
		 boysStuff
			.filter( boyz )
			.forEach( items->System.out.println(items.getName()+" price "+items.setPrice((items.getPrice())*0.90)+items.getPrice()));
			
	}
	public static void getExpensiveBooks() {
		Stream<prodotto> expensiveBooks = Arrays.stream(arrayPr);
		Predicate<prodotto> expensiveB = items -> items.getPrice() >= 100&items.getCat()==( "book");
		expensiveBooks
			.filter( expensiveB )
			.forEach( items->System.out.println(items.getName()+" price "+items.getPrice()));
			
	}
	public static void getBabyInCart() {
			for(int i=0;i<carrello.length;i++) {
			if(carrello[i].getCat()=="baby") {
				System.out.println(carrello[i].getName()+" price "+carrello[i].getPrice());
			}else {}
		
			
		}
	}
	public static void buyItems(prodotto object) {
		int s=0;
		for(int i=0;i>carrello.length;i++) {
			String name=carrello[i].getName();
			if(!(name==null)) {
				s++;
			}else {}
		}
		
		carrello[s]=object;
		
	}
}