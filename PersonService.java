package mapping_Service;

import java.util.List;

import org.hibernate.boot.query.NamedCallableQueryDefinition.ParameterMapping;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mapping_dao.Person_dao;
import mapping_dto.Person;

public class PersonService {
	static Person_dao d=new Person_dao();
	public boolean newPerson(Person p) {
		 d.newPerson(p);
		return true;
	}		
	public boolean updatePerson(Person p) {
		d.updatePerson(p);
		return true;
	}
	public boolean deletePerson(int id) {
		d.deletePerson(id);
		return true;
	}
	public Person getPerson(int id) {
		return	d.getPerson(id);
	}
	public List<Person> allPerson() {
	return	d.allPersons();
	}

}
