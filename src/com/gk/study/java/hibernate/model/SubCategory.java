package com.gk.study.java.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subcategory")
public class SubCategory {
	@Id
	@GeneratedValue
	private int subcatid;
	private String subcatname;
	
	@ManyToOne
	@JoinColumn(name="catid")
	private Category category;
	
	public int getSubcatid() {
		return subcatid;
	}
	public void setSubcatid(int subcatid) {
		this.subcatid = subcatid;
	}
	public String getSubcatname() {
		return subcatname;
	}
	public void setSubcatname(String subcatname) {
		this.subcatname = subcatname;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
