//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 05:14:09 PM CDT 
//


package hortonworks.hdp.refapp.trucking.simulator.impl.domain.transport.route.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hortonworks.streaming.impl.domain.transport.route.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Kml_QNAME = new QName("http://www.opengis.net/kml/2.2", "kml");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hortonworks.streaming.impl.domain.transport.route.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Style }
     * 
     */
    public Style createStyle() {
        return new Style();
    }

    /**
     * Create an instance of {@link Placemark }
     * 
     */
    public Placemark createPlacemark() {
        return new Placemark();
    }

    /**
     * Create an instance of {@link Iconstyle }
     * 
     */
    public Iconstyle createIconstyle() {
        return new Iconstyle();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Icon }
     * 
     */
    public Icon createIcon() {
        return new Icon();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link Kml }
     * 
     */
    public Kml createKml() {
        return new Kml();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/kml/2.2", name = "kml")
    public JAXBElement<Kml> createKml(Kml value) {
        return new JAXBElement<Kml>(_Kml_QNAME, Kml.class, null, value);
    }

}
