package com.wwa.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class PostValue {
	
	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "post"))
	private Long postId;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Post post;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "cityId")
	private CityMaster city ;
	
	@Column(length = 500)
	private String value;

	@CreatedDate
	private DateTime createdOn;

	@LastModifiedDate
	private DateTime lastModifiedOn;


	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public CityMaster getCity() {
		return city;
	}

	public void setCity(CityMaster city) {
		this.city = city;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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
