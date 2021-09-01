package ca.derrick.springbootcrudrestfulwebservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	public User() {
		
	}
	public User(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(final Long newId) {
		this.id = newId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(final String newFirstName) {
		this.firstName = newFirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(final String newLastName) {
		this.lastName = newLastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
}
