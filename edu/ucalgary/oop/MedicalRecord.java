package edu.ucalgary.oop;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private LocalDate dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.setDateOfTreatment(dateOfTreatment);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment.toString();
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        try {
            this.dateOfTreatment = LocalDate.parse(dateOfTreatment);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please provide the date in the format 'YYYY-MM-DD'.");
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date input. Please provide a valid date in the format 'YYYY-MM-DD'.");
        }
    }
}
