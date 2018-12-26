package com.sc.dcdb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
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
}
