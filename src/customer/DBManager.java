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
	static boolean found = false;
		
	public static void addData(String prsnum, String nm, String adrs, String zip) throws SQLException, ClassNotFoundException{
		try{
			connection = (Connection) DriverManager.getConnection(connectionString, username, psw);
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement("INSERT INTO `comhemcase2015`.`customer` (`personnumber`, `name`, `adress`, `zipcode`) VALUES ('" + prsnum +"', '" + nm + "', '" + adrs + "', '" + zip + "');");
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
	
	public static void searchData(String query) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		queryString = query;
		found = false;
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
			found = true;
			}
			connection.close();
		}
	}
	
	public static void changeData(String prsnum, String nm, String adrs, String zip) throws SQLException{
		try{
			connection = (Connection) DriverManager.getConnection(connectionString, username, psw);
			System.out.println(prsnum);
			System.out.println(nm);
			System.out.println(adrs);
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement("UPDATE `comhemcase2015`.`customer` SET `name`= " +"'" + nm +"'" + ", `adress`= " +"'" + adrs + "'" + ", `zipcode`= " + "'" + zip + "'" + " WHERE `personnumber`= " + prsnum +";");

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
