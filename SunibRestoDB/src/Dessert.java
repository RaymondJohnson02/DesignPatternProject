import java.sql.ResultSet;
import java.util.Vector;

public class Dessert extends Menu {
	private String topping;

	public Dessert(String ID, String name, int price, int quantity,String topping) {
		super(ID, name, price, quantity);
		this.topping = topping;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	@Override
	public Vector<Menu> data(){
		Vector<Menu> menus= new Vector<>();
		ResultSet rs = Connect.getInstance().execQuery("SELECT * FROM menus");
		try {
			while(rs.next()) {

				
					menus.add(new Dessert(rs.getString("ID"),rs.getString("Name") ,Integer.parseInt(rs.getString("Price")),Integer.parseInt(rs.getString("Quantity")),rs.getString("Description")));


			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		return menus;
	}
}
