
package com.csg.exchange.service.webserviceClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>alertInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="alertInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmCate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="closeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scene" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mainData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertInfo", namespace = "http://spring.io/guides/gs-producing-web-service", propOrder = {
    "areaCode",
    "id",
    "originalID",
    "ipAddress",
    "alarmID",
    "alarmCate",
    "alarmType",
    "alarmLevel",
    "alarmContent",
    "alarmStatus",
    "firstTime",
    "endTime",
    "alarmCount",
    "closeTime",
    "orderID",
    "className",
    "scene",
    "time",
    "mainData",
    "sendto",
    "subject",
    "platform",
    "host"
})
public class AlertInfo {

    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String areaCode;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String id;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String originalID;
    @XmlElement(name = "iPAddress", namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String ipAddress;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String alarmID;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String alarmCate;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String alarmType;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String alarmLevel;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String alarmContent;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String alarmStatus;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String firstTime;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String endTime;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String alarmCount;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String closeTime;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String orderID;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String className;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String scene;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String time;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String mainData;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String sendto;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String subject;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String platform;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String host;

    /**
     * 获取areaCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置areaCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取originalID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalID() {
        return originalID;
    }

    /**
     * 设置originalID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalID(String value) {
        this.originalID = value;
    }

    /**
     * 获取ipAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * 设置ipAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * 获取alarmID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmID() {
        return alarmID;
    }

    /**
     * 设置alarmID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmID(String value) {
        this.alarmID = value;
    }

    /**
     * 获取alarmCate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmCate() {
        return alarmCate;
    }

    /**
     * 设置alarmCate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmCate(String value) {
        this.alarmCate = value;
    }

    /**
     * 获取alarmType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * 设置alarmType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmType(String value) {
        this.alarmType = value;
    }

    /**
     * 获取alarmLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    /**
     * 设置alarmLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmLevel(String value) {
        this.alarmLevel = value;
    }

    /**
     * 获取alarmContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmContent() {
        return alarmContent;
    }

    /**
     * 设置alarmContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmContent(String value) {
        this.alarmContent = value;
    }

    /**
     * 获取alarmStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * 设置alarmStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmStatus(String value) {
        this.alarmStatus = value;
    }

    /**
     * 获取firstTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstTime() {
        return firstTime;
    }

    /**
     * 设置firstTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstTime(String value) {
        this.firstTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * 获取alarmCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmCount() {
        return alarmCount;
    }

    /**
     * 设置alarmCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmCount(String value) {
        this.alarmCount = value;
    }

    /**
     * 获取closeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * 设置closeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseTime(String value) {
        this.closeTime = value;
    }

    /**
     * 获取orderID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * 设置orderID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * 获取className属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置className属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * 获取scene属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScene() {
        return scene;
    }

    /**
     * 设置scene属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScene(String value) {
        this.scene = value;
    }

    /**
     * 获取time属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置time属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * 获取mainData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainData() {
        return mainData;
    }

    /**
     * 设置mainData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainData(String value) {
        this.mainData = value;
    }

    /**
     * 获取sendto属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendto() {
        return sendto;
    }

    /**
     * 设置sendto属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendto(String value) {
        this.sendto = value;
    }

    /**
     * 获取subject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置subject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * 获取platform属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 设置platform属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * 获取host属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * 设置host属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    @Override
    public String toString() {
        return "AlertInfo{" +
                "areaCode='" + areaCode + '\'' +
                ", id='" + id + '\'' +
                ", originalID='" + originalID + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", alarmID='" + alarmID + '\'' +
                ", alarmCate='" + alarmCate + '\'' +
                ", alarmType='" + alarmType + '\'' +
                ", alarmLevel='" + alarmLevel + '\'' +
                ", alarmContent='" + alarmContent + '\'' +
                ", alarmStatus='" + alarmStatus + '\'' +
                ", firstTime='" + firstTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", alarmCount='" + alarmCount + '\'' +
                ", closeTime='" + closeTime + '\'' +
                ", orderID='" + orderID + '\'' +
                ", className='" + className + '\'' +
                ", scene='" + scene + '\'' +
                ", time='" + time + '\'' +
                ", mainData='" + mainData + '\'' +
                ", sendto='" + sendto + '\'' +
                ", subject='" + subject + '\'' +
                ", platform='" + platform + '\'' +
                ", host='" + host + '\'' +
                '}';
    }
}
