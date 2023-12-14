package com.test1;

public class RegionStatiData {
	private String countryCode;
	private String regionCode;
	private String regionName;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RegionStatiData() {

	}

	public RegionStatiData(String countryCode, String regionCode, String regionName, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.regionCode = regionCode;
		this.regionName = regionName;
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

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
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
