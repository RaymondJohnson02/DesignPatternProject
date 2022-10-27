import java.sql.ResultSet;
import java.util.Vector;

public class Drink extends Menu {
	private String size;

	public Drink(String ID, String name, int price, int quantity,String size) {
		super(ID, name, price, quantity);
		this.size=size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public Vector<Menu> data(){
		Vector<Menu> menus= new Vector<>();
		ResultSet rs = Connect.getInstance().execQuery("SELECT * FROM menus");
		try {
			while(rs.next()) {

				
					menus.add(new Drink(rs.getString("ID"),rs.getString("Name"),Integer.parseInt(rs.getString("Price")),Integer.parseInt(rs.getString("Quantity")),rs.getString("Description")));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		return menus;
	}



}
