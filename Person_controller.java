package mapping_controller;

import java.util.List;
import java.util.Scanner;

import mapping_Service.PersonService;
import mapping_dto.Passport;
import mapping_dto.Person;

public class Person_controller {

	

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 boolean status=true;
		 while(status) {
			 System.out.println("--------------Welcome----------");
			 System.out.println("1: for adding new person and passport details");
			 System.out.println("2: getting person and passport details by id");
			 System.out.println("3: Update person and passport details");
			 System.out.println("4: Delete person and passport details");
			 System.out.println("5: Getting All person and passport details");
			 System.out.println("6: for Exit");
			 int no=scanner.nextInt();
			 switch (no) {
			case 1:{
				Person person=new Person();
				System.out.println("Enter Person Name");
				person.setName(scanner.next());
				System.out.println("Enter Person Email id");
				person.setEmail(scanner.next());
				
				Passport passport=new Passport();
				System.out.println("Enter passport Number");
				passport.setNumber(scanner.next());
				System.out.println("Enter passport issue Country");
				passport.setCountry(scanner.next());
				
				person.setPassport(passport);
				passport.setPerson(person);
				PersonService personService=new PersonService();
				personService.newPerson(person);
			}
				
				break;
			case 2:{
				PersonService personService=new PersonService();
				System.out.println("Enter Person id");
				Person g = personService.getPerson(scanner.nextInt());
				System.out.println("person id "+g.getId());
				System.out.println("person name "+g.getName());
				System.out.println("person email "+g.getEmail());
				System.out.println("passport number "+g.getPassport().getNumber());
				System.out.println("passport country "+g.getPassport().getCountry());
			}
			break;
			case 3:{
				Person person=new Person();
				System.out.println("Enter Person id");
				person.setId(scanner.nextInt());
				System.out.println("Enter Person Name");
				person.setName(scanner.next());
				System.out.println("Enter Person Email id");
				person.setEmail(scanner.next());
				
				Passport passport=new Passport();
				System.out.println("Enter passport Number");
				passport.setNumber(scanner.next());
				System.out.println("Enter passport issue Country");
				passport.setCountry(scanner.next());
				
				person.setPassport(passport);
				passport.setPerson(person);
				PersonService personService=new PersonService();
				personService.newPerson(person);
			}
			break;
			case 4:{
				System.out.println("Enter Person id");
				PersonService personService=new PersonService();
				personService.deletePerson(scanner.nextInt());
			}
			break;
			case 5:{
				PersonService personService=new PersonService();
				List<Person> all = personService.allPerson();
				for(Person p:all) {
					System.out.println(p.getId());
					System.out.println(p.getName());
					System.out.println(p.getEmail());
					System.out.println(p.getPassport().getNumber());
					System.out.println(p.getPassport().getCountry());
					System.out.println("--------------------------------------");
				}
			}
			break;
			case 6:{
				status=false;
				System.out.println("------------------Thank You---------------");
			}
			break;
			default:{
				System.out.println("Enter valid input");
			}
				
				
			}
		 }

	}

}
