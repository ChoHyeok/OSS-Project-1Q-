package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class ReviewWriteController implements Initializable {

	@FXML
	public ComboBox<String> combobox1;
	@FXML
	public ComboBox<String> combobox2;
	
	ObservableList<String> list1 = FXCollections.observableArrayList("남자", "여자");
	ObservableList<String> list2 = FXCollections.observableArrayList("5", "4", "3", "2", "1");
			
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		combobox1.setItems(list1);
		combobox2.setItems(list2);
		}

	public void comboChange(ActionEvent event) {
	}
	}

