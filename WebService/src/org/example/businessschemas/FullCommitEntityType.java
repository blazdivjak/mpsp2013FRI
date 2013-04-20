
package org.example.businessschemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullCommitEntityType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FullCommitEntityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/businessSchemas}CommitEntityType">
 *       &lt;sequence>
 *         &lt;element name="parent2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullCommitEntityType", propOrder = {
    "parent2"
})
public class FullCommitEntityType
    extends CommitEntityType
{

    protected String parent2;

    /**
     * Gets the value of the parent2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent2() {
        return parent2;
    }

    /**
     * Sets the value of the parent2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent2(String value) {
        this.parent2 = value;
    }

}
