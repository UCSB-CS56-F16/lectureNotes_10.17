/* 1*/	public class Q2 {
/* 2*/	  public static void main (String [] args) {
/* 3*/	    
/* 4*/      Book gp = new Book("Pratchett","Going Postal",799,0.15);
/* 5*/      Song br = new Song("Lady Gaga","Bad Romance");
/* 6*/      Product slts = new Song("Nirvana","Smells Like Teen Spirit",79);
/* 7*/      Shippable hp = new Book("Rowling","Harry Potter & the Polymorphic Polyp",652,1.5);
/* 8*/      Shippable ttc = new Shippable("Dickens","Tale of Two Cities",999,1.5);
/* 9*/ 					       
/*10*/      System.out.println("a:" + gp.getTitle());
/*11*/      System.out.println("b:" + br.getArtist());
/*12*/      System.out.println("c:" + br.getPrice());
/*13*/      System.out.println("d:" + slts.getPrice());
/*14*/      System.out.println("e:" + slts.getTitle());
/*15*/      System.out.println("f:" + hp.getPrice());
/*16*/      System.out.println("g:" + hp.getWeight());
/*17*/      System.out.println("h:" + hp.getTitle());
/*18*/      System.out.println("i:" + ttc.getPrice());
/*19*/      System.out.println("j:" + ttc.getPrice());
/*20*/ 
/*21*/    } // main method
/*22*/ } // class Q2
