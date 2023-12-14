package com.test1;

public class CountryStaticData {
	private String countryCode;
	private String countryname;
	private String type;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CountryStaticData() {

	}

	public CountryStaticData(String countryCode, String countryname, String type, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.countryname = countryname;
		this.type = type;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
