//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:50 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para KEK5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="KEK5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="KEKId" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}KEKIdentifier2"/&gt;
 *         &lt;element name="KeyNcrptnAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AlgorithmIdentification23"/&gt;
 *         &lt;element name="NcrptdKey" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max500Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KEK5", propOrder = {
    "vrsn",
    "kekId",
    "keyNcrptnAlgo",
    "ncrptdKey"
})
public class KEK5 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "KEKId", required = true)
    protected KEKIdentifier2 kekId;
    @XmlElement(name = "KeyNcrptnAlgo", required = true)
    protected AlgorithmIdentification23 keyNcrptnAlgo;
    @XmlElement(name = "NcrptdKey", required = true)
    protected byte[] ncrptdKey;

    /**
     * Obtiene el valor de la propiedad vrsn.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Define el valor de la propiedad vrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrsn(BigDecimal value) {
        this.vrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad kekId.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public KEKIdentifier2 getKEKId() {
        return kekId;
    }

    /**
     * Define el valor de la propiedad kekId.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public void setKEKId(KEKIdentifier2 value) {
        this.kekId = value;
    }

    /**
     * Obtiene el valor de la propiedad keyNcrptnAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification23 }
     *     
     */
    public AlgorithmIdentification23 getKeyNcrptnAlgo() {
        return keyNcrptnAlgo;
    }

    /**
     * Define el valor de la propiedad keyNcrptnAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification23 }
     *     
     */
    public void setKeyNcrptnAlgo(AlgorithmIdentification23 value) {
        this.keyNcrptnAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad ncrptdKey.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNcrptdKey() {
        return ncrptdKey;
    }

    /**
     * Define el valor de la propiedad ncrptdKey.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNcrptdKey(byte[] value) {
        this.ncrptdKey = value;
    }

}
