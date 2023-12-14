package com.test1;

public class StaticData {
	private Integer id;
	private String staticRefName;
	private String dataType;
	private String staticTableName;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public StaticData() {

	}

	public StaticData(Integer id, String staticRefName, String dataType, String staticTableName, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.staticRefName = staticRefName;
		this.dataType = dataType;
		this.staticTableName = staticTableName;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStaticRefName() {
		return staticRefName;
	}

	public void setStaticRefName(String staticRefName) {
		this.staticRefName = staticRefName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getStaticTableName() {
		return staticTableName;
	}

	public void setStaticTableName(String staticTableName) {
		this.staticTableName = staticTableName;
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
