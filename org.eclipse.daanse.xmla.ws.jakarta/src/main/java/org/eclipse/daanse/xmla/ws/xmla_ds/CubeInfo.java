
package org.eclipse.daanse.xmla.ws.xmla_ds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CubeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CubeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cube" type="{urn:schemas-microsoft-com:xml-analysis:mddataset}OlapInfoCube" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CubeInfo", propOrder = {
    "cube"
})
public class CubeInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Cube", required = true)
    protected List<OlapInfoCube> cube;

    /**
     * Gets the value of the cube property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cube property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCube().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OlapInfoCube }
     * 
     * 
     */
    public List<OlapInfoCube> getCube() {
        if (cube == null) {
            cube = new ArrayList<OlapInfoCube>();
        }
        return this.cube;
    }

    public boolean isSetCube() {
        return ((this.cube!= null)&&(!this.cube.isEmpty()));
    }

    public void unsetCube() {
        this.cube = null;
    }

}
