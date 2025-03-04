//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:40 PM COT 
//


package org.coderic.iso20022.messages.caam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuthenticatedData4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuthenticatedData4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="Rcpt" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Recipient4Choice" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MACAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}AlgorithmIdentification15"/&gt;
 *         &lt;element name="NcpsltdCntt" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}EncapsulatedContent3"/&gt;
 *         &lt;element name="MAC" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max140Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticatedData4", propOrder = {
    "vrsn",
    "rcpt",
    "macAlgo",
    "ncpsltdCntt",
    "mac"
})
public class AuthenticatedData4 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "Rcpt", required = true)
    protected List<Recipient4Choice> rcpt;
    @XmlElement(name = "MACAlgo", required = true)
    protected AlgorithmIdentification15 macAlgo;
    @XmlElement(name = "NcpsltdCntt", required = true)
    protected EncapsulatedContent3 ncpsltdCntt;
    @XmlElement(name = "MAC", required = true)
    protected byte[] mac;

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
     * Gets the value of the rcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recipient4Choice }
     * 
     * 
     */
    public List<Recipient4Choice> getRcpt() {
        if (rcpt == null) {
            rcpt = new ArrayList<Recipient4Choice>();
        }
        return this.rcpt;
    }

    /**
     * Obtiene el valor de la propiedad macAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification15 }
     *     
     */
    public AlgorithmIdentification15 getMACAlgo() {
        return macAlgo;
    }

    /**
     * Define el valor de la propiedad macAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification15 }
     *     
     */
    public void setMACAlgo(AlgorithmIdentification15 value) {
        this.macAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad ncpsltdCntt.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public EncapsulatedContent3 getNcpsltdCntt() {
        return ncpsltdCntt;
    }

    /**
     * Define el valor de la propiedad ncpsltdCntt.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public void setNcpsltdCntt(EncapsulatedContent3 value) {
        this.ncpsltdCntt = value;
    }

    /**
     * Obtiene el valor de la propiedad mac.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMAC() {
        return mac;
    }

    /**
     * Define el valor de la propiedad mac.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMAC(byte[] value) {
        this.mac = value;
    }

}
