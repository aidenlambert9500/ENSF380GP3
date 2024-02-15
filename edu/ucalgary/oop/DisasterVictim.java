package edu.ucalgary.oop;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private int counter;

    // all getter functions
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getComments() {
        return this.comments;
    }

    public int getAssignedSocialID() {
        return this.ASSIGNED_SOCIAL_ID;
    }

    public MedicalRecord[] getMedicalRecords() {
        return this.medicalRecords;
    }

    public FamilyRelation[] getFamilyConnections() {
        return this.familyConnections;
    }

    public String getEntryDate() {
        return this.ENTRY_DATE;
    }

    public Supply[] getPersonalBelongings() {
        return this.personalBelongings;
    }

    public String getGender() {
        return this.gender;
    }

    // default constructor
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        medicalRecords = new MedicalRecord[];
        familyConnections = new FamilyRelation[];
        personalBelongings = new Supply[];
        try {
            LocalDate entryDate = null;
            try {
                entryDate = LocalDate.parse(ENTRY_DATE, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } catch (DateTimeParseException e1) {
                entryDate = LocalDate.parse(ENTRY_DATE, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
            LocalDate currentDate = LocalDate.now();
            if (entryDate.isAfter(currentDate)) {
                throw new IllegalArgumentException("Date of birth cannot be in the future.");
            }
            this.ENTRY_DATE = ENTRY_DATE;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please use either yyyy-MM-dd or dd/MM/yyyy.");
        }

    }

    public void setFirstName(String firstName) throws IllegalArgumentException {
        this.firstName = firstName;
        return;
    }

    public void setLastName(String lastName) throws IllegalArgumentException {
        this.lastName = lastName;
        return;
    }

    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException {
        try {
            LocalDate dob = null;
            try {
                dob = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } catch (DateTimeParseException e1) {
                dob = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
            LocalDate currentDate = LocalDate.now();
            if (dob.isAfter(currentDate)) {
                throw new IllegalArgumentException("Date of birth cannot be in the future.");
            }
            this.dateOfBirth = dateOfBirth;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please use either yyyy-MM-dd or dd/MM/yyyy.");
        }
    }

    public void setComments(String comments) throws IllegalArgumentException {
        this.comments = comments;
        return;
    }

    public void setAssignedSocialID(int ASSIGNED_SOCIAL_ID) {
        this.ASSIGNED_SOCIAL_ID = ASSIGNED_SOCIAL_ID;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) throws IllegalArgumentException {
        this.medicalRecords.clear();
        for (MedicalRecord record : medicalRecords) {
            this.medicalRecords.add(record);
        }
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) throws IllegalArgumentException {
        this.familyConnections.clear();
        for (FamilyRelation relation : familyConnections) {
            this.familyConnections.add(relation);
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addPersonalBelonging(Supply supply) throws IllegalArgumentException {
        personalBelongings.add(supply);
    }

    public void removePersonalBelonging(Supply supply) throws IllegalArgumentException {
        personalBelongings.remove(supply);
    }

    public void addFamilyConnection(FamilyRelation familyConnection) throws IllegalArgumentException {
        familyConnections.add(familyConnection);
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) throws IllegalArgumentException {
        familyConnections.remove(familyConnection);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) throws IllegalArgumentException {
        medicalRecords.add(medicalRecord);
    }

}
