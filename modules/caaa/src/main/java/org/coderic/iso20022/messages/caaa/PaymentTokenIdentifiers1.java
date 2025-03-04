//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:27 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentTokenIdentifiers1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentTokenIdentifiers1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrvdrId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text"/&gt;
 *         &lt;element name="RqstrId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTokenIdentifiers1", propOrder = {
    "prvdrId",
    "rqstrId"
})
public class PaymentTokenIdentifiers1 {

    @XmlElement(name = "PrvdrId", required = true)
    protected String prvdrId;
    @XmlElement(name = "RqstrId", required = true)
    protected String rqstrId;

    /**
     * Obtiene el valor de la propiedad prvdrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrId() {
        return prvdrId;
    }

    /**
     * Define el valor de la propiedad prvdrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvdrId(String value) {
        this.prvdrId = value;
    }

    /**
     * Obtiene el valor de la propiedad rqstrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstrId() {
        return rqstrId;
    }

    /**
     * Define el valor de la propiedad rqstrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqstrId(String value) {
        this.rqstrId = value;
    }

}
