package menu;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class menuselect {	

	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private TableView<List> MainTable;
	@FXML
	private TableColumn<List,String>Menuname;
	@FXML
	private TableColumn<List,Integer>money;

    @FXML
    private Button Cancel;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private TextField count;
    @FXML
    private TextField TotalM;
    @FXML
    private Label Totalmoney;

	private List list;
	private int Number;
	private int total;
	
	private Main main;
	private int returnValue =0;
	private Stage dialogStage;
	
	public menuselect() {
		main.menuList.add(new List("밥",2000));
		main.menuList.add(new List("국",500));
		

	}
	@FXML
	public void Totalmoney() {
	
		Totalmoney= new Label("합계금액:");
	//System.out.println(money.getColumns());
		TotalM.setText(money.getColumns().toString());
		
	}
	
	@FXML
    public void handleButtonAction(ActionEvent event) {

		btn1.setOnAction(e -> {
			
			List list1 = new List("타코야끼",2000*Number);
			main.menuList.add(list1);
			//returnValue = 1;
			
			
				
			});

			
		
		btn2.setOnAction(e -> {
			List list2 = new List("와규 스테키",10000*Number);
			main.menuList.add(list2);
			/*this.name ="와규스테키";
			this.price ="10000";
			Menuname.setText(name);
			money.setText(price);*/
			
		});
		
	}
	@FXML
    	public void CancelAction(ActionEvent event) {
			Cancel.setOnAction(e ->{
				int selectedIndex = MainTable.getSelectionModel().getSelectedIndex();
				if(selectedIndex >= 0) {
					MainTable.getItems().remove(selectedIndex);
				}
				else {
					Alert alert = new Alert(AlertType.WARNING);
					alert.initOwner(main.getPrimaryStage());
					alert.setTitle("오류 메세지");
					alert.setHeaderText("삭제할 메뉴가 없습니다.");
					alert.setContentText("삭제할 메뉴를 선택해주세요.");
					alert.showAndWait();
				}
			});
	}
	@FXML
		public void AddButton(ActionEvent event) {
			plus.setOnAction(e ->{
				
				Number++;
				count.setText(Number+"");
				
				
			});
			minus.setOnAction(e ->{
				
				Number--;
				count.setText(Number+"");
			});
	}
	
			@FXML
			private void initialize() {
				Menuname.setCellValueFactory(cellData ->cellData.getValue().getMenunameProperty());
				money.setCellValueFactory(cellData -> cellData.getValue().getmoneyProperty().asObject());
			}
			public void setList(List list) {
				this.list = list;
				list.getMenuname();
				list.getmoney();
			}
			public int getReturnValue() {
				return returnValue;
			}
			
			public void setMain(Main main) {
				this.main = main;
				MainTable.setItems(main.getmenuList());
			}
			public void setDialogStage(Stage dialogStage) {
				this.dialogStage = dialogStage;
			}
			
			

	
			/*@Override
			public void initialize(URL location, ResourceBundle resources) {
				
				
				
			}*/
}