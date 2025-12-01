package com.medicart.entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity //to declare the class as Entity - so that Hibernate can manage it's life cycle(creates a table in db for respective enitity)

@Table(name = "users") 
@AttributeOverride(name = "id", column = @Column(name = "user_id")) //to change the name of id inherited from BaseEntity

//Lombok Annotations
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Users extends BaseEntity{
	
	@Column(name = "full_name", length = 30) // specify col name , varchar size
	private String fullname;
	
	@Column(length = 50, unique = true) // col : unique constraint
	private String email;
	
	// not null constraint , size=300 (for hashed password)
	@Column(length = 300, nullable = false)
	private String password;
	
	@Transient //skip from persistence -> no col generation in db
//	private String confirmPassword;
	
	@Column(unique = true, length = 14)
	private String contact;
	
	@Enumerated(EnumType.STRING) //makes the col type - varchar | enum in db
	@Column(name="user_role") // to change the name of the attribute as per db naming conventions
	private UserRole userRole;

}
