package edu.ucalgary.oop;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private static int counter = 0;

    // all getter functions
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth.toString();
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
        this.medicalRecords = new MedicalRecord[0];
        this.familyConnections = new FamilyRelation[0];
        this.personalBelongings = new Supply[0];
        this.ASSIGNED_SOCIAL_ID = counter;
        counter++;
        
        
        try {
            LocalDate entryDate = LocalDate.parse(ENTRY_DATE, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            this.ENTRY_DATE = ENTRY_DATE;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please use the format 'yyyy-MM-dd'.");
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
            LocalDate parsedDate = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            this.dateOfBirth = parsedDate;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please provide the date in the format 'YYYY-MM-DD'.");
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
        this.medicalRecords = medicalRecords;
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) throws IllegalArgumentException {
        this.familyConnections = familyConnections;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPersonalBelongings(Supply[] supplies){
        this.personalBelongings = supplies;
    }

    public void addPersonalBelonging(Supply supply) throws IllegalArgumentException {
        if (personalBelongings == null) {
            personalBelongings = new Supply[1];
            personalBelongings[0] = supply;
        } else {
            Supply[] newArray = new Supply[personalBelongings.length + 1];
            System.arraycopy(personalBelongings, 0, newArray, 0, personalBelongings.length);
            newArray[personalBelongings.length] = supply;
            personalBelongings = newArray;
        }
    }

    public void removePersonalBelonging(Supply supply) throws IllegalArgumentException {
        if (personalBelongings == null) {
            throw new IllegalArgumentException("Personal belongings array is null");
        }
        int indexToRemove = -1;
        for (int i = 0; i < personalBelongings.length; i++) {
            if (personalBelongings[i].equals(supply)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            Supply[] newArray = new Supply[personalBelongings.length - 1];
            System.arraycopy(personalBelongings, 0, newArray, 0, indexToRemove);
            System.arraycopy(personalBelongings, indexToRemove + 1, newArray, indexToRemove,
                    personalBelongings.length - indexToRemove - 1);
            personalBelongings = newArray;
        } else {
            throw new IllegalArgumentException("Personal belonging not found");
        }
    }

    public void addFamilyConnection(FamilyRelation familyConnection) throws IllegalArgumentException {
        if (familyConnections == null) {
            familyConnections = new FamilyRelation[1];
            familyConnections[0] = familyConnection;
        } else {
            FamilyRelation[] newArray = new FamilyRelation[familyConnections.length + 1];
            System.arraycopy(familyConnections, 0, newArray, 0, familyConnections.length);
            newArray[familyConnections.length] = familyConnection;
            familyConnections = newArray;
        }
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) throws IllegalArgumentException {
        if (familyConnections == null) {
            throw new IllegalArgumentException("Family connections array is null");
        }
        int indexToRemove = -1;
        for (int i = 0; i < familyConnections.length; i++) {
            if (familyConnections[i].equals(familyConnection)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            FamilyRelation[] newArray = new FamilyRelation[familyConnections.length - 1];
            System.arraycopy(familyConnections, 0, newArray, 0, indexToRemove);
            System.arraycopy(familyConnections, indexToRemove + 1, newArray, indexToRemove,
                    familyConnections.length - indexToRemove - 1);
            familyConnections = newArray;
        } else {
            throw new IllegalArgumentException("Family connection not found");
        }
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) throws IllegalArgumentException {
        if (medicalRecords == null) {
            medicalRecords = new MedicalRecord[1];
            medicalRecords[0] = medicalRecord;
        } else {
            MedicalRecord[] newArray = new MedicalRecord[medicalRecords.length + 1];
            System.arraycopy(medicalRecords, 0, newArray, 0, medicalRecords.length);
            newArray[medicalRecords.length] = medicalRecord;
            medicalRecords = newArray;
        }
    }
}
