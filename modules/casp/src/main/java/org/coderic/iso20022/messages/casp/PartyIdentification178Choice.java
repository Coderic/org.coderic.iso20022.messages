//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:26 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyIdentification178Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification178Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AnyBIC" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}AnyBICDec2014Identifier"/&gt;
 *         &lt;element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}GenericIdentification36"/&gt;
 *         &lt;element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}NameAndAddress6"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification178Choice", propOrder = {
    "anyBIC",
    "prtryId",
    "nmAndAdr"
})
public class PartyIdentification178Choice {

    @XmlElement(name = "AnyBIC")
    protected String anyBIC;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification36 prtryId;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress6 nmAndAdr;

    /**
     * Obtiene el valor de la propiedad anyBIC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyBIC() {
        return anyBIC;
    }

    /**
     * Define el valor de la propiedad anyBIC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyBIC(String value) {
        this.anyBIC = value;
    }

    /**
     * Obtiene el valor de la propiedad prtryId.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPrtryId() {
        return prtryId;
    }

    /**
     * Define el valor de la propiedad prtryId.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setPrtryId(GenericIdentification36 value) {
        this.prtryId = value;
    }

    /**
     * Obtiene el valor de la propiedad nmAndAdr.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress6 }
     *     
     */
    public NameAndAddress6 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Define el valor de la propiedad nmAndAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress6 }
     *     
     */
    public void setNmAndAdr(NameAndAddress6 value) {
        this.nmAndAdr = value;
    }

}
