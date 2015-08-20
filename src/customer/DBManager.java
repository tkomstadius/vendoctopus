package customer;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DBManager {
	private static String psw = "comhemcase2015";
	private static String username = "root";
	
	private static String connectionString = "jdbc:mysql://localhost:3306/comhemcase2015";
	private static Connection connection;
	private static ResultSet data;
	static String personnumber;
	static String name;
	static String adress;
	static String zipcode;
	static String queryString;
		
	public static void addData() throws SQLException, ClassNotFoundException{
		try{
			connection = (Connection) DriverManager.getConnection(connectionString, username, psw);
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement("INSERT INTO `comhemcase2015`.`customer` (`personnumber`, `name`, `adress`, `zipcode`) VALUES ('4331331111', 'Sam Sammy', 'Samirgatan 3', '33122');");
			int rows = statement.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Success!");
			connection.close();
		}
	}
	
	public static void searchData() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");

		try{
			System.out.println("INNAN");
			connection = (Connection) DriverManager.getConnection(connectionString, username, psw);
			System.out.println("EFTER CONNECTION");
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement("select * from customer where personnumber = " + queryString);
			System.out.println("EFTER PREPARED");
			data = statement.executeQuery();
			System.out.println("EFTER");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			while(data.next()){
				personnumber = data.getString(2);
				name = data.getString(3);
				adress = data.getString(4);
				zipcode = data.getString(5);
			System.out.println(personnumber + " " + name + " " + adress + " " + zipcode);
			}
			connection.close();
		}
		
	}
	
	public static void changeData() throws SQLException{
		try{
			connection = (Connection) DriverManager.getConnection(connectionString, username, psw);
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement("UPDATE `comhemcase2015`.`customer` SET `personnumber`='444', `name`='Sam Sammi', `adress`='hej', `zipcode`='22222' WHERE `personnumber`='55555';");
			int rows = statement.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Success again!");
			connection.close();
		}
		
	}

	public String getPersonnumber() {
		// TODO Auto-generated method stub
		return personnumber;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getAdress() {
		// TODO Auto-generated method stub
		return adress;
	}
	public String getZipcode() {
		// TODO Auto-generated method stub
		return zipcode;
	}
}
