
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class menuselect {

	@FXML private ImageView imageview;

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void initialize(URL location, ResourceBundle resoruces) {
          imageview.setOnMouseClicked( new EventHandler() {
                         @SuppressWarnings("unused")
						public void handle1( Event evnet ) {
                             
                        	 Alert alert = new Alert(AlertType.WARNING);
                        	 alert.setTitle("Warning Dialog");
                        	 alert.setHeaderText("Look, a Warning Dialog");
                        	 alert.setContentText("Careful with the next step!");

                        	 alert.showAndWait();

                        	
                         }

						@Override
						public void handle(Event event) {
							
							
						}
                  });

	}
}

