import java.util.Scanner;
import java.util.Random;

public class PlayList extends Recommendation {
	
	static Scanner userInput = new Scanner(System.in);
	static Random random = new Random();
	
	public static String emotional() {
		
		String[] emotionalPlayList = 
			{
				"https://youtu.be/Fonu-sD1oLU",
				"https://youtu.be/FFqRgEwwQZ8",
				"https://youtu.be/QAOh9we518M",
				"https://youtu.be/SPxobPvrd9w",
				"https://youtu.be/VBLNKIoM7Jo",
				"https://youtu.be/I824q8bB8fg",
				"https://youtu.be/BXRmqfxTjL4"
			};
		int index = random.nextInt(emotionalPlayList.length);
		return emotionalPlayList[index];
	}
	
	public static String energetic() {
		
		String[] energeticPlayList = 
			{
				"https://youtu.be/sECA-49IKZ0",
				"https://youtu.be/p2CHG1k2R3g",
				"https://youtu.be/cfy3gnvJhII",
				"https://youtu.be/-C5KwB8HQFE",
				"https://youtu.be/iEx60SOiJBc"
			};
		int index = random.nextInt(energeticPlayList.length);
		return energeticPlayList[index];
	}
	
	public static String sexual() {
	
		String[] sexualPlayList = 
			{
				"https://youtu.be/UajzSr3F_ZI",
				"https://youtu.be/lQwzfrh9Kls",
				"https://youtu.be/sTICROmSunY",
				"https://youtu.be/KoROtJ6aLy0",
				"https://youtu.be/VwKOVKMiSAk",
				"https://youtu.be/myzOUyZdAn4"
			};
		int index = random.nextInt(sexualPlayList.length);
		return sexualPlayList[index];
	}
	
	public static String pumped() {
		String[] pumpedPlayList = {
				"https://youtu.be/9O4_awEHh1g"
		};
		int index = random.nextInt(pumpedPlayList.length);
		return pumpedPlayList[index];
	}
	
	
	public static String Asmr() {
		String[] withoutLyricsPlayList = {
				"https://www.youtube.com/watch?v=UHCoupSANo4"
		};
		int index = random.nextInt(withoutLyricsPlayList.length);
		return withoutLyricsPlayList[index];
	}
}
