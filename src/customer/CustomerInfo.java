package customer;

import java.sql.SQLException;

public class CustomerInfo {
	String social;
	String name;
	String adress;
	String zip;
	DBManager db = new DBManager();

	public String getSocial() throws ClassNotFoundException, SQLException {

		social=db.getPersonnumber();
		if(social != null){
			return social;
		}
		return "";}

	public String getName() {
		name=db.getName();
		if(name != null){
		return name;}
		return "";}

	public String getAdress() {
		adress=db.getAdress();
		if(adress != null){
			return adress;
		}
		return "";
}

	public String getZip() {

		zip=db.getZipcode();
		if(zip != null){
			return zip;
		}
		return "";}

	public void setSocial(String value) throws ClassNotFoundException, SQLException
	{
		db.searchData(value);
		social = value;
	}

	
	public void setName(String value)
	{
		name = value;
	}
	
	public void setAdress(String value)
	{
		adress = value;
		
	}
	
	public void setZip(String value) throws SQLException, ClassNotFoundException
	{
		zip = value;
		setData();
		addData();
	}
	public void setData() throws SQLException{
		System.out.println(name);
		DBManager.changeData(social, name, adress, zip);
		
	}
	public void addData() throws ClassNotFoundException, SQLException{
		if(!db.found){
			DBManager.addData(social, name, adress, zip);
		}
	}
}
