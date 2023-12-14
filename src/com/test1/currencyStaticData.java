package com.test1;

public class currencyStaticData {
	private Integer countryCode;
	private String currencyCode;
	private boolean isoCurrency;
	private String currencyDesc;
	private boolean tradingCurrency;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public currencyStaticData() {

	}

	public currencyStaticData(Integer countryCode, String currencyCode, boolean isoCurrency, String currencyDesc,
			boolean tradingCurrency, String creationDate, String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.currencyCode = currencyCode;
		this.isoCurrency = isoCurrency;
		this.currencyDesc = currencyDesc;
		this.tradingCurrency = tradingCurrency;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public boolean isIsoCurrency() {
		return isoCurrency;
	}

	public void setIsoCurrency(boolean isoCurrency) {
		this.isoCurrency = isoCurrency;
	}

	public String getCurrencyDesc() {
		return currencyDesc;
	}

	public void setCurrencyDesc(String currencyDesc) {
		this.currencyDesc = currencyDesc;
	}

	public boolean isTradingCurrency() {
		return tradingCurrency;
	}

	public void setTradingCurrency(boolean tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
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
