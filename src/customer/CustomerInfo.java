package customer;

public class CustomerInfo {

	String social = "";
	String name = "hj";
	String adress = "";
	String zip = "";
	
	public String getSocial() {return social;}
	
	public String getName() {return name;}
	
	public String getAdress() {return adress;}
	
	public String getZip() {return zip;}
	
	
	public void setSocial(String value)
	{
		social = value;
		System.out.println(social);
	}
	
	public void setName(String value)
	{
		name = value;
		System.out.println(name);
	}
	
	public void setAdress(String value)
	{
		adress = value;
	}
	
	public void setZip(String value)
	{
		zip = value;
	}
	
	
}
