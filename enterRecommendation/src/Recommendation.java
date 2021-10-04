import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

public class Recommendation extends UserInput {
	
	Random random = new Random();

	protected URI getPlayList(String mood) throws URISyntaxException  {

		switch(mood) {
		case ENERGETIC:
			return new URI(PlayList.energetic());
		case EMOTIONAL:
			return new URI(PlayList.emotional());
		case SEXY:
			return new URI(PlayList.sexual());
		case PUMPED:
			return new URI(PlayList.pumped());
		default:
				System.out.println("Invalid");
		} 
		return null;
	}
	
	protected MovieList getMovieList() {
		return null;
	}
}
