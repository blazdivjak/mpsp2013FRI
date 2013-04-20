
package org.example.businessschemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RevType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="revNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="revHex" type="{http://www.example.org/businessSchemas}RevHexType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevType", propOrder = {
    "revNumber",
    "revHex"
})
public class RevType {

    protected int revNumber;
    @XmlElement(required = true)
    protected RevHexType revHex;

    /**
     * Gets the value of the revNumber property.
     * 
     */
    public int getRevNumber() {
        return revNumber;
    }

    /**
     * Sets the value of the revNumber property.
     * 
     */
    public void setRevNumber(int value) {
        this.revNumber = value;
    }

    /**
     * Gets the value of the revHex property.
     * 
     * @return
     *     possible object is
     *     {@link RevHexType }
     *     
     */
    public RevHexType getRevHex() {
        return revHex;
    }

    /**
     * Sets the value of the revHex property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevHexType }
     *     
     */
    public void setRevHex(RevHexType value) {
        this.revHex = value;
    }

}
