
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class BtnController {
	@FXML
	Button btn1;
	@FXML
	Button btn2;
	@FXML
	Button btn3;
	
	

	@FXML
	private void Write() throws Exception {
		btn10.getOnAction();
		Stage primaryStage = (Stage) btn10.getScene().getWindow();
		Parent parent = FXMLLoader.load(getClass().getResource(""));
		Scene scene = new Scene(parent);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("");
		primaryStage.show();

	}
	
	@FXML
	private void Write() throws Exception {
		btn10.getOnAction();
		Stage primaryStage = (Stage) btn10.getScene().getWindow();
		Parent parent = FXMLLoader.load(getClass().getResource(""));
		Scene scene = new Scene(parent);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("");
		primaryStage.show();

	}
	
	@FXML
	private void Write() throws Exception {
		btn10.getOnAction();
		Stage primaryStage = (Stage) btn10.getScene().getWindow();
		Parent parent = FXMLLoader.load(getClass().getResource(""));
		Scene scene = new Scene(parent);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("");
		primaryStage.show();

	}
}