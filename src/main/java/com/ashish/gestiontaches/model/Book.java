package com.ashish.gestiontaches.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	   private String title;
	   private String author;

	   
		
		public Book() {
			super();
		}



		public Book(String title, String author) {
			super();
			this.title = title;
			this.author = author;
		}

		
	   public Long getId() {
	      return id;
	   }

	   public void setId(Long id) {
	      this.id = id;
	   }

	   public String getTitle() {
	      return title;
	   }

	   public void setTitle(String title) {
	      this.title = title;
	   }

	   public String getAuthor() {
	      return author;
	   }

	   public void setAuthor(String author) {
	      this.author = author;
	   }


}
