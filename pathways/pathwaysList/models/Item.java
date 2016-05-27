
package pathwaysList.models;

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
    "identifier",
    "title_en",
    "title",
    "description",
    "inDataset",
    "pathway_organism",
    "page",
    "pathwayOntology"
})
public class Item {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("title_en")
    private String titleEn;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("pathway_organism")
    private PathwayOrganism pathwayOrganism;
    @JsonProperty("page")
    private String page;
    @JsonProperty("pathwayOntology")
    private String pathwayOntology;
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
     *     The identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 
     * @param identifier
     *     The identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * 
     * @return
     *     The titleEn
     */
    @JsonProperty("title_en")
    public String getTitleEn() {
        return titleEn;
    }

    /**
     * 
     * @param titleEn
     *     The title_en
     */
    @JsonProperty("title_en")
    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
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
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
     *     The pathwayOrganism
     */
    @JsonProperty("pathway_organism")
    public PathwayOrganism getPathwayOrganism() {
        return pathwayOrganism;
    }

    /**
     * 
     * @param pathwayOrganism
     *     The pathway_organism
     */
    @JsonProperty("pathway_organism")
    public void setPathwayOrganism(PathwayOrganism pathwayOrganism) {
        this.pathwayOrganism = pathwayOrganism;
    }

    /**
     * 
     * @return
     *     The page
     */
    @JsonProperty("page")
    public String getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    @JsonProperty("page")
    public void setPage(String page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The pathwayOntology
     */
    @JsonProperty("pathwayOntology")
    public String getPathwayOntology() {
        return pathwayOntology;
    }

    /**
     * 
     * @param pathwayOntology
     *     The pathwayOntology
     */
    @JsonProperty("pathwayOntology")
    public void setPathwayOntology(String pathwayOntology) {
        this.pathwayOntology = pathwayOntology;
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
