import javafx.scene.media.*;
import javafx.stage.Stage;
import javafx.application.Application;

public class Broadcaster extends Application 
{
	// Please leave out instantiations below. Some how they get in the way of the Application abstract class
	/*MediaPlayer v = new MediaPlayer(new Media("C:/Users/Tito/Desktop/Melissa&ChrisPreview.wmv"));
	MediaView s = new MediaView(v);*/

	public static void main(String[] args) 
	{
		launch(args);
	}
	
	

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println("It works");
		
	}
}

