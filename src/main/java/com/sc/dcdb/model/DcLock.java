package com.sc.dcdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DcLock {
	@Id
	@GeneratedValue
	private long id;
	@Column(unique=true)
	private long itemId;
}
