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

@Entity
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
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public int getIsDraft() {
		return isDraft;
	}
	public void setIsDraft(int isDraft) {
		this.isDraft = isDraft;
	}
	public DcModule getModule() {
		return module;
	}
	public void setModule(DcModule module) {
		this.module = module;
	}
	public List<DcSynonym> getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(List<DcSynonym> synonyms) {
		this.synonyms = synonyms;
	}
	public List<DcDescriptiveMetaData> getDescriptiveMetaData() {
		return descriptiveMetaData;
	}
	public void setDescriptiveMetaData(List<DcDescriptiveMetaData> descriptiveMetaData) {
		this.descriptiveMetaData = descriptiveMetaData;
	}
	public List<DcStructuredMetaData> getStructuredMetaData() {
		return structuredMetaData;
	}
	public void setStructuredMetaData(List<DcStructuredMetaData> structuredMetaData) {
		this.structuredMetaData = structuredMetaData;
	}
	public List<DcImpactedItem> getImpactedConcepts() {
		return impactedConcepts;
	}
	public void setImpactedConcepts(List<DcImpactedItem> impactedConcepts) {
		this.impactedConcepts = impactedConcepts;
	}
	
}
