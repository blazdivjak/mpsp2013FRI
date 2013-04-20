
package org.example.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.example.businessschemas.CommitFaultType;


/**
 * <p>Java class for CheckSpellcheckFaultType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CheckSpellcheckFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fault" type="{http://www.example.org/businessSchemas}CommitFaultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckSpellcheckFaultType", propOrder = {
    "fault"
})
public class CheckSpellcheckFaultType {

    @XmlElement(required = true)
    protected CommitFaultType fault;

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link CommitFaultType }
     *     
     */
    public CommitFaultType getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitFaultType }
     *     
     */
    public void setFault(CommitFaultType value) {
        this.fault = value;
    }

}
