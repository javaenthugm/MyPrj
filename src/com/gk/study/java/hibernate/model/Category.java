package com.gk.study.java.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	@Id @GeneratedValue
	private int catid;
	private String catName;
	
	@OneToMany(mappedBy="category" ,cascade=CascadeType.ALL)
	private Collection<SubCategory> subcatlist = new ArrayList<SubCategory>();
	
	
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public Collection<SubCategory> getSubcatlist() {
		return subcatlist;
	}
	public void setSubcatlist(Collection<SubCategory> subcatlist) {
		this.subcatlist = subcatlist;
	}
	
	
	
	
}
