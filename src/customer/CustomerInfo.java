package customer;

public class CustomerInfo {
	String social = "";
	String name = "Therése Komstadius";
	String adress = "Elias lönnrots väg 27";
	String zip = "16846";
	
	public String getSocial() {return social;}
	
	public String getName() {return name;}
	
	public String getAdress() {return adress;}
	
	public String getZip() {return zip;}
	
	
	public void setSocial(String value)
	{
		social = value;
		System.out.println(social);
	}
	
	
}
