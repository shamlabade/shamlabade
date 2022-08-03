package mapping_dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String number;
private String country;
@OneToOne 
@JoinColumn
private Person person;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}

}
