//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:22 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrdrBookRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderBookReportV01"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrBookRpt"
})
public class Document {

    @XmlElement(name = "OrdrBookRpt", required = true)
    protected OrderBookReportV01 ordrBookRpt;

    /**
     * Obtiene el valor de la propiedad ordrBookRpt.
     * 
     * @return
     *     possible object is
     *     {@link OrderBookReportV01 }
     *     
     */
    public OrderBookReportV01 getOrdrBookRpt() {
        return ordrBookRpt;
    }

    /**
     * Define el valor de la propiedad ordrBookRpt.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBookReportV01 }
     *     
     */
    public void setOrdrBookRpt(OrderBookReportV01 value) {
        this.ordrBookRpt = value;
    }

}
