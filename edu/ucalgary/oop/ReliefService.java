package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private LocalDate dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.setDateOfInquiry(dateOfInquiry); 
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry.toString();
    }


    public void setDateOfInquiry(String dateOfInquiry) {
        try {
            
            this.dateOfInquiry = LocalDate.parse(dateOfInquiry);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please provide the date in the format 'YYYY-MM-DD'.");
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date input. Please provide a valid date in the format 'YYYY-MM-DD'.");
        }
    }

    public String getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public String getLogDetails() {
        // Construct log details string
        return String.format("Inquirer: %s, Missing Person: %s, Date of Inquiry: %s, Info Provided: %s, Last Known Location: %s",
                inquirer.getFirstName(), missingPerson.getFirstName(), dateOfInquiry.toString(), infoProvided, lastKnownLocation.getName());
    }
}
