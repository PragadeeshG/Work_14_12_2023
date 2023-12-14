package com.test1;

public class DynamicData {
	private String id;
	private String dataType;
	private String dependsOn;
	private String tableName;
	private String whereClause;
	private String defaultFilter;
	private String sortClause;
	private String searchColumns;
	private String columnAlias;
	private boolean isAliasRequired;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DynamicData() {

	}

	public DynamicData(String id, String dataType, String dependsOn, String tableName, String whereClause,
			String defaultFilter, String sortClause, String searchColumns, String columnAlias, boolean isAliasRequired,
			boolean isActive, String creationDate, String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.dataType = dataType;
		this.dependsOn = dependsOn;
		this.tableName = tableName;
		this.whereClause = whereClause;
		this.defaultFilter = defaultFilter;
		this.sortClause = sortClause;
		this.searchColumns = searchColumns;
		this.columnAlias = columnAlias;
		this.isAliasRequired = isAliasRequired;
		this.isActive = isActive;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDependsOn() {
		return dependsOn;
	}

	public void setDependsOn(String dependsOn) {
		this.dependsOn = dependsOn;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getWhereClause() {
		return whereClause;
	}

	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}

	public String getDefaultFilter() {
		return defaultFilter;
	}

	public void setDefaultFilter(String defaultFilter) {
		this.defaultFilter = defaultFilter;
	}

	public String getSortClause() {
		return sortClause;
	}

	public void setSortClause(String sortClause) {
		this.sortClause = sortClause;
	}

	public String getSearchColumns() {
		return searchColumns;
	}

	public void setSearchColumns(String searchColumns) {
		this.searchColumns = searchColumns;
	}

	public String getColumnAlias() {
		return columnAlias;
	}

	public void setColumnAlias(String columnAlias) {
		this.columnAlias = columnAlias;
	}

	public boolean isAliasRequired() {
		return isAliasRequired;
	}

	public void setAliasRequired(boolean isAliasRequired) {
		this.isAliasRequired = isAliasRequired;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
