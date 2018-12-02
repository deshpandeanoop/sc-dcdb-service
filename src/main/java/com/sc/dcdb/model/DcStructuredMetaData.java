package com.sc.dcdb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class DcStructuredMetaData {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false,unique=true)
	private String name;
	@Column(nullable=false)
	private String descr;
	private int isDeleted;
	@OneToMany
	@JoinColumn(name="meta_data_id")
	private List<DcMetaDataOfMetaData> metaData;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public List<DcMetaDataOfMetaData> getMetaData() {
		return metaData;
	}
	public void setMetaData(List<DcMetaDataOfMetaData> metaData) {
		this.metaData = metaData;
	}
	
}
