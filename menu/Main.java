package menu;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;



public class Main extends Application {
	
	public static ObservableList<List> menuList = FXCollections.observableArrayList();
	
	
	public Main() {
		
		//menuList.add(new List("한우 스테이크",35000));

		
	}
	public ObservableList<List> getmenuList() {
		// TODO Auto-generated method stub
		return menuList;
	}
	@Override
	public void start(Stage primaryStage){
		try {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("menuGUI.FXML"));
		SplitPane menu = (SplitPane) loader.load();
		Scene scene = new Scene(menu);
		primaryStage.setScene(scene);
		primaryStage.setTitle("메뉴판");
		menuselect controller = loader.getController();
		controller.setMain(this);
		
		primaryStage.show();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
			
			
			
			
		
	public static void main(String[] args) {
		launch(args);
	}
	public Window getPrimaryStage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}