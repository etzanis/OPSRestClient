
package pathwaysInformationGetCompounds.model;

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
    "hasPart",
    "inDataset"
})
public class LatestVersion {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("title_en")
    private String titleEn;
    @JsonProperty("title")
    private String title;
    @JsonProperty("hasPart")
    private List<String> hasPart = new ArrayList<String>();
    @JsonProperty("inDataset")
    private String inDataset;
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
     *     The hasPart
     */
    @JsonProperty("hasPart")
    public List<String> getHasPart() {
        return hasPart;
    }

    /**
     * 
     * @param hasPart
     *     The hasPart
     */
    @JsonProperty("hasPart")
    public void setHasPart(List<String> hasPart) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
