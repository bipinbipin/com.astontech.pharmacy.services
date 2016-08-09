package com.bipin;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/**
 * Created by Bipin on 8/8/2016.
 */
public class patientInfoTest {

    public static void main(String[] args) {

        // creates instance of this patientInfo class,
        //   and pass in systemId, pharmacyNCPDPId, patientMRN, prescriptionNumber, fillId
        patientInfo pI = new patientInfo(null, null, null, "30000000", null);

        // String PatientData holds result of web Service call.
        pI.getPatientData();




        patientInfo pI2 = new patientInfo(null, null, null, "30000001", null);

        // String PatientData holds result of web Service call.
        pI2.getPatientData();


        readXML(".\\com\\bipin\\perscriptionInfo.xml");
    }


    public static void readXML(String fileName) {

        try {
            File inputFile = new File(fileName);
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :"
                    + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("patient");
            for(int i = 0; i < nList.getLength(); ++i) {
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("systemId: " + eElement
                                                    .getElementsByTagName("systemId")
                                                    .item(0)
                                                    .getTextContent());

                    System.out.println("PrescriptionNumber: " + eElement
                            .getElementsByTagName("prescriptionNumber")
                            .item(0)
                            .getTextContent());

                }
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
