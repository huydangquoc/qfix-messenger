//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.09 at 10:48:24 AM ICT 
//


package com.jramoyo.fix.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="field" type="{http://xml.fix.jramoyo.com}fieldType"/>
 *         &lt;element name="groups" type="{http://xml.fix.jramoyo.com}groupsType"/>
 *         &lt;element name="component" type="{http://xml.fix.jramoyo.com}componentType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bodyType", propOrder = {
    "fieldOrGroupsOrComponent"
})
public class BodyType {

    @XmlElements({
        @XmlElement(name = "field", type = FieldType.class),
        @XmlElement(name = "groups", type = GroupsType.class),
        @XmlElement(name = "component", type = ComponentType.class)
    })
    protected List<Object> fieldOrGroupsOrComponent;

    /**
     * Gets the value of the fieldOrGroupsOrComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldOrGroupsOrComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldOrGroupsOrComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldType }
     * {@link GroupsType }
     * {@link ComponentType }
     * 
     * 
     */
    public List<Object> getFieldOrGroupsOrComponent() {
        if (fieldOrGroupsOrComponent == null) {
            fieldOrGroupsOrComponent = new ArrayList<Object>();
        }
        return this.fieldOrGroupsOrComponent;
    }

}
