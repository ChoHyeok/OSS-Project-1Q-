package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GoReview {
       
	   @FXML Button btn2;
       @FXML Button btn4;
       @FXML Button btn5;
       
  
       //btn2�� Ŭ���ϸ� ���� ���� â���� �Ѿ.
       @FXML
   	private void Goreview() throws Exception {
   		btn2.getOnAction();
   		Stage primaryStage = (Stage) btn2.getScene().getWindow();
   		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Go.fxml"));
   		Scene scene = new Scene(parent);
   		primaryStage.setScene(scene);
   		primaryStage.setTitle("Review");
   		primaryStage.show();

   	}
       
       
     //btn4�� Ŭ���ϸ� ���侲��� �Ѿ.
       @FXML
       private void Write() throws Exception {
      		btn4.getOnAction();
      		Stage primaryStage = (Stage) btn4.getScene().getWindow();
      		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/ReviewWrite.fxml"));
      		Scene scene = new Scene(parent);
      		primaryStage.setScene(scene);
      		primaryStage.setTitle("Write");
      		primaryStage.show();

      	}
       
       //btn5�� Ŭ���ϸ� ���亸��� �Ѿ.
       @FXML
       private void See() throws Exception {
      		btn5.getOnAction();
      		Stage primaryStage = (Stage) btn5.getScene().getWindow();
      		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Review.fxml"));
      		Scene scene = new Scene(parent);
      		primaryStage.setScene(scene);
      		primaryStage.setTitle("See");
      		primaryStage.show();

      	}
}
