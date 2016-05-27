package compoundClassifications.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

public class SingleMatch {

	private  String _about;
	private  String inDataSet;
    private  String prefLabel;
    private List<SingleReport> reportedAdverseEvent;

    public void set_about(String _about) {
		this._about = _about;
	}

	public void setInDataSet(String inDataSet) {
		this.inDataSet = inDataSet;
	}

	public void setPrefLabel(String prefLabel) {
		this.prefLabel = prefLabel;
	}

	public void setReportedAdverseEvent(List<SingleReport> reportedAdverseEvent) {
		this.reportedAdverseEvent = reportedAdverseEvent;
	}

	public String  get_about() {
		return this._about;
	}

	public String  getInDataSet() {
		return this.inDataSet;
	}
	
	public String  getPrefLabel() {
		return this.prefLabel;
	}
	
	public List<SingleReport>  getreportedAdverseEvent() {
		return this.reportedAdverseEvent;
	}


}
