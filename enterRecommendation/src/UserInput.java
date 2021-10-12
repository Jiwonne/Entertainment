import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class UserInput {
	
	static Scanner input = new Scanner(System.in);
	static Desktop desktop = Desktop.getDesktop();
	static private String userInput;
	private static Recommendation recommendation = new Recommendation();
	
	static final private String MUSIC = "music";
	static final private String MOVIE = "movie";
	
	/*
	 * I will change this part polymorphically
	 */
	static final protected String ENERGETIC = "energetic";
	static final protected String EMOTIONAL = "emotional";
	static final protected String SEXY = "sexy";
	static final protected String PUMPED = "pumped";
	
	protected static void introProgram() throws URISyntaxException, IOException {
		
		System.out.println("This is an enertainment recommendation program, based on my preferences");
		System.out.println("If you answer to some questions, I will recommend you some good options :)" + "\n");
		System.out.println("I hope you can enjoy the program!" + "\n");
		
		System.out.print("What do you want me to recommend you? " + "\n" + "Music OR Movie : ");
		userInput = input.nextLine();
		
		if(userInput.equalsIgnoreCase(MUSIC)) {
			askingPreference(MUSIC);
		} else if(userInput.equalsIgnoreCase(MOVIE)) {
			askingPreference(MOVIE);
		}
	}
	
	protected static void askingPreference(String userChoice) throws URISyntaxException, IOException {
		if(userChoice.equals(MUSIC)) {
			System.out.println("\n" + "How's your feeling today?");
			moodTypes();
			System.out.println();
			/*
			 * need to fix it without a case-sensitive
			 */

			String mood = input.nextLine().toLowerCase();
			System.out.println("Today's your mood is " + mood + "\n");
			
			System.out.println("I'm looking for an option for you..." + "\n");
			System.out.println("__________ Loading __________");
			System.out.println();
			
			switch(mood) {
			case ENERGETIC:
				desktop.browse(recommendation.getPlayList(mood)); break;
			case EMOTIONAL:
				desktop.browse(recommendation.getPlayList(mood)); break;
			case SEXY:
				desktop.browse(recommendation.getPlayList(mood)); break;
			case PUMPED:
				desktop.browse(recommendation.getPlayList(mood)); break;
				/*
				 * If there is no option that users are looking for,
				 * I will make a function for the users to send an email
				 * that they can tell me what kinds of mood type's song they want to listen to
				 */
			
			default:
				System.out.println("If you are looking for a certain mood's song, send an email to me please.");
				System.out.println("hwan0033@algonquinlive.com");
				
				System.out.println("Thanks for your feedback!");
			}
			
			System.out.println("\n" + "Enjoy your music");
			System.out.println("This program is made by Jiwon Hwang at Algonquin College");
		}
	};
	
	protected static void moodTypes() {
		
		String[] types = {ENERGETIC, EMOTIONAL, SEXY};

		for(int index = 0; index < types.length; index++ ) {
			System.out.println(types[index]);
		}
	}
	

}
