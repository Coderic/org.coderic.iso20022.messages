//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:30 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CountrySubdivision1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CountrySubdivision1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max35Text"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}GenericIdentification1"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountrySubdivision1Choice", propOrder = {
    "cd",
    "prtry"
})
public class CountrySubdivision1Choice {

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification1 prtry;

    /**
     * Obtiene el valor de la propiedad cd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Define el valor de la propiedad cd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Obtiene el valor de la propiedad prtry.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtry() {
        return prtry;
    }

    /**
     * Define el valor de la propiedad prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setPrtry(GenericIdentification1 value) {
        this.prtry = value;
    }

}
