package com.sc.dcdb.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter @Setter
public class DcItem {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false,unique=true)
	private String name;
	private int isDeleted;
	private Date createdDate;
	private Date updatedDate;
	private String reference;
	private int isDraft;
	@OneToOne
	@JoinColumn(name="module_id")
	private DcModule module;
	@OneToMany
	@JoinColumn(name="item_id")
	private List<DcSynonym> synonyms;
	@OneToMany
	@JoinColumn(name="item_id")
	private List<DcDescriptiveMetaData> descriptiveMetaData;
	@OneToMany
	@JoinColumn(name="item_id")
	private List<DcStructuredMetaData> structuredMetaData;
	@OneToMany
	@JoinColumn(name="item_id")
	private List<DcImpactedItem> impactedConcepts;	
}
