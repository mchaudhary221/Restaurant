import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RMSRepository {
	
	private static Connection conn = null;
	private static String userName="root";
	private static String password="root";
	//constructor
	RMSRepository(){
		
	}

	public void dbConnect() throws SQLException {
			
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/RMS", userName, password);
		if(conn==null) {
		    throw new IllegalStateException("Cannot connect the database!");
		}
		
		
	}
	
	public static void main(String[] args) throws SQLException {
		RMSRepository repo=new RMSRepository();
		repo.dbConnect();
	}
	
	public ArrayList<Food> getFoods() throws SQLException{
		ArrayList<Food> foods=new ArrayList<Food>();
		try {
			dbConnect();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("Select * from Food");
			while(rs.next()) {
				Food f=new Food();
				f.name=rs.getString("Name");
				f.id=rs.getInt("Id");
				f.type=rs.getString("Type");
				f.price=rs.getDouble("Price");
				foods.add(f);
			}
			
			return foods;
		} catch (SQLException e) {
			e.printStackTrace();
			//close connection
			conn.close();
		}
				
		return foods;
		
	}
	
	public void  insertFood(String name,String type,double price){
		Food food=new Food(0,name,type,price);
		try {
			dbConnect();
			Statement st=conn.createStatement();
			String query="INSERT INTO FOOD(type,name,price) VALUES('"+food.type+"','"+food.name+"',"+food.price+")";
			ResultSet rs=st.executeQuery(query);
			if(rs==null) {
				System.out.println("Insert failed");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean insertOrder(String name,int table,double price,String status) {
		Order food=new Food(0,name,type,price);
		try {
			dbConnect();
			Statement st=conn.createStatement();
			String query="INSERT INTO FOOD(type,name,price) VALUES('"+food.type+"','"+food.name+"',"+food.price+")";
			ResultSet rs=st.executeQuery(query);
			if(rs==null) {
				System.out.println("Insert failed");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
			