package com.test1;

public class DataReference {
	private Integer DataRefId;
	private String columnName;
	private String jsonName;
	private String filterName;
	private String isDynamic;
	private String isStatic;
	private String staticRefId;
	private String dynamicRefId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataReference() {

	}

	public DataReference(Integer dataRefId, String columnName, String jsonName, String filterName, String isDynamic,
			String isStatic, String staticRefId, String dynamicRefId, String creationDate, String modifiedDate,
			String entityState) {
		super();
		DataRefId = dataRefId;
		this.columnName = columnName;
		this.jsonName = jsonName;
		this.filterName = filterName;
		this.isDynamic = isDynamic;
		this.isStatic = isStatic;
		this.staticRefId = staticRefId;
		this.dynamicRefId = dynamicRefId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getDataRefId() {
		return DataRefId;
	}

	public void setDataRefId(Integer dataRefId) {
		DataRefId = dataRefId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getJsonName() {
		return jsonName;
	}

	public void setJsonName(String jsonName) {
		this.jsonName = jsonName;
	}

	public String getFilterName() {
		return filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	public String getIsDynamic() {
		return isDynamic;
	}

	public void setIsDynamic(String isDynamic) {
		this.isDynamic = isDynamic;
	}

	public String getIsStatic() {
		return isStatic;
	}

	public void setIsStatic(String isStatic) {
		this.isStatic = isStatic;
	}

	public String getStaticRefId() {
		return staticRefId;
	}

	public void setStaticRefId(String staticRefId) {
		this.staticRefId = staticRefId;
	}

	public String getDynamicRefId() {
		return dynamicRefId;
	}

	public void setDynamicRefId(String dynamicRefId) {
		this.dynamicRefId = dynamicRefId;
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
