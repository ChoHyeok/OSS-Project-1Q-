package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ReviewRadiobutton {
	  @FXML private ToggleGroup gender;
	  @FXML private ToggleGroup rating;
	  @FXML private RadioButton Mrb;
      @FXML private RadioButton Wrb;
      @FXML private RadioButton Fiverb;
      @FXML private RadioButton Fourrb;
      @FXML private RadioButton Threerb;
      @FXML private RadioButton Tworb;
      @FXML private RadioButton Onerb;
      @FXML private Label lb1;
      @FXML private Label lb2;
      
      public void radioselect1(ActionEvent event) {
          String message = "";
          if (Mrb.isSelected()) {
        	  message += Mrb.getText() + "\n";
          }
          if (Wrb.isSelected()) {
        	  message += Wrb.getText() + "\n";
          }
          lb1.setText(message);
          }
      
      public void radioselect2(ActionEvent event) {
      String message = "";
      if (Fiverb.isSelected()) {
    	  message += Fiverb.getText() + "\n";
      }
      if (Fourrb.isSelected()) {
    	  message += Fourrb.getText() + "\n";
      }
      if (Threerb.isSelected()) {
    	  message += Threerb.getText() + "\n";
      }
      if (Tworb.isSelected()) {
    	  message += Tworb.getText() + "\n";
      }
      if (Onerb.isSelected()) {
    	  message += Onerb.getText() + "\n";
      }
      lb2.setText(message);
      }
      
      
          
}
