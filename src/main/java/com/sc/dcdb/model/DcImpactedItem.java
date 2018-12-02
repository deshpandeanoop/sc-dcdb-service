package com.sc.dcdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DcImpactedItem {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false)
	private String impactedDescr;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImpactedDescr() {
		return impactedDescr;
	}
	public void setImpactedDescr(String impactedDescr) {
		this.impactedDescr = impactedDescr;
	}
	
}
