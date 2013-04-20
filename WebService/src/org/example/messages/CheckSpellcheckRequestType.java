
package org.example.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.example.businessschemas.MultiCommitEntityType;


/**
 * <p>Java class for CheckSpellcheckRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CheckSpellcheckRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commits" type="{http://www.example.org/businessSchemas}MultiCommitEntityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckSpellcheckRequestType", propOrder = {
    "commits"
})
public class CheckSpellcheckRequestType {

    @XmlElement(required = true)
    protected MultiCommitEntityType commits;

    /**
     * Gets the value of the commits property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCommitEntityType }
     *     
     */
    public MultiCommitEntityType getCommits() {
        return commits;
    }

    /**
     * Sets the value of the commits property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCommitEntityType }
     *     
     */
    public void setCommits(MultiCommitEntityType value) {
        this.commits = value;
    }

}
