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
public class CountryMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long countryId;

	@Column(unique = true, nullable = false, length = 75)
	private String countryName;
	
	@Column(unique = true, nullable = false, length = 75)
	private String countryCode;

	

	@CreatedDate
	private DateTime createdOn;

	@LastModifiedDate
	private DateTime lastModifiedOn;

	

	public CountryMaster() {
		super();
	}

	

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	
	

}
