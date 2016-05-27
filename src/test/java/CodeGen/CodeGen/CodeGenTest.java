package CodeGen.CodeGen;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.JSON;
import io.swagger.client.TypeRef;
import io.swagger.client.api.CompoundApi;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.stream.JsonReader;

import compoundBatch.model.CompoundBatch;
import compoundClassPharmacologyCount.model.CompoundClassPharmacologyCount;
import compoundClassPharmacologyList.model.CompoundClassPharmacologyList;
import compoundClassifications.model.CompoundClassifications;
import compoundClassifications.model.PrimaryTopic;
import compoundClassifications.model.ReportedAdverseEvent;
import compoundClassifications.model.SingleMatch;
import compoundClassifications.model.SingleReport;
import compoundCount.model.CompoundCount;
import compoundInformation.model.CompoundInformation;
import compoundList.model.CompoundList;
import compoundPharmacologyCount.model.CompoundPharmacologyCount;
import compoundPharmacologyList.model.CompoundPharmacologyList;
import compoundclassificationsForTargets.model.ClassificationsForTargets;

public class CodeGenTest {

	private static ApiClient api;

	@BeforeClass
  	public static void setUp(){

	    api = new ApiClient();
	    api.setBasePath("https://beta.openphacts.org/2.0");

  	}	 
  	
	@Test
	public void testCompundClassifications() throws ApiException {
	
	 	CompoundApi compound = new CompoundApi();    	
	 	compound.setApiClient(api);
	 	CompoundClassifications compoundResponse = compound.compoundClassificationsGet("http://www.conceptwiki.org/concept/38932552-111f-4a4e-a46a-4ed1d7bdf9d5", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", null, "json", null, null);
    	
	 	assertThat(compoundResponse.getFormat(), is("linked-data-api"));
	 	assertThat(compoundResponse.getResult().getDefinition(), is("https://beta.openphacts.org/api-config"));
		assertThat(compoundResponse.getResult().getPrimaryTopic().getExactMatch().size(), is(2));

		ArrayList<Object> match= (ArrayList<Object>) compoundResponse.getResult().getPrimaryTopic().getExactMatch();

		List<SingleMatch> singleMatches = new ArrayList<SingleMatch>();
		List<SingleReport> singleReports = new ArrayList<SingleReport>();

		SingleMatch tmp = new SingleMatch();
		LinkedHashMap tmpHash;
		for (Object single : match)
		{	
			if(!single.getClass().toString().equals("class java.lang.String")){
				
				tmpHash=(LinkedHashMap) single;
		    	tmp.set_about(tmpHash.get("_about").toString());
		    	tmp.setInDataSet(tmpHash.get("inDataset").toString());
		    	
		    	if(tmpHash.get("reportedAdverseEvent")!=null){

		    		ArrayList<Object> reportList= (ArrayList<Object>) tmpHash.get("reportedAdverseEvent");
		    		
		    		for (Object now : reportList){
			    		
		    			LinkedHashMap tmpoHash=(LinkedHashMap) now;
		    			SingleReport tmpo = new SingleReport();
		    			
			    		tmpo.set_about(tmpoHash.get("_about").toString());
			    		tmpo.setInDataSet(tmpoHash.get("inDataset").toString());	
			    		tmpo.setPrefLabel(tmpoHash.get("prefLabel").toString());		    	
			    		singleReports.add(tmpo);
		    		}		    				    				


		    	}
		    	
		    	tmp.setReportedAdverseEvent(singleReports);
		        singleMatches.add(tmp);
		        
		    }	
		
			System.out.println(single);
		}
		   // System.out.print(singleMatches.get(3).getreportedAdverseEvent().get(0).getAbout());
		
		    //System.out.print(singleMatches.get(3).get_about());
		
	}
	

	@Test
	public void testcompoundBatchGet() throws ApiException {
	
	 	CompoundApi compoundBatch = new CompoundApi();    	
	 	compoundBatch.setApiClient(api);
        CompoundBatch compoundBatchResponse = compoundBatch.compoundBatchGet("http://www.conceptwiki.org/concept/38932552-111f-4a4e-a46a-4ed1d7bdf9d5|http://www.conceptwiki.org/concept/dd758846-1dac-4f0d-a329-06af9a7fa413", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", "json", null, null);
	 	assertThat(compoundBatchResponse.getResult().getDefinition(), is("https://beta.openphacts.org/api-config"));
	 	assertThat(compoundBatchResponse.getResult().getItems().get(0).getExactMatch().size(), is(5));

	}
	
	@Test
	public void testcompoundCountGet() throws ApiException {
	
	 	CompoundApi compoundCount = new CompoundApi();    	
	 	compoundCount.setApiClient(api);
        CompoundCount compoundCountResponse = compoundCount.compoundMembersCountGet("http://purl.obolibrary.org/obo/CHEBI_24431", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", "json", null, null);
	 	assertThat(compoundCountResponse.getResult().getDefinition(), is("https://beta.openphacts.org/api-config"));
	 	assertThat(compoundCountResponse.getResult().getPrimaryTopic().getAbout(), is("http://purl.obolibrary.org/obo/CHEBI_24431"));
	 	assertThat(compoundCountResponse.getResult().getPrimaryTopic().getMemberCount(), is(54936));

	}

	@Test
	public void testcompoundListGet() throws ApiException {
	
	 	CompoundApi compoundList = new CompoundApi();    	
	 	compoundList.setApiClient(api);
        CompoundList compoundListResponse = compoundList.compoundMembersPagesGet("http://purl.obolibrary.org/obo/CHEBI_24431", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", null, null,null, null,"json", null, null);
        
	 	assertThat(compoundListResponse.getResult().getAbout(), is("https://beta.openphacts.org/1.5/compound/members/pages?uri=http%3A%2F%2Fpurl.obolibrary.org%2Fobo%2FCHEBI_24431&app_id=d283dc2c&app_key=5b723e13d2b6d891edae0c2a8e1e85a0&_format=json&_page=1"));
	 	assertThat(compoundListResponse.getResult().getItems().size(), is(10));

	}

	@Test
	public void testcompoundInformationGet() throws ApiException {
	
	 	CompoundApi compoundInformation = new CompoundApi();    	
	 	compoundInformation.setApiClient(api);
        CompoundInformation compoundInformationResponse = compoundInformation.compoundGet("http://www.conceptwiki.org/concept/38932552-111f-4a4e-a46a-4ed1d7bdf9d5", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0","json", null, null);
        
	 	assertThat(compoundInformationResponse.getResult().getAbout(), is("https://beta.openphacts.org/1.5/compound?uri=http%3A%2F%2Fwww.conceptwiki.org%2Fconcept%2F38932552-111f-4a4e-a46a-4ed1d7bdf9d5&app_id=d283dc2c&app_key=5b723e13d2b6d891edae0c2a8e1e85a0&_format=json"));
	 
	 	assertThat(compoundInformationResponse.getResult().getPrimaryTopic().getExactMatch().size(), is(6));
	 	assertThat(compoundInformationResponse.getResult().getPrimaryTopic().getExactMatch().get(2).toString(), is("http://www.conceptwiki.org/concept/38932552-111f-4a4e-a46a-4ed1d7bdf9d5"));

	}
	
	@Test
	public void testcompoundClassificationsForTargetsGet() throws ApiException {
	
	 	CompoundApi classificationsForTargets = new CompoundApi();    	
	 	classificationsForTargets.setApiClient(api);
	 	ClassificationsForTargets compoundInformationResponse = classificationsForTargets.compoundClassificationsForTargetsGet("http://ops.rsc.org/OPS6958", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", null, null, null, null, null, null,null, null, null, null, null, null, null, null, null, null, "json",null, null);
	 	assertThat(compoundInformationResponse.getResult().getPrimaryTopic().getExactMatch().size(), is(2));
	 	assertThat(compoundInformationResponse.getResult().getPrimaryTopic().getIsPrimaryTopicOf(), is("https://beta.openphacts.org/1.5/compound/classificationsForTargets?uri=http%3A%2F%2Fops.rsc.org%2FOPS6958&app_id=d283dc2c&app_key=5b723e13d2b6d891edae0c2a8e1e85a0&_format=json"));

	}
	
	
	@Test
	public void testcompoundCompoundPharmacologyCount() throws ApiException {
	
	 	CompoundApi compoundPharmacologyCount = new CompoundApi();    	
	 	compoundPharmacologyCount.setApiClient(api);
	 	CompoundPharmacologyCount compoundPharmacologyCountResponse = compoundPharmacologyCount.compoundPharmacologyCountGet("http://www.conceptwiki.org/concept/38932552-111f-4a4e-a46a-4ed1d7bdf9d5", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, null, null,null, null, "json",null, null);
	 	assertThat(compoundPharmacologyCountResponse.getResult().getPrimaryTopic().getCompoundPharmacologyTotalResults(), is(2929));

	}
	
	@Test
	public void testcompoundPharmacologyList() throws ApiException {
	
	 	CompoundApi compoundPharmacologyList = new CompoundApi();    	
	 	compoundPharmacologyList.setApiClient(api);
	 	CompoundPharmacologyList compoundPharmacologyListResponse = compoundPharmacologyList.compoundPharmacologyPagesGet("http://www.conceptwiki.org/concept/38932552-111f-4a4e-a46a-4ed1d7bdf9d5", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "json",null, null);
	 	assertThat(compoundPharmacologyListResponse.getResult().getItems().size(), is(10));
	 	assertThat(compoundPharmacologyListResponse.getResult().getAdditionalProperties().size(), is(0));
	 	assertThat(compoundPharmacologyListResponse.getResult().getLabel(), is("Compound Pharmacology: List"));

	}
	
	
	@Test
	public void testCompoundClassPharmacologyCount() throws ApiException {
	
	 	CompoundApi compoundClassPharmacologyCount = new CompoundApi();    	
	 	compoundClassPharmacologyCount.setApiClient(api);
	 	CompoundClassPharmacologyCount compoundClassPharmacologyCountResponse = compoundClassPharmacologyCount.compoundTreePharmacologyCountGet("http://purl.obolibrary.org/obo/CHEBI_100", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", null, null, null, null,null,null, null,null, null, null, null,null, null, null, null,null, null, null, null,null, null, "json",null, null);
	 	assertThat(compoundClassPharmacologyCountResponse.getResult().getPrimaryTopic().getCompoundPharmacologyTotalResults(), is(18));

	}
	
	@Test
	public void testCompoundClassPharmacologyList() throws ApiException {
	
	 	CompoundApi compoundClassPharmacologyList = new CompoundApi();    	
	 	compoundClassPharmacologyList.setApiClient(api);
	 	CompoundClassPharmacologyList compoundClassPharmacologyCountResponse = compoundClassPharmacologyList.compoundTreePharmacologyPagesGet("http://purl.obolibrary.org/obo/CHEBI_100", "d283dc2c", "5b723e13d2b6d891edae0c2a8e1e85a0", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "json",null, null);
	 	assertThat(compoundClassPharmacologyCountResponse.getResult().getItems().size(), is(10));
	 	assertThat(compoundClassPharmacologyCountResponse.getResult().getItems().get(0).getHasAssay().getHasTarget().getTitle(), is("PANC-1"));

	}
	
}
