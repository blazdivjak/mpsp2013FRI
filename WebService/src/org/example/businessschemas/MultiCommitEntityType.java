
package org.example.businessschemas;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiCommitEntityType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MultiCommitEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commits" type="{http://www.example.org/businessSchemas}FullCommitEntityType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiCommitEntityType", propOrder = {
    "commits"
})
public class MultiCommitEntityType {

    @XmlElement(required = true)
    protected List<FullCommitEntityType> commits;

    /**
     * Gets the value of the commits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullCommitEntityType }
     * 
     * 
     */
    public List<FullCommitEntityType> getCommits() {
        if (commits == null) {
            commits = new ArrayList<FullCommitEntityType>();
        }
        return this.commits;
    }

}
