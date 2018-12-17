/*import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
//import java.awt.Color;
import java.io.File;
//import javax.script.Bindings;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.beans.property.DoubleProperty;
import javafx.beans.binding.Bindings;*/

import java.io.File;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 


// Added code below
//import java.io.File;
/*import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.JFrame;*/


public class Broadcaster extends Application 
{
	// Please leave out instantiations below. Some how they get in the way of the Application abstract class
	/*MediaPlayer v = new MediaPlayer(new Media("C:/Users/Tito/Desktop/Melissa&ChrisPreview.wmv"));
	MediaView s = new MediaView(v);*/

	public static void main(String[] args) 
	{
		try{
			launch(args);
		
		}catch(Exception e) 
		
		{
			e.printStackTrace();
		}
	}
	
	

	@Override
	  public void start(Stage primaryStage) {
	    String workingDir = System.getProperty("C:/Users/Tito/Desktop");
	    final File f = new File(workingDir, "Trees.mp4");
	    
	    final Media m = new Media(f.toURI().toString());
	    final MediaPlayer mp = new MediaPlayer(m);
	    final MediaView mv = new MediaView(mp);
	    
	    final DoubleProperty width = mv.fitWidthProperty();
	    final DoubleProperty height = mv.fitHeightProperty();
	    
	    width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
	    height.bind(Bindings.selectDouble(mv.sceneProperty(), "height")); 
	    
	    
	   	    
	    	    	    
	    mv.setPreserveRatio(true);
	    
	    StackPane root = new StackPane();
	    root.getChildren().add(mv);
	    
	    final Scene scene = new Scene(root, 500, 540);
	    scene.setFill(Color.BLUE);
	    
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("Full Screen Video Player");
	    primaryStage.setFullScreen(true);
	    primaryStage.show();
	    
	    mp.play();
	  }
	}



    
/*class MediaTest	{
      	// launch the application
      	public static void main( String args[] )
      	{
         	// create a file chooser
         	JFileChooser fileChooser = new JFileChooser();
   
         	// show open file dialog
         	int result = fileChooser.showOpenDialog( null );
   
         	if ( result == JFileChooser.APPROVE_OPTION ) // user chose a file
         	{
            	URL mediaURL = null;
   
            	try
            	{
               	// get the file as URL
               	mediaURL = fileChooser.getSelectedFile().toURL();
             } // end try
            	catch ( MalformedURLException malformedURLException )
            	{
               	System.err.println( "Could not create URL for the file" );
            	} // end catch
   
            	if ( mediaURL != null ) // only display if there is a valid URL
            	{
               	JFrame mediaTest = new JFrame( "Media Tester" );
               	mediaTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   
               	MediaPanel mediaPanel = new MediaPanel( mediaURL );
               	mediaTest.add( mediaPanel );
   
               	mediaTest.setSize( 300, 300 );
               	mediaTest.setVisible( true );
            	} // end inner if
         	} // end outer if
      	} // end main
   	} // end class MediaTest */
