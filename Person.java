package mapping_dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)

private int id;
private String name;
private String email;
@OneToOne (mappedBy = "person" , cascade = CascadeType.ALL)
private Passport passport;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Passport getPassport() {
	return passport;
}
public void setPassport(Passport passport) {
	this.passport = passport;
}

}
