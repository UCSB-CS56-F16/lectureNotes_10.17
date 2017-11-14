public class TryLambda {
	public static void main (String [] args) {
	    
		Book gp = new Book("Pratchett","Going Postal",799,0.15);
		Song br = new Song("Lady Gaga","Bad Romance");
		Product slts = new Song("Nirvana","Smells Like Teen Spirit",79);
		Shippable hp = new Book("Rowling","Harry Potter & the Polymorphic Polyp",652,1.5);
		/*      Shippable ttc = new Shippable("Dickens","Tale of Two Cities",999,1.5); */

		Shippable x_viaLambda = ( ()->3.50 );

		Shippable x_viaAnonymousClass = (new Shippable() {
				public double getWeight() { return 42.0; }
				public String getDavidsConcern() {
					return "Does this work with mutiple methods?";
				}
			}
			);
		
    } // main method
 } // class Q2
