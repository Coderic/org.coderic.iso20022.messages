//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:20 PM COT 
//


package org.coderic.iso20022.messages.canm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para KeyExchangeResponseV03 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="KeyExchangeResponseV03"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Header63"/&gt;
 *         &lt;element name="Body" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}KeyExchangeResponse2"/&gt;
 *         &lt;element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}ContentInformationType20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyExchangeResponseV03", propOrder = {
    "hdr",
    "body",
    "sctyTrlr"
})
public class KeyExchangeResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header63 hdr;
    @XmlElement(name = "Body", required = true)
    protected KeyExchangeResponse2 body;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType20 sctyTrlr;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link Header63 }
     *     
     */
    public Header63 getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link Header63 }
     *     
     */
    public void setHdr(Header63 value) {
        this.hdr = value;
    }

    /**
     * Obtiene el valor de la propiedad body.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangeResponse2 }
     *     
     */
    public KeyExchangeResponse2 getBody() {
        return body;
    }

    /**
     * Define el valor de la propiedad body.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangeResponse2 }
     *     
     */
    public void setBody(KeyExchangeResponse2 value) {
        this.body = value;
    }

    /**
     * Obtiene el valor de la propiedad sctyTrlr.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType20 }
     *     
     */
    public ContentInformationType20 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Define el valor de la propiedad sctyTrlr.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType20 }
     *     
     */
    public void setSctyTrlr(ContentInformationType20 value) {
        this.sctyTrlr = value;
    }

}
