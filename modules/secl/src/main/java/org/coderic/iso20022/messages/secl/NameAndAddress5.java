//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:13 PM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NameAndAddress5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NameAndAddress5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max350Text"/&gt;
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PostalAddress1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndAddress5", propOrder = {
    "nm",
    "adr"
})
public class NameAndAddress5 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "Adr")
    protected PostalAddress1 adr;

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtiene el valor de la propiedad adr.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getAdr() {
        return adr;
    }

    /**
     * Define el valor de la propiedad adr.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public void setAdr(PostalAddress1 value) {
        this.adr = value;
    }

}
