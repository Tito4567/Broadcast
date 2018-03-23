
import java.beans.EventHandler;
import javafx.scene.media.MediaErrorEvent;

import javafx.scene.media.*;

public class Broadcast
{

	public static void main(String[] args) 
	{
	    String source;
	    Media media;
	    MediaPlayer mediaPlayer;
	    MediaView mediaView;
	    try {
	        media = new Media(source);
	        if (media.getError() == null) {
	            media.setOnError(new Runnable() {
	                public void run() {
	                    // Handle asynchronous error in Media object.
	                }
	            });
	            try {
	                mediaPlayer = new MediaPlayer(media);
	                if (mediaPlayer.getError() == null) {
	                    mediaPlayer.setOnError(new Runnable() {
	                        public void run() {
	                            // Handle asynchronous error in MediaPlayer object.
	                        }
	                    });
	                    mediaView = new MediaView(mediaPlayer);
	                    mediaView.setOnError(new EventHandler(mediaView, source, source, source) {
	                        public void handle(MediaErrorEvent t) {
	                            // Handle asynchronous error in MediaView.
	                        }
	                    });
	                } else {
	                    // Handle synchronous error creating MediaPlayer.
	                }
	            } catch (Exception mediaPlayerException) {
	                // Handle exception in MediaPlayer constructor.
	            }
	        } else {
	            // Handle synchronous error creating Media.
	        }
	    } catch (Exception mediaException) {
	        // Handle exception in Media constructor.
	    }
		

	}

}
