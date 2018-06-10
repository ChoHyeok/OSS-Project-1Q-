package menu;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class menuselect implements  Initializable{	

	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Label label;
	@FXML
	private Label label2;
	@FXML
	private Label label3;
	
	private String name;
	private String price;
	
	@FXML
	public void handleButtonAction(ActionEvent event) {
		this.name = "한우 스테이크";
		this.price = "10000";
		label.setText(name);
		label2.setText(price);
		
		
	}
	


	
			@Override
			public void initialize(URL location, ResourceBundle resources) {
				
				
			}
}