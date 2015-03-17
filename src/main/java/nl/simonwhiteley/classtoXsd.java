package nl.simonwhiteley;

import generated.by.jaxb.PowerRequest;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class classtoXsd {
	
	public static void main(String[] args) {
		
    	try {
			JAXBContext context = JAXBContext.newInstance(PowerRequest.class);
	
			ClassToSchemaOutputResolver x = new ClassToSchemaOutputResolver();
			context.generateSchema(x);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
