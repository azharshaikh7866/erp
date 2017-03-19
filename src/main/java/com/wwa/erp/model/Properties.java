package com.wwa.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class Properties {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long propertyId;

	@Column(nullable = false, length = 75)
	private String propertyName;

	@Column(length = 75)
	private Long categoryId;

	@CreatedDate
	private DateTime createdOn;

	@LastModifiedDate
	private DateTime lastModifiedOn;

	public Long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public DateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}

	public DateTime getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(DateTime lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	

}
