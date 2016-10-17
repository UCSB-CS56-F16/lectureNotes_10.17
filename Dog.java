public class Dog {

    private static Dog dogOfTheWeek = null;

    private String name;

    public void setAsDogOfTheWeek() {
	dogOfTheWeek = this;
    }

    public static Dog getDogOfTheWeek() {
	return dogOfTheWeek;
    }

    public Dog(String name) { this.name = name;}

    public static void main(String [] args) {

	Dog d1 = new Dog("Fido");
	Dog d2 = new Dog("Rover");
	Dog d3 = new Dog("Princess");
	Dog d4 = new Dog("Spot");
	Dog d5 = new Dog("Snoopy");


	d1.setAsDogOfTheWeek();    /* 26 */  gc();
	d1 = d2;                   /* 27 */  gc();
	Dog d6 = d3;               /* 28 */ gc();
	Dog temp = d4;             /* 29 */ gc();
	d4 = d3;                   /* 30 */ gc();
	d3 = temp;                 /* 31 */ gc();
	d2 = getDogOfTheWeek();    /* 32 */ gc();
	d4.setAsDogOfTheWeek();    /* 33 */ gc();
	d5 = null;                 /* 34 */ gc();
	d4 = null;                 /* 35 */ gc();
	d3 = null;                 /* 36 */ gc();
	d2 = null;                 /* 37 */ gc();
	d1 = null;                 /* 38 */ gc();
	temp = null;               /* 39 */ gc();
    }                              


    public void finalize() {
	System.out.println("Finalizing: " + this.name + "  " + this.hashCode());
    }

    public static void gc() {
	// from http://stackoverflow.com/questions/1346391/line-equivalent-in-java
	// unnecessary java.lang. prefix used just to show where StackTraceElement comes from
	java.lang.StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
	String where =
	    ste.getClassName() + " " + ste.getMethodName() + " " + ste.getLineNumber() + " ";

	System.out.println("Requesting gc at: " + where);
	System.gc();
	System.runFinalization ();
	System.gc();
	System.runFinalization ();
    
    }

}
