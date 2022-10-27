import java.sql.ResultSet;
import java.util.Vector;

public class Appetizer extends Menu {
	private String type;

	public Appetizer(String ID, String name, int price, int quantity,String type) {
		super(ID, name, price, quantity);
		this.type=type;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public Vector<Menu> data(){
		Vector<Menu> menus= new Vector<>();
		ResultSet rs = Connect.getInstance().execQuery("SELECT * FROM menus");
		try {
			while(rs.next()) {
					menus.add(new Appetizer(rs.getString("ID"),rs.getString("Name") ,Integer.parseInt(rs.getString("Price")),Integer.parseInt(rs.getString("Quantity")),rs.getString("Description")));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		return menus;
	}

	

}
