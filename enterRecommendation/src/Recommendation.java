import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

public class Recommendation extends UserInput {
	
	Random random = new Random();

	protected URI getPlayList(String mood) throws URISyntaxException  {
		switch(mood) {
		case ENERGETIC:
			new URI(PlayList.energetic()); break;
		case EMOTIONAL:
			new URI(PlayList.emotional()); break;
		case SEXY:
			new URI(PlayList.sexual()); break;
		case PUMPED:
			new URI(PlayList.pumped()); break;
		default:
				System.out.println("Invalid");
		} 
		return null;
	}
	
	protected MovieList getMovieList() {
		return null;
	}
}
