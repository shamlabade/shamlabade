package mapping_dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import mapping_dto.Person;

public class Person_dao {
	static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sham");
	public void newPerson(Person p) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}
	public void updatePerson(Person p) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(p);
		entityTransaction.commit();
		
	}
	public void deletePerson(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person p=entityManager.find(Person.class,id);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
	}
	public Person getPerson(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager.find(Person.class,id);
	}
	public List<Person> allPersons() {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query o = entityManager.createQuery("select a from Person a");
	return	o.getResultList();
	}
}
