package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber = 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete a = new Athlete("A", 10);
    	Athlete b = new Athlete("B", 12);
    	System.out.println(a.name);
    	System.out.println(b.name);
    	System.out.println(a.bibNumber);
    	System.out.println(nextBibNumber);
    	
    	
    }
}
