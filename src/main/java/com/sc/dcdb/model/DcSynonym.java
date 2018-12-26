package com.sc.dcdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class DcSynonym {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false,unique=true)
	private String name;
	private int isDeleted;
}
