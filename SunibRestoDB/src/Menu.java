import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public abstract class Menu {
	private String ID,name;
	private int price,quantity;

	public Menu(String ID,String name,int price,int quantity) {
		this.ID=ID;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public Menu() {}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		this.ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Vector<Menu> data(){
		Vector<Menu> menus= new Vector<>();
		ResultSet rs = Connect.getInstance().execQuery("SELECT * FROM menus");
		try {
			while(rs.next()) {
				if(rs.getString("Category").equals("Appetizer")) {
					menus.add(new Appetizer(rs.getString("ID"),rs.getString("Name") ,Integer.parseInt(rs.getString("Price")),Integer.parseInt(rs.getString("Quantity")),rs.getString("Description")));
				}
				
				if(rs.getString("Category").equals("Dessert")) {
					menus.add(new Dessert(rs.getString("ID"),rs.getString("Name") ,Integer.parseInt(rs.getString("Price")),Integer.parseInt(rs.getString("Quantity")),rs.getString("Description")));
				}
				
				if(rs.getString("Category").equals("MainCourse")) {
					menus.add(new MainCourse(rs.getString("ID"),rs.getString("Name") ,Integer.parseInt(rs.getString("Price")),Integer.parseInt(rs.getString("Quantity")),rs.getString("Description")));
				}
				
				if(rs.getString("Category").equals("Drink")) {
					menus.add(new Drink(rs.getString("ID"),rs.getString("Name"),Integer.parseInt(rs.getString("Price")),Integer.parseInt(rs.getString("Quantity")),rs.getString("Description")));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		return menus;
	}
	
	
	

}
