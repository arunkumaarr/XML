package org.example;

import org.example.jaxb.domain.CorrectableAccountReportType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.Binder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, JAXBException {

        JAXBContext context = JAXBContext.newInstance("org.example.jaxb.domain");

        File file = new File("C:\\Repo\\xml-java-using-jaxb\\04\\demos\\xmlunmarshal\\Initial2_2IW3WK.00000.LE.152.xml");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        //an instance of builder to parse the specified xml file
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

        NodeList domelement = doc.getElementsByTagName("ftc:AccountReport");

        Binder<Node> binder = context.createBinder();

        for (int i=0; i<domelement.getLength();i++) {
            JAXBElement<CorrectableAccountReportType>  jaxbElement = binder.unmarshal(domelement.item(i), CorrectableAccountReportType.class);
            CorrectableAccountReportType accountReport = jaxbElement.getValue();
            System.out.println(accountReport.getAccountNumber().getValue());
            System.out.println(accountReport.getDocSpec().getDocRefId());
        }







//        NodeList nodeList = doc.getElementsByTagName("ftc:AccountReport");
//
//        for (int itr = 0; itr < nodeList.getLength(); itr++)
//        {
//            Node node = nodeList.item(itr);
//            System.out.println("\nNode Name :" + node.getNodeName());
//            if (node.getNodeType() == Node.ELEMENT_NODE)
//            {
//                Element eElement = (Element) node;
//                System.out.println("ftc:DocTypeIndic: "+ eElement.getElementsByTagName("ftc:DocTypeIndic").item(0).getTextContent());
//                System.out.println("ftc:DocRefId: "+ eElement.getElementsByTagName("ftc:DocRefId").item(0).getTextContent());
//                System.out.println("ftc:AccountNumber: "+ eElement.getElementsByTagName("ftc:AccountNumber").item(0).getTextContent());
//                System.out.println("ftc:AccountClosed: "+ eElement.getElementsByTagName("ftc:AccountClosed").item(0).getTextContent());
//                System.out.println("sfa:ResCountryCode: "+ eElement.getElementsByTagName("sfa:ResCountryCode").item(0).getTextContent());
//            }
//        }



        System.out.println("successful read");
    }
}