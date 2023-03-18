package kw.kng.utilis;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import kw.kng.binders.Address;
import kw.kng.binders.Person;

public class MarshallDemo 
{
public static void main(String[] args) throws Exception
	{		
		
		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");

		Person p = new Person();
		p.setId(101);
		p.setName("Ashok");
		p.setGender("Male");
		p.setEmail("ashokitschool@gmail.com");
		p.setAddr(addr);

		JAXBContext context = JAXBContext.newInstance(Person.class);
		System.out.println("Context created.");
		Marshaller marshaller = context.createMarshaller();
		System.out.println("Marshaller created.");
		marshaller.marshal(p, new File("person.xml"));
		System.out.println("Marshaller will convert POJO to XML.");
		
		System.out.println("Conversion done.....");

	}
}
