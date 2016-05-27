
package pathwaysInformation.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "title_en",
    "title",
    "description",
    "hasPart",
    "inDataset",
    "organism",
    "pathwayOntology",
    "page"
})
public class LatestVersion {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("title_en")
    private String titleEn;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("hasPart")
    private List<HasPart> hasPart = new ArrayList<HasPart>();
    @JsonProperty("inDataset")
    private String inDataset;
    @JsonProperty("organism")
    private Organism organism;
    @JsonProperty("pathwayOntology")
    private List<String> pathwayOntology = new ArrayList<String>();
    @JsonProperty("page")
    private String page;
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
     *     The hasPart
     */
    @JsonProperty("hasPart")
    public List<HasPart> getHasPart() {
        return hasPart;
    }

    /**
     * 
     * @param hasPart
     *     The hasPart
     */
    @JsonProperty("hasPart")
    public void setHasPart(List<HasPart> hasPart) {
        this.hasPart = hasPart;
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
     *     The organism
     */
    @JsonProperty("organism")
    public Organism getOrganism() {
        return organism;
    }

    /**
     * 
     * @param organism
     *     The organism
     */
    @JsonProperty("organism")
    public void setOrganism(Organism organism) {
        this.organism = organism;
    }

    /**
     * 
     * @return
     *     The pathwayOntology
     */
    @JsonProperty("pathwayOntology")
    public List<String> getPathwayOntology() {
        return pathwayOntology;
    }

    /**
     * 
     * @param pathwayOntology
     *     The pathwayOntology
     */
    @JsonProperty("pathwayOntology")
    public void setPathwayOntology(List<String> pathwayOntology) {
        this.pathwayOntology = pathwayOntology;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
