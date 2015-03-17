package nl.simonwhiteley;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class ClassToSchemaOutputResolver extends SchemaOutputResolver {
	
	public Result createOutput(String namespaceUri, String suggestedFileName)
	throws IOException {
	      // create new file
	      File file = new File("genSchema.xsd");
	      
	      // create stream result
	      StreamResult result = new StreamResult(file);
	      
	      // set system id
	      result.setSystemId(file.toURI().toURL().toString());
	      
	      // return result
	      return result;
	}

}
