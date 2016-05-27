package CodeGen.CodeGen;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import compoundBatch.model.CompoundBatch;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CompoundApi;
import io.swagger.client.api.TargetApi;
import targetInformation.model.TargetInformation;

public class TargetTest {

	private static ApiClient api;

	@BeforeClass
  	public static void setUp(){

	    api = new ApiClient();
	    api.setBasePath("https://beta.openphacts.org/1.5");

  	}	 
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testTargetInformation() throws ApiException {
	
	 	TargetApi target = new TargetApi();    	
	 	target.setApiClient(api);
	 	TargetInformation targetResponse = target.targetGet("http://www.conceptwiki.org/concept/00059958-a045-4581-9dc5-e5a08bb0c291",  "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", null, "json", null, null);

	 	assertThat(targetResponse.getResult().getPrimaryTopic().getExactMatch().size(), is(5));

	}
}
