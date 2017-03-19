package com.wwa.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


/**
 * @author Wasim
 */
@Entity
public class User {

	public User() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	@Column(nullable = false, length = 75)
	private String firstName;

	@Column(length = 75)
	private String middleName;

	@Column(length = 75)
	private String lastName;

	@Column(unique = true, nullable = false, length = 75)
	private String loginId = null;

	@Column(nullable = false, length = 500)
	private String password = null;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private CityMaster city;

	@ManyToOne(fetch = FetchType.LAZY)
	private CountryMaster country;

	@Column(length = 75)
	private String emailId = null;

	@Column(nullable = false, length = 75)
	private String mobile;

	@CreatedDate
	private DateTime createdOn;

	@LastModifiedDate
	private DateTime lastModifiedOn;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getFullName() {
		return firstName + " " + lastName;
	}

	


	public CityMaster getCity() {
		return city;
	}

	public void setCity(CityMaster city) {
		this.city = city;
	}

	public CountryMaster getCountry() {
		return country;
	}

	public void setCountry(CountryMaster country) {
		this.country = country;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loginId == null) ? 0 : loginId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (loginId == null) {
			if (other.loginId != null)
				return false;
		} else if (!loginId.equals(other.loginId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

}
