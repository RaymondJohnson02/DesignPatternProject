import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Connect {
	public Statement state;
	public ResultSet rs;
	public ResultSetMetaData rsm;
	public PreparedStatement ps;
	public Connection con;
	private static Connect connect; 

	private Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sunib_resto",
					"root",
					"");
			
			 state = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static synchronized Connect getInstance() {
		//singleton disini
		//digunakan untuk mendapatkan instance dari class connect
		if(connect==null) {
			connect=new Connect();
		}
		
		return connect;
	}
	
	public 	ResultSet execQuery(String query) {
		try {
			rs=state.executeQuery(query);
			rsm=rs.getMetaData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	public void insertData(String id,String name,int price,int quantity,String category,String desc) {
		try {
			ps=con.prepareStatement("INSERT INTO menus VALUES(?,?,?,?,?,?)");
			ps.setString(1, id);
			ps.setString(2,name);
			ps.setInt(3, price);
			ps.setInt(4, quantity);
			ps.setString(5, category);
			ps.setString(6, desc);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void execUpdate(String query) {
		try {
			state.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
