package kw.kng.utilis;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import kw.kng.binders.Person;

public class UnmarshalDemo 
{
public static void main(String[] args) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		System.out.println("Context created.");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		System.out.println("Unmarshaller created.");
		System.out.println("Unmarshaller will convert XML to POJO");
		Person p  = (Person) unmarshaller.unmarshal(new File("person.xml"));
		System.out.println("Conversion done.....");
		System.out.println(p);
	}


}
