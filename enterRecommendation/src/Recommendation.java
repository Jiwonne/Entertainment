import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

public class Recommendation extends UserInput {
	
	Random random = new Random();

	protected URI getPlayList(String mood) throws URISyntaxException  {
		if(mood.equalsIgnoreCase(ENERGETIC)) {
			return new URI(PlayList.energetic());
		} else if(mood.equalsIgnoreCase(EMOTIONAL)) {
			return new URI(PlayList.emotional());
		} else if(mood.equalsIgnoreCase(SEXY)) {
			return new URI(PlayList.sexual());
		}
		return null;
	}
	
	protected MovieList getMovieList() {
		return null;
	}


}
