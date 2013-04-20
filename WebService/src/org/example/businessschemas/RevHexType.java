
package org.example.businessschemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevHexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevHexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smallHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bigHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevHexType", propOrder = {
    "smallHash",
    "bigHash"
})
public class RevHexType {

    @XmlElement(required = true)
    protected String smallHash;
    @XmlElement(required = true)
    protected String bigHash;

    /**
     * Gets the value of the smallHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallHash() {
        return smallHash;
    }

    /**
     * Sets the value of the smallHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallHash(String value) {
        this.smallHash = value;
    }

    /**
     * Gets the value of the bigHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBigHash() {
        return bigHash;
    }

    /**
     * Sets the value of the bigHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBigHash(String value) {
        this.bigHash = value;
    }

}
