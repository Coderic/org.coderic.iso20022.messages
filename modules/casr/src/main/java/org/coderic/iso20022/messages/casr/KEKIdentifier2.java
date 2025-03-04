//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:34 PM COT 
//


package org.coderic.iso20022.messages.casr;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para KEKIdentifier2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="KEKIdentifier2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyId" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Max140Text"/&gt;
 *         &lt;element name="KeyVrsn" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Max140Text"/&gt;
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="DerivtnId" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Min5Max16Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KEKIdentifier2", propOrder = {
    "keyId",
    "keyVrsn",
    "seqNb",
    "derivtnId"
})
public class KEKIdentifier2 {

    @XmlElement(name = "KeyId", required = true)
    protected String keyId;
    @XmlElement(name = "KeyVrsn", required = true)
    protected String keyVrsn;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "DerivtnId")
    protected byte[] derivtnId;

    /**
     * Obtiene el valor de la propiedad keyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Define el valor de la propiedad keyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyId(String value) {
        this.keyId = value;
    }

    /**
     * Obtiene el valor de la propiedad keyVrsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyVrsn() {
        return keyVrsn;
    }

    /**
     * Define el valor de la propiedad keyVrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyVrsn(String value) {
        this.keyVrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad seqNb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Define el valor de la propiedad seqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad derivtnId.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDerivtnId() {
        return derivtnId;
    }

    /**
     * Define el valor de la propiedad derivtnId.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDerivtnId(byte[] value) {
        this.derivtnId = value;
    }

}
