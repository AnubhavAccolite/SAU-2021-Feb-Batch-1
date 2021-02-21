package com.example.au.couchbasedemo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

@Document
public class Blogs {
    
    @Id
    String id;
    
    @NotNull
    @Field
    String MovieName;
    
    @NotNull
    @Field
    List<String> city;
    
     @NotNull
     @Field
     String genere;
    
   

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String name) {
		this.MovieName = name;
	}

	public List<String> getcity() {
		return city;
	}

	public void setCerti(List<String> city) {
		this.city = city;
	}

	
	public String getId() {
		return id;
	}
        public String getgenere() {
		return genere;
	}

	public void setgenere(String name) {
		this.genere = genere;
	}

	public Blogs(String id, String name,List<String>City, String genres) {
		super();
		this.id = id;
		this.MovieName = name;
		this.city = city;
                this.genere=genere;

		
	}
    
    
    
}
