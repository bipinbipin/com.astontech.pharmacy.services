package com.bipin;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.FillSubset;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.PrescriptionSubset;

import webservices2015.pharmacy.clinical.epic.ArrayOfPrescription;
import webservices2015.pharmacy.clinical.epic.IPharmacyServices2015GetPrescriptionInfoApplicationFaultFaultMessage;
import webservices2015.pharmacy.clinical.epic.IPharmacyServices2015GetPrescriptionInfoInternalFaultFaultMessage;
import webservices2015.pharmacy.clinical.epic.Patient;
import webservices2015.pharmacy.clinical.epic.PrescriptionInfo;

public class patientInfo {


    String patientData;

    public String getPatientData() {
        return patientData;
    }

    public void setPatientData(String patientData) {
        this.patientData = patientData;
    }

    public patientInfo(String systemId,
                       String pharmacyNCPDPId,
                       String patientMRN,
                       String prescriptionNumber,
                       String fillId) {
		// TODO Auto-generated method stub
		webservices2015.pharmacy.clinical.epic.IPharmacyServices2015 iPharmacyServices	= (new webservices2015.pharmacy.clinical.epic.PharmacyServices2015().getIPharmacyServices2015());
		
//		systemId = null;
//		pharmacyNCPDPId = null;
//		patientMRN = null;
//		this.prescriptionNumber = "3000000";
//		String fillId = null;
		PrescriptionSubset whichPrescriptions = PrescriptionSubset.SPECIFIED_PRESCRIPTION_ONLY;
		FillSubset whichFills = FillSubset.FILLS_BACK_TO_MOST_RECENT_DISPENSE;
		try {
			PrescriptionInfo prescriptionInfo = iPharmacyServices.getPrescriptionInfo(systemId, pharmacyNCPDPId, patientMRN, prescriptionNumber, fillId, whichPrescriptions, whichFills);
			JAXBElement<Patient> patient = prescriptionInfo.getPatient();
			JAXBElement<ArrayOfPrescription> prescriptions = prescriptionInfo.getPrescriptions();
			
			StringWriter writer = new StringWriter();
			
			try {
				
				JAXBContext context = JAXBContext.newInstance(PrescriptionInfo.class);
				
				context.createMarshaller().marshal(patient, writer);
				context.createMarshaller().marshal(prescriptions, writer);
				
				System.out.println( writer.toString() );
				
				// sets the class variable "patientData" to the
                this.patientData = writer.toString();


			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (IPharmacyServices2015GetPrescriptionInfoApplicationFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IPharmacyServices2015GetPrescriptionInfoInternalFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
