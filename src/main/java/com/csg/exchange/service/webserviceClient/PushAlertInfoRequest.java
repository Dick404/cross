
package com.csg.exchange.service.webserviceClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://spring.io/guides/gs-producing-web-service}alertInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name"
})
@XmlRootElement(name = "pushAlertInfoRequest", namespace = "http://spring.io/guides/gs-producing-web-service")
public class PushAlertInfoRequest {

    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected AlertInfo name;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AlertInfo }
     *     
     */
    public AlertInfo getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AlertInfo }
     *     
     */
    public void setName(AlertInfo value) {
        this.name = value;
    }

}
