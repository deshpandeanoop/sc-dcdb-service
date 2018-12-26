package com.sc.dcdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class DcDescriptiveMetaData {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false,unique=true)
	private String name;
	@Column(nullable=false)
	private String descr;
	private int isDeleted;
}
