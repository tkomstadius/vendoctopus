package customer;

import java.sql.SQLException;

public class CustomerInfo {
	String social=" ";
	String name =" ";
	String adress=" ";
	String zip = " ";
	DBManager db = new DBManager();

	public String getSocial() throws ClassNotFoundException, SQLException {


		db.searchData();
		social=db.getPersonnumber();


		return social;}

	public String getName() {
		name=db.getName();
		return name;}

	public String getAdress() {
		adress=db.getAdress();

		return adress;}

	public String getZip() {

		zip=db.getZipcode();
		return zip;}


	public void setSocial(String value)
	{
		social = value;
		System.out.println(social);
		System.out.print("LLLLLLLLLLLLLLLLLL");
	}

}
