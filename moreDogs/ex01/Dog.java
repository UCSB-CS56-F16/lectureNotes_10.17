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

	Dog d1 = new Dog("Buster");
	Dog d2 = new Dog("Max");
	Dog d3 = new Dog("Riley");
	Dog d4 = new Dog("Sammy");
	Dog d5 = new Dog("Cody");

	d3.setAsDogOfTheWeek();  gc();    
	d4 = d1;                 gc();                   
	Dog d6 = d5;             gc();               
	Dog temp = d3;           gc();             
	d3 = d4;                 gc();                   
	d4 = temp;               gc();                 
	d1 = getDogOfTheWeek();  gc();    
	d3.setAsDogOfTheWeek();  gc();    
	d1 = null;               gc();                 
	d2 = null;               gc();                 
	d3 = null;               gc();
	d4 = null;               gc();
	d5 = null;               gc();
	d6 = null;               gc();                 
	temp = null;             gc();               
    }                              

    // SEE: https://ucsb-cs56-pconrad.github.io/topics/java_gc_under_the_hood/
    
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
