package com.ashish.gestiontaches.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Task implements Serializable {


	private static final long serialVersionUID = -8458865791409558471L;
	
	@Id
	@GeneratedValue
	private long id;
	@NotEmpty
	private String title;
	@NotEmpty
	private String description;
	@Temporal(TemporalType.DATE)
 	private Date creationDate;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	private boolean completed;
	
	@PrePersist
	private void init() {
		this.creationDate=new Date();
		
	}

	
	
	public Task() {
		super();
	}



	public Task(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Date getCreationDate() {
		return creationDate;
	}



	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public boolean isCompleted() {
		return completed;
	}



	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	
	
	
}
