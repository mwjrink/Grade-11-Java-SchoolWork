package Carnival;

public class ClientCode {
	public static void main(String[] args){
	GameBooth balloonDartToss = new GameBooth(2, "tiger plush ", "sticker"); 
	GameBooth ringToss = new GameBooth(2, "bear keychain", "pencil"); 
	GameBooth breakAPlate = new GameBooth(1.5, "pig plush ", "plastic dinosaur"); 
	Player shonda = new Player(5); 	// $5 spending money 
	Player luis = new Player(3); 	// $3 spending money 
	
	System.out.print("Shonda goes to Balloon Dart Toss. "); 
	System.out.println(shonda.play(balloonDartToss)); 
	String out;
	out=shonda.toString("Shonda");
	System.out.println(out);

	System.out.print( "Luis goes to Ring Toss. "); 
	System.out.println(luis. play(ringToss));
	out = luis.toString("Luis");
	System.out.println(out);

	System.out.print("Shonda goes to Ring Toss. "); 
	System.out.println(shonda.play(ringToss)); 
	out = shonda.toString("Shonda");
	System.out.println(out);

	System.out.print("Luis goes to Break A Plate. "); 
	System.out.println(luis.play(breakAPlate)); 

	System.out.println("Shonda won:  "  + shonda.showPrizes());
	System.out.println("Luis won:   " + luis.showPrizes());
	}
}
