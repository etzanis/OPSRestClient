
package freeTextConcept.model;

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
    "match",
    "semanticTag",
    "altLabel_la",
    "altLabel_en",
    "altLabel",
    "altLabel_de",
    "altLabel_ru",
    "altLabel_it",
    "altLabel_pt",
    "altLabel_hi",
    "altLabel_fr",
    "altLabel_tr",
    "altLabel_ja",
    "altLabel_he",
    "altLabel_el",
    "altLabel_cs",
    "altLabel_es",
    "altLabel_zh",
    "altLabel_uk",
    "altLabel_eu",
    "exactMatch",
    "prefLabel_de",
    "prefLabel_cs",
    "prefLabel_en",
    "prefLabel",
    "prefLabel_fr"
})
public class Result_ {

    @JsonProperty("_about")
    private String About;
    @JsonProperty("match")
    private String match;
    @JsonProperty("semanticTag")
    private SemanticTag semanticTag;
    @JsonProperty("altLabel_la")
    private String altLabelLa;
    @JsonProperty("altLabel_en")
    private List<String> altLabelEn = new ArrayList<String>();
    @JsonProperty("altLabel")
    private List<String> altLabel = new ArrayList<String>();
    @JsonProperty("altLabel_de")
    private List<String> altLabelDe = new ArrayList<String>();
    @JsonProperty("altLabel_ru")
    private String altLabelRu;
    @JsonProperty("altLabel_it")
    private List<String> altLabelIt = new ArrayList<String>();
    @JsonProperty("altLabel_pt")
    private String altLabelPt;
    @JsonProperty("altLabel_hi")
    private String altLabelHi;
    @JsonProperty("altLabel_fr")
    private List<String> altLabelFr = new ArrayList<String>();
    @JsonProperty("altLabel_tr")
    private String altLabelTr;
    @JsonProperty("altLabel_ja")
    private String altLabelJa;
    @JsonProperty("altLabel_he")
    private String altLabelHe;
    @JsonProperty("altLabel_el")
    private String altLabelEl;
    @JsonProperty("altLabel_cs")
    private List<String> altLabelCs = new ArrayList<String>();
    @JsonProperty("altLabel_es")
    private String altLabelEs;
    @JsonProperty("altLabel_zh")
    private String altLabelZh;
    @JsonProperty("altLabel_uk")
    private String altLabelUk;
    @JsonProperty("altLabel_eu")
    private String altLabelEu;
    @JsonProperty("exactMatch")
    private List<ExactMatch> exactMatch = new ArrayList<ExactMatch>();
    @JsonProperty("prefLabel_de")
    private String prefLabelDe;
    @JsonProperty("prefLabel_cs")
    private String prefLabelCs;
    @JsonProperty("prefLabel_en")
    private String prefLabelEn;
    @JsonProperty("prefLabel")
    private String prefLabel;
    @JsonProperty("prefLabel_fr")
    private String prefLabelFr;
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
     *     The match
     */
    @JsonProperty("match")
    public String getMatch() {
        return match;
    }

    /**
     * 
     * @param match
     *     The match
     */
    @JsonProperty("match")
    public void setMatch(String match) {
        this.match = match;
    }

    /**
     * 
     * @return
     *     The semanticTag
     */
    @JsonProperty("semanticTag")
    public SemanticTag getSemanticTag() {
        return semanticTag;
    }

    /**
     * 
     * @param semanticTag
     *     The semanticTag
     */
    @JsonProperty("semanticTag")
    public void setSemanticTag(SemanticTag semanticTag) {
        this.semanticTag = semanticTag;
    }

    /**
     * 
     * @return
     *     The altLabelLa
     */
    @JsonProperty("altLabel_la")
    public String getAltLabelLa() {
        return altLabelLa;
    }

    /**
     * 
     * @param altLabelLa
     *     The altLabel_la
     */
    @JsonProperty("altLabel_la")
    public void setAltLabelLa(String altLabelLa) {
        this.altLabelLa = altLabelLa;
    }

    /**
     * 
     * @return
     *     The altLabelEn
     */
    @JsonProperty("altLabel_en")
    public List<String> getAltLabelEn() {
        return altLabelEn;
    }

    /**
     * 
     * @param altLabelEn
     *     The altLabel_en
     */
    @JsonProperty("altLabel_en")
    public void setAltLabelEn(List<String> altLabelEn) {
        this.altLabelEn = altLabelEn;
    }

    /**
     * 
     * @return
     *     The altLabel
     */
    @JsonProperty("altLabel")
    public List<String> getAltLabel() {
        return altLabel;
    }

    /**
     * 
     * @param altLabel
     *     The altLabel
     */
    @JsonProperty("altLabel")
    public void setAltLabel(List<String> altLabel) {
        this.altLabel = altLabel;
    }

    /**
     * 
     * @return
     *     The altLabelDe
     */
    @JsonProperty("altLabel_de")
    public List<String> getAltLabelDe() {
        return altLabelDe;
    }

    /**
     * 
     * @param altLabelDe
     *     The altLabel_de
     */
    @JsonProperty("altLabel_de")
    public void setAltLabelDe(List<String> altLabelDe) {
        this.altLabelDe = altLabelDe;
    }

    /**
     * 
     * @return
     *     The altLabelRu
     */
    @JsonProperty("altLabel_ru")
    public String getAltLabelRu() {
        return altLabelRu;
    }

    /**
     * 
     * @param altLabelRu
     *     The altLabel_ru
     */
    @JsonProperty("altLabel_ru")
    public void setAltLabelRu(String altLabelRu) {
        this.altLabelRu = altLabelRu;
    }

    /**
     * 
     * @return
     *     The altLabelIt
     */
    @JsonProperty("altLabel_it")
    public List<String> getAltLabelIt() {
        return altLabelIt;
    }

    /**
     * 
     * @param altLabelIt
     *     The altLabel_it
     */
    @JsonProperty("altLabel_it")
    public void setAltLabelIt(List<String> altLabelIt) {
        this.altLabelIt = altLabelIt;
    }

    /**
     * 
     * @return
     *     The altLabelPt
     */
    @JsonProperty("altLabel_pt")
    public String getAltLabelPt() {
        return altLabelPt;
    }

    /**
     * 
     * @param altLabelPt
     *     The altLabel_pt
     */
    @JsonProperty("altLabel_pt")
    public void setAltLabelPt(String altLabelPt) {
        this.altLabelPt = altLabelPt;
    }

    /**
     * 
     * @return
     *     The altLabelHi
     */
    @JsonProperty("altLabel_hi")
    public String getAltLabelHi() {
        return altLabelHi;
    }

    /**
     * 
     * @param altLabelHi
     *     The altLabel_hi
     */
    @JsonProperty("altLabel_hi")
    public void setAltLabelHi(String altLabelHi) {
        this.altLabelHi = altLabelHi;
    }

    /**
     * 
     * @return
     *     The altLabelFr
     */
    @JsonProperty("altLabel_fr")
    public List<String> getAltLabelFr() {
        return altLabelFr;
    }

    /**
     * 
     * @param altLabelFr
     *     The altLabel_fr
     */
    @JsonProperty("altLabel_fr")
    public void setAltLabelFr(List<String> altLabelFr) {
        this.altLabelFr = altLabelFr;
    }

    /**
     * 
     * @return
     *     The altLabelTr
     */
    @JsonProperty("altLabel_tr")
    public String getAltLabelTr() {
        return altLabelTr;
    }

    /**
     * 
     * @param altLabelTr
     *     The altLabel_tr
     */
    @JsonProperty("altLabel_tr")
    public void setAltLabelTr(String altLabelTr) {
        this.altLabelTr = altLabelTr;
    }

    /**
     * 
     * @return
     *     The altLabelJa
     */
    @JsonProperty("altLabel_ja")
    public String getAltLabelJa() {
        return altLabelJa;
    }

    /**
     * 
     * @param altLabelJa
     *     The altLabel_ja
     */
    @JsonProperty("altLabel_ja")
    public void setAltLabelJa(String altLabelJa) {
        this.altLabelJa = altLabelJa;
    }

    /**
     * 
     * @return
     *     The altLabelHe
     */
    @JsonProperty("altLabel_he")
    public String getAltLabelHe() {
        return altLabelHe;
    }

    /**
     * 
     * @param altLabelHe
     *     The altLabel_he
     */
    @JsonProperty("altLabel_he")
    public void setAltLabelHe(String altLabelHe) {
        this.altLabelHe = altLabelHe;
    }

    /**
     * 
     * @return
     *     The altLabelEl
     */
    @JsonProperty("altLabel_el")
    public String getAltLabelEl() {
        return altLabelEl;
    }

    /**
     * 
     * @param altLabelEl
     *     The altLabel_el
     */
    @JsonProperty("altLabel_el")
    public void setAltLabelEl(String altLabelEl) {
        this.altLabelEl = altLabelEl;
    }

    /**
     * 
     * @return
     *     The altLabelCs
     */
    @JsonProperty("altLabel_cs")
    public List<String> getAltLabelCs() {
        return altLabelCs;
    }

    /**
     * 
     * @param altLabelCs
     *     The altLabel_cs
     */
    @JsonProperty("altLabel_cs")
    public void setAltLabelCs(List<String> altLabelCs) {
        this.altLabelCs = altLabelCs;
    }

    /**
     * 
     * @return
     *     The altLabelEs
     */
    @JsonProperty("altLabel_es")
    public String getAltLabelEs() {
        return altLabelEs;
    }

    /**
     * 
     * @param altLabelEs
     *     The altLabel_es
     */
    @JsonProperty("altLabel_es")
    public void setAltLabelEs(String altLabelEs) {
        this.altLabelEs = altLabelEs;
    }

    /**
     * 
     * @return
     *     The altLabelZh
     */
    @JsonProperty("altLabel_zh")
    public String getAltLabelZh() {
        return altLabelZh;
    }

    /**
     * 
     * @param altLabelZh
     *     The altLabel_zh
     */
    @JsonProperty("altLabel_zh")
    public void setAltLabelZh(String altLabelZh) {
        this.altLabelZh = altLabelZh;
    }

    /**
     * 
     * @return
     *     The altLabelUk
     */
    @JsonProperty("altLabel_uk")
    public String getAltLabelUk() {
        return altLabelUk;
    }

    /**
     * 
     * @param altLabelUk
     *     The altLabel_uk
     */
    @JsonProperty("altLabel_uk")
    public void setAltLabelUk(String altLabelUk) {
        this.altLabelUk = altLabelUk;
    }

    /**
     * 
     * @return
     *     The altLabelEu
     */
    @JsonProperty("altLabel_eu")
    public String getAltLabelEu() {
        return altLabelEu;
    }

    /**
     * 
     * @param altLabelEu
     *     The altLabel_eu
     */
    @JsonProperty("altLabel_eu")
    public void setAltLabelEu(String altLabelEu) {
        this.altLabelEu = altLabelEu;
    }

    /**
     * 
     * @return
     *     The exactMatch
     */
    @JsonProperty("exactMatch")
    public List<ExactMatch> getExactMatch() {
        return exactMatch;
    }

    /**
     * 
     * @param exactMatch
     *     The exactMatch
     */
    @JsonProperty("exactMatch")
    public void setExactMatch(List<ExactMatch> exactMatch) {
        this.exactMatch = exactMatch;
    }

    /**
     * 
     * @return
     *     The prefLabelDe
     */
    @JsonProperty("prefLabel_de")
    public String getPrefLabelDe() {
        return prefLabelDe;
    }

    /**
     * 
     * @param prefLabelDe
     *     The prefLabel_de
     */
    @JsonProperty("prefLabel_de")
    public void setPrefLabelDe(String prefLabelDe) {
        this.prefLabelDe = prefLabelDe;
    }

    /**
     * 
     * @return
     *     The prefLabelCs
     */
    @JsonProperty("prefLabel_cs")
    public String getPrefLabelCs() {
        return prefLabelCs;
    }

    /**
     * 
     * @param prefLabelCs
     *     The prefLabel_cs
     */
    @JsonProperty("prefLabel_cs")
    public void setPrefLabelCs(String prefLabelCs) {
        this.prefLabelCs = prefLabelCs;
    }

    /**
     * 
     * @return
     *     The prefLabelEn
     */
    @JsonProperty("prefLabel_en")
    public String getPrefLabelEn() {
        return prefLabelEn;
    }

    /**
     * 
     * @param prefLabelEn
     *     The prefLabel_en
     */
    @JsonProperty("prefLabel_en")
    public void setPrefLabelEn(String prefLabelEn) {
        this.prefLabelEn = prefLabelEn;
    }

    /**
     * 
     * @return
     *     The prefLabel
     */
    @JsonProperty("prefLabel")
    public String getPrefLabel() {
        return prefLabel;
    }

    /**
     * 
     * @param prefLabel
     *     The prefLabel
     */
    @JsonProperty("prefLabel")
    public void setPrefLabel(String prefLabel) {
        this.prefLabel = prefLabel;
    }

    /**
     * 
     * @return
     *     The prefLabelFr
     */
    @JsonProperty("prefLabel_fr")
    public String getPrefLabelFr() {
        return prefLabelFr;
    }

    /**
     * 
     * @param prefLabelFr
     *     The prefLabel_fr
     */
    @JsonProperty("prefLabel_fr")
    public void setPrefLabelFr(String prefLabelFr) {
        this.prefLabelFr = prefLabelFr;
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
