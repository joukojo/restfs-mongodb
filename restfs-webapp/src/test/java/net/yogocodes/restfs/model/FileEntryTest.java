package net.yogocodes.restfs.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;


public class FileEntryTest {

	@Test
	public void testMarshall() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(FileEntry.class);
		
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		FileEntry fileEntry = new FileEntry();
		marshaller.marshal(fileEntry, System.out);
	}
	
}
