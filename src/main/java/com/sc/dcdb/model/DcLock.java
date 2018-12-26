package com.sc.dcdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class DcLock {
	@Id
	@GeneratedValue
	private long id;
	@Column(unique=true)
	private long itemId;
	public DcLock(long itemId) {
		super();
		this.itemId = itemId;
	}	
}
