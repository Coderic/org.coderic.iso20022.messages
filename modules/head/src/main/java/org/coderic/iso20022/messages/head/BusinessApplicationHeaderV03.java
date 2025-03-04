//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:55 PM COT 
//


package org.coderic.iso20022.messages.head;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BusinessApplicationHeaderV03 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessApplicationHeaderV03"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CharSet" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}UnicodeChartsCode" minOccurs="0"/&gt;
 *         &lt;element name="Fr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Party44Choice"/&gt;
 *         &lt;element name="To" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Party44Choice"/&gt;
 *         &lt;element name="BizMsgIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Max35Text"/&gt;
 *         &lt;element name="MsgDefIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Max35Text"/&gt;
 *         &lt;element name="BizSvc" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="MktPrctc" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}ImplementationSpecification1" minOccurs="0"/&gt;
 *         &lt;element name="CreDt" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}ISODateTime"/&gt;
 *         &lt;element name="BizPrcgDt" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="CpyDplct" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}CopyDuplicate1Code" minOccurs="0"/&gt;
 *         &lt;element name="PssblDplct" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}YesNoIndicator" minOccurs="0"/&gt;
 *         &lt;element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}BusinessMessagePriorityCode" minOccurs="0"/&gt;
 *         &lt;element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}SignatureEnvelope" minOccurs="0"/&gt;
 *         &lt;element name="Rltd" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}BusinessApplicationHeader7" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessApplicationHeaderV03", propOrder = {
    "charSet",
    "fr",
    "to",
    "bizMsgIdr",
    "msgDefIdr",
    "bizSvc",
    "mktPrctc",
    "creDt",
    "bizPrcgDt",
    "cpyDplct",
    "pssblDplct",
    "prty",
    "sgntr",
    "rltd"
})
public class BusinessApplicationHeaderV03 {

    @XmlElement(name = "CharSet")
    protected String charSet;
    @XmlElement(name = "Fr", required = true)
    protected Party44Choice fr;
    @XmlElement(name = "To", required = true)
    protected Party44Choice to;
    @XmlElement(name = "BizMsgIdr", required = true)
    protected String bizMsgIdr;
    @XmlElement(name = "MsgDefIdr", required = true)
    protected String msgDefIdr;
    @XmlElement(name = "BizSvc")
    protected String bizSvc;
    @XmlElement(name = "MktPrctc")
    protected ImplementationSpecification1 mktPrctc;
    @XmlElement(name = "CreDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDt;
    @XmlElement(name = "BizPrcgDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bizPrcgDt;
    @XmlElement(name = "CpyDplct")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplct;
    @XmlElement(name = "PssblDplct")
    protected Boolean pssblDplct;
    @XmlElement(name = "Prty")
    protected String prty;
    @XmlElement(name = "Sgntr")
    protected SignatureEnvelope sgntr;
    @XmlElement(name = "Rltd")
    protected List<BusinessApplicationHeader7> rltd;

    /**
     * Obtiene el valor de la propiedad charSet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * Define el valor de la propiedad charSet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharSet(String value) {
        this.charSet = value;
    }

    /**
     * Obtiene el valor de la propiedad fr.
     * 
     * @return
     *     possible object is
     *     {@link Party44Choice }
     *     
     */
    public Party44Choice getFr() {
        return fr;
    }

    /**
     * Define el valor de la propiedad fr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party44Choice }
     *     
     */
    public void setFr(Party44Choice value) {
        this.fr = value;
    }

    /**
     * Obtiene el valor de la propiedad to.
     * 
     * @return
     *     possible object is
     *     {@link Party44Choice }
     *     
     */
    public Party44Choice getTo() {
        return to;
    }

    /**
     * Define el valor de la propiedad to.
     * 
     * @param value
     *     allowed object is
     *     {@link Party44Choice }
     *     
     */
    public void setTo(Party44Choice value) {
        this.to = value;
    }

    /**
     * Obtiene el valor de la propiedad bizMsgIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizMsgIdr() {
        return bizMsgIdr;
    }

    /**
     * Define el valor de la propiedad bizMsgIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizMsgIdr(String value) {
        this.bizMsgIdr = value;
    }

    /**
     * Obtiene el valor de la propiedad msgDefIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDefIdr() {
        return msgDefIdr;
    }

    /**
     * Define el valor de la propiedad msgDefIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDefIdr(String value) {
        this.msgDefIdr = value;
    }

    /**
     * Obtiene el valor de la propiedad bizSvc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizSvc() {
        return bizSvc;
    }

    /**
     * Define el valor de la propiedad bizSvc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizSvc(String value) {
        this.bizSvc = value;
    }

    /**
     * Obtiene el valor de la propiedad mktPrctc.
     * 
     * @return
     *     possible object is
     *     {@link ImplementationSpecification1 }
     *     
     */
    public ImplementationSpecification1 getMktPrctc() {
        return mktPrctc;
    }

    /**
     * Define el valor de la propiedad mktPrctc.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplementationSpecification1 }
     *     
     */
    public void setMktPrctc(ImplementationSpecification1 value) {
        this.mktPrctc = value;
    }

    /**
     * Obtiene el valor de la propiedad creDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDt() {
        return creDt;
    }

    /**
     * Define el valor de la propiedad creDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDt(XMLGregorianCalendar value) {
        this.creDt = value;
    }

    /**
     * Obtiene el valor de la propiedad bizPrcgDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizPrcgDt() {
        return bizPrcgDt;
    }

    /**
     * Define el valor de la propiedad bizPrcgDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizPrcgDt(XMLGregorianCalendar value) {
        this.bizPrcgDt = value;
    }

    /**
     * Obtiene el valor de la propiedad cpyDplct.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyDplct() {
        return cpyDplct;
    }

    /**
     * Define el valor de la propiedad cpyDplct.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public void setCpyDplct(CopyDuplicate1Code value) {
        this.cpyDplct = value;
    }

    /**
     * Obtiene el valor de la propiedad pssblDplct.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPssblDplct() {
        return pssblDplct;
    }

    /**
     * Define el valor de la propiedad pssblDplct.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPssblDplct(Boolean value) {
        this.pssblDplct = value;
    }

    /**
     * Obtiene el valor de la propiedad prty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrty() {
        return prty;
    }

    /**
     * Define el valor de la propiedad prty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrty(String value) {
        this.prty = value;
    }

    /**
     * Obtiene el valor de la propiedad sgntr.
     * 
     * @return
     *     possible object is
     *     {@link SignatureEnvelope }
     *     
     */
    public SignatureEnvelope getSgntr() {
        return sgntr;
    }

    /**
     * Define el valor de la propiedad sgntr.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureEnvelope }
     *     
     */
    public void setSgntr(SignatureEnvelope value) {
        this.sgntr = value;
    }

    /**
     * Gets the value of the rltd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rltd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessApplicationHeader7 }
     * 
     * 
     */
    public List<BusinessApplicationHeader7> getRltd() {
        if (rltd == null) {
            rltd = new ArrayList<BusinessApplicationHeader7>();
        }
        return this.rltd;
    }

}
