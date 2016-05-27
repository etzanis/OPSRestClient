
package targetClassPharmacologyList.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "_about",
    "title",
    "hasTargetComponent",
    "assay_organism",
    "inDataset",
    "type"
})
public class HasTarget {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("title")
    private String title;
    @JsonProperty("hasTargetComponent")
    private HasTargetComponent hasTargetComponent;
    @JsonProperty("assay_organism")
    private String assayOrganism;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The About
     */
    @JsonProperty("_about")
    public String getAbout() {
        return About;
    }

    /**
     * 
     * @param About
     *     The _about
     */
    @JsonProperty("_about")
    public void setAbout(String About) {
        this.About = About;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The hasTargetComponent
     */
    @JsonProperty("hasTargetComponent")
    public HasTargetComponent getHasTargetComponent() {
        return hasTargetComponent;
    }

    /**
     * 
     * @param hasTargetComponent
     *     The hasTargetComponent
     */
    @JsonProperty("hasTargetComponent")
    public void setHasTargetComponent(HasTargetComponent hasTargetComponent) {
        this.hasTargetComponent = hasTargetComponent;
    }

    /**
     * 
     * @return
     *     The assayOrganism
     */
    @JsonProperty("assay_organism")
    public String getAssayOrganism() {
        return assayOrganism;
    }

    /**
     * 
     * @param assayOrganism
     *     The assay_organism
     */
    @JsonProperty("assay_organism")
    public void setAssayOrganism(String assayOrganism) {
        this.assayOrganism = assayOrganism;
    }

    /**
     * 
     * @return
     *     The inDataset
     */
    @JsonProperty("inDataset")
    public String getInDataset() {
        return inDataset;
    }

    /**
     * 
     * @param inDataset
     *     The inDataset
     */
    @JsonProperty("inDataset")
    public void setInDataset(String inDataset) {
        this.inDataset = inDataset;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
