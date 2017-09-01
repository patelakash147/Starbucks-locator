package homework4;

public class models {

	private int store_id;
	private String name;
	private String owner_type;
	private String facility_id;
	private String Features;
	private String phon_num;
	private String street_1;
	private String street_2;
	private String street_3;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String coordinates;
	private String lattitude;
	private String longitude;
	public models(){}
	
	public models(int store_id, String name, String owner_type, String facility_id, String features, String phon_num,
			String street_1, String street_2, String street_3, String city, String state, String zip, String country,
			String coordinates, String lattitude, String longitude) 
	{
		super();
		this.store_id = store_id;
		this.name = name;
		this.owner_type = owner_type;
		this.facility_id = facility_id;
		this.Features = features;
		this.phon_num = phon_num;
		this.street_1 = street_1;
		this.street_2 = street_2;
		this.street_3 = street_3;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.coordinates = coordinates;
		this.lattitude = lattitude;
		this.longitude = longitude;
	}
	
	public int getStore_id() {
		return store_id;
	}
	
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOwner_type() {
		return owner_type;
	}
	public void setOwner_type(String owner_type) {
		this.owner_type = owner_type;
	}
	
	public String getFacility_id() {
		return facility_id;
	}
	
	public void setFacility_id(String facility_id) {
		this.facility_id = facility_id;
	}
	
	public String getFeatures() {
		return Features;
	}
	
	public void setFeatures(String features) {
		Features = features;
	}
	
	public String getPhon_num() {
		return phon_num;
	}
	
	public void setPhon_num(String phon_num) {
		this.phon_num = phon_num;
	}
	
	public String getStreet_1() {
		return street_1;
	}
	
	public void setStreet_1(String street_1) {
		this.street_1 = street_1;
	}
	
	public String getStreet_2() {
		return street_2;
	}
	
	public void setStreet_2(String street_2) {
		this.street_2 = street_2;
	}
	
	public String getStreet_3() {
		return street_3;
	}
	
	public void setStreet_3(String street_3) {
		this.street_3 = street_3;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	
	public String getLattitude() {
		return lattitude;
	}
	
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
}
