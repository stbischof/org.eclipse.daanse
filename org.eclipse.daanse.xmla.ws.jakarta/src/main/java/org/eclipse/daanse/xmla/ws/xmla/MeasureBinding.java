
package org.eclipse.daanse.xmla.ws.xmla;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasureBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureBinding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:schemas-microsoft-com:xml-analysis}Binding"&gt;
 *       &lt;all&gt;
 *         &lt;element name="MeasureID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureBinding", propOrder = {
    "measureID"
})
public class MeasureBinding
    extends Binding
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MeasureID", required = true)
    protected String measureID;

    /**
     * Gets the value of the measureID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureID() {
        return measureID;
    }

    /**
     * Sets the value of the measureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureID(String value) {
        this.measureID = value;
    }

    public boolean isSetMeasureID() {
        return (this.measureID!= null);
    }

}
