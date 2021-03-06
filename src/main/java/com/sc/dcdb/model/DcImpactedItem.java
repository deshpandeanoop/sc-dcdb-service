package com.sc.dcdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class DcImpactedItem {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false)
	private String impactedDescr;
}
