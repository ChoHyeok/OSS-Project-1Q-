package menu;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class List {
	
	private StringProperty Menuname;
	private IntegerProperty money;
	public int total;
	
	public List(String Menuname,int money) {
		this.Menuname = new SimpleStringProperty(Menuname);
		this.money = new SimpleIntegerProperty(money);
		
	}
	public String getMenuname() {
		return Menuname.get();
	}
	public void setMenuname(String Menuname) {
		
		this.Menuname.set(Menuname);
	}
	public StringProperty getMenunameProperty() {
		return Menuname;
	}
	public int getmoney() {
		return money.get();
	
	}
	public void setmoney(int money) {
		
		this.money.set(money);
		
		
	}
	public IntegerProperty getmoneyProperty() {
		return money;
	}

}
