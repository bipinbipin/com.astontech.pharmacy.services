package com.bipin;


import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.text.html.parser.DocumentParser;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.FillSubset;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.PrescriptionSubset;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import webservices2015.pharmacy.clinical.epic.ArrayOfPrescription;
import webservices2015.pharmacy.clinical.epic.IPharmacyServices2015GetPrescriptionInfoApplicationFaultFaultMessage;
import webservices2015.pharmacy.clinical.epic.IPharmacyServices2015GetPrescriptionInfoInternalFaultFaultMessage;
import webservices2015.pharmacy.clinical.epic.Patient;
import webservices2015.pharmacy.clinical.epic.PrescriptionInfo;

public class nodelistsuccess {

    static String scriptnumber = "3000000";

    public static void main(String[] args) throws JAXBException, IPharmacyServices2015GetPrescriptionInfoApplicationFaultFaultMessage, IPharmacyServices2015GetPrescriptionInfoInternalFaultFaultMessage {
        // TODO Auto-generated method stub
        webservices2015.pharmacy.clinical.epic.IPharmacyServices2015 iPharmacyServices
                = (new webservices2015.pharmacy.clinical.epic.PharmacyServices2015().getIPharmacyServices2015());

        String systemId = null;
        String pharmacyNCPDPId = null;
        String patientMRN = null;
        String prescriptionNumber = scriptnumber;
        String fillId = null;
        PrescriptionSubset whichPrescriptions = PrescriptionSubset.SPECIFIED_PRESCRIPTION_ONLY;
        FillSubset whichFills = FillSubset.FILLS_BACK_TO_MOST_RECENT_DISPENSE;
        PrescriptionInfo prescriptionInfo = iPharmacyServices.getPrescriptionInfo(systemId, pharmacyNCPDPId, patientMRN, prescriptionNumber, fillId, whichPrescriptions, whichFills);
        JAXBElement<Patient> patient = prescriptionInfo.getPatient();
        JAXBElement<ArrayOfPrescription> prescriptions = prescriptionInfo.getPrescriptions();


        StringWriter stringWriter = new StringWriter();

        JAXBContext jaxbContext = JAXBContext.newInstance(Patient.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(patient, stringWriter);
        String result = stringWriter.toString();
        System.out.println(result);

        String xml = result;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;

        try {
            db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xml));

            try {
                Document doc = db.parse(is);
                String message = doc.getDocumentElement().getTextContent();
                System.out.println(message);


            } catch (SAXException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

