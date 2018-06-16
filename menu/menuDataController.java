package menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class menuDataController {
	private Stage dialogStage;
	private List list;
	private int returnValue = 0;
	
	@FXML
	private void initialize() {
		
	}
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	public int getReturnValue() {
		return returnValue;
	}
	@FXML
    public void handleButtonAction(ActionEvent event) {
		
	}
}
