package com.medicart.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Declares a common base class , w/o any table associated with it.
@MappedSuperclass

//Lombok Annotations
@Getter
@Setter
@ToString
public abstract class BaseEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-Increment_ID
	private Long id;
	
	@CreationTimestamp  //to specify creation date 
	@Column(name="created_on")
	private LocalDate createdOn;
	
	@UpdateTimestamp  //to specify updation date 
	@Column(name="last_updated")
	private LocalDate lastUpdated;
	
        
}
