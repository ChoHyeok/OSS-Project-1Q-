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
	private Button btn;
	@FXML
	private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	@FXML
	private TableView<List> MainTable;
	@FXML
	private TableColumn<List,String>Menuname;
	@FXML
	private TableColumn<List,Integer>money;

    @FXML
    private Button Cancel;
    @FXML
    private Button plus,plus1,plus2,plus3,plus4,plus5,plus6,plus7;
    @FXML
    private Button minus,minus1,minus2,minus3,minus4,minus5,minus6,minus7;
    @FXML
    private TextField count,count1,count2,count3,count4,count5,count6,count7;
    @FXML
    private TextField TotalM;
    @FXML
    private Label Totalmoney;

	private List list;
	private int Number,Number1,Number2,Number3,Number4,Number5,Number6,Number7;
	private int total;
	
	private Main main;
	private int returnValue =0;
	private Stage dialogStage;
	
	public menuselect() {
		//main.menuList.add(new List("밥",2000));
		//main.menuList.add(new List("국",500));
		

	}
	/*@FXML
	public void Totalmoney() {
	
		Totalmoney= new Label("합계금액:");
	//System.out.println(money.getColumns());
		TotalM.setText(money.getColumns().toString());
		
	}*/
	
	
	@FXML
	public void HomeButton(ActionEvent event) {
		//여기에 홈화면 버튼 main fxml로 넘기기
	}
	//메뉴 추가 버튼이벤트
	@FXML
    public void handleButtonAction(ActionEvent event) {
		//Totalmoney.setText("합계금액 :"+ money.);

		btn.setOnAction(e -> {
			
			List list1 = new List("뉴욕스트립",35000*Number);
			main.menuList.add(list1);
			
			
			
				
			});
		btn1.setOnAction(e -> {
			
			List list1 = new List("갈릭 립아이",38000*Number1);
			main.menuList.add(list1);
	
	
	
		
			});

			
		
		btn2.setOnAction(e -> {
			List list3 = new List("레인지 립래츠",28000*Number2);
			main.menuList.add(list3);
			
			
		});
		btn3.setOnAction(e -> {
			
			List list4 = new List("베이비 백립",28000*Number3);
			main.menuList.add(list4);
			
			
			
				
			});
		btn4.setOnAction(e -> {
			
			List list5 = new List("콜라",2000*Number4);
			main.menuList.add(list5);
			
			
			
				
			});
		btn5.setOnAction(e -> {
			
			List list6 = new List("사이다",2000*Number5);
			main.menuList.add(list6);
			
			
			
				
			});
		btn6.setOnAction(e -> {
			
			List list7 = new List("치킨 샐러드",12000*Number6);
			main.menuList.add(list7);
			
			
			
				
			});
		btn7.setOnAction(e -> {
			
			List list8 = new List("시저 샐러드",8000*Number7);
			main.menuList.add(list8);
			
			
			
				
			});





		

		
	}
	//주문 취소 버튼 이벤트
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
	//수량 추가 버튼 이벤트
	@FXML
		public void AddButton(ActionEvent event) {
			plus.setOnAction(e ->{
				
				Number++;
				count.setText(Number+"");
				
			});
			plus1.setOnAction(e ->{
				
				Number1++;
				count1.setText(Number1+"");
				
			});
			plus2.setOnAction(e ->{
				
				Number2++;
				count2.setText(Number2+"");
				
			});
			plus3.setOnAction(e ->{
				
				Number3++;
				count3.setText(Number3+"");
				
			});
			plus4.setOnAction(e ->{
				
				Number4++;
				count4.setText(Number4+"");
				
			});
			plus5.setOnAction(e ->{
				
				Number5++;
				count5.setText(Number5+"");
				
			});
			plus6.setOnAction(e ->{
				
				Number6++;
				count6.setText(Number6+"");
				
			});
			plus7.setOnAction(e ->{
				
				Number7++;
				count7.setText(Number7+"");
				
			});
			//////////// 마이너스 버튼
			minus.setOnAction(e ->{
				
				Number--;
				count.setText(Number+"");
				
			});
			minus1.setOnAction(e ->{
				
				Number1--;
				count1.setText(Number1+"");
				
			});
			minus2.setOnAction(e ->{
				
				Number2--;
				count2.setText(Number2+"");
				
			});
			minus3.setOnAction(e ->{
				
				Number3--;
				count3.setText(Number3+"");
				
			});
			minus4.setOnAction(e ->{
				
				Number4--;
				count4.setText(Number4+"");
				
			});
			minus5.setOnAction(e ->{
				
				Number5--;
				count5.setText(Number5+"");
				
			});
			minus6.setOnAction(e ->{
				
				Number6--;
				count6.setText(Number6+"");
				
			});
			minus7.setOnAction(e ->{
				
				Number7--;
				count7.setText(Number7+"");
				
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