package CodeGen.CodeGen;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

import compoundClassifications.model.CompoundClassifications;
import compoundclassificationsForTargets.model.ClassificationsForTargets;
import io.swagger.client.*;
import io.swagger.models.Model;
import io.swagger.models.Operation;
import io.swagger.models.Path;
import io.swagger.models.Swagger;
import io.swagger.models.parameters.BodyParameter;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.parameters.PathParameter;
import io.swagger.parser.SwaggerParser;

public class App 
{
    public static void main( String[] args ) throws ApiException, IOException, NoSuchFieldException, SecurityException
    {
    	    	   	  
    	//  Swagger swagger = new SwaggerParser().read("https://raw.githubusercontent.com/openphacts/OPS_LinkedDataApi/2.0.0/api-config-files/swagger-2.0.json");
    	   Swagger swagger = new SwaggerParser().read("http://techliners.com/ops_2_1.json");
    	//  Swagger swagger = new SwaggerParser().read("http://techliners.com/swagger.json");
    	   
    	   io.swagger.models.parameters.QueryParameter parameter = (io.swagger.models.parameters.QueryParameter) swagger.getPaths().get("/compound").getGet().getParameters().get(3);
 	 	 
       	   System.out.println(parameter.getEnum()+" "+parameter.getName());

       	   System.out.println(parameter.getRequired());
       	
    	
       	  /***** ALL PATHS *******/
     	 
       	  Map<String, Path>	paths =  swagger.getPaths();
       	  paths.forEach((k, v) -> {
       		  
       		  System.out.println(k.toString());
       		
       		  getSingleMethod(swagger, k.toString());
       		
       		  System.out.println("");       	  	
       		  
       	  	}
       	  
       	   );
       	
    }
    
    public static void getSingleMethod( Swagger swagger, String name){
    	
    	 List<Parameter> parameters = swagger.getPaths().get(name).getGet().getParameters();
  		  for (Parameter single : parameters){
  	     	 io.swagger.models.parameters.QueryParameter query;

  			  if(single.getClass().toString().indexOf("io.swagger.models.parameters.QueryParameter")!=-1){
  				    query = (io.swagger.models.parameters.QueryParameter) single;
         			 System.out.println(query.getName()+" "+((query.getEnum()==null)?"":query.getEnum())+" "+query.getDefaultValue()+" "+query.getRequired());       	  	
  			  }else
      			 System.out.println(single.getName());       	  	

  			 
  		  }
  		  
    }

}
