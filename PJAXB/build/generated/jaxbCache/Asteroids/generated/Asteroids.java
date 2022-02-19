//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.10 at 08:13:49 PM CET 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Asteroid" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EstimatedMinimumDiameter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EstimatedMaximumDiameter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PotentiallyHazardous" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asteroid"
})
@XmlRootElement(name = "Asteroids")
public class Asteroids {

    @XmlElement(name = "Asteroid")
    protected List<Asteroids.Asteroid> asteroid;

    /**
     * Gets the value of the asteroid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asteroid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsteroid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Asteroids.Asteroid }
     * 
     * 
     */
    public List<Asteroids.Asteroid> getAsteroid() {
        if (asteroid == null) {
            asteroid = new ArrayList<Asteroids.Asteroid>();
        }
        return this.asteroid;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EstimatedMinimumDiameter" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EstimatedMaximumDiameter" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PotentiallyHazardous" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "name",
        "estimatedMinimumDiameter",
        "estimatedMaximumDiameter",
        "potentiallyHazardous"
    })
    public static class Asteroid {

        @XmlElement(name = "Id", required = true)
        protected String id;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "EstimatedMinimumDiameter", required = true)
        protected String estimatedMinimumDiameter;
        @XmlElement(name = "EstimatedMaximumDiameter", required = true)
        protected String estimatedMaximumDiameter;
        @XmlElement(name = "PotentiallyHazardous", required = true)
        protected String potentiallyHazardous;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the estimatedMinimumDiameter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstimatedMinimumDiameter() {
            return estimatedMinimumDiameter;
        }

        /**
         * Sets the value of the estimatedMinimumDiameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedMinimumDiameter(String value) {
            this.estimatedMinimumDiameter = value;
        }

        /**
         * Gets the value of the estimatedMaximumDiameter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstimatedMaximumDiameter() {
            return estimatedMaximumDiameter;
        }

        /**
         * Sets the value of the estimatedMaximumDiameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedMaximumDiameter(String value) {
            this.estimatedMaximumDiameter = value;
        }

        /**
         * Gets the value of the potentiallyHazardous property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPotentiallyHazardous() {
            return potentiallyHazardous;
        }

        /**
         * Sets the value of the potentiallyHazardous property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPotentiallyHazardous(String value) {
            this.potentiallyHazardous = value;
        }

    }

}
