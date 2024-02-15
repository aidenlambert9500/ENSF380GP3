package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) throws IllegalArgumentException {
        this.personOne = personOne;
        this.personTwo = personTwo;
        this.relationshipTo = relationshipTo;
    }
    
    public DisasterVictim getPersonOne() {return this.personOne;}
    public DisasterVictim getPersonTwo() {return this.personTwo;}
    public String getRelationshipTo() {return this.relationshipTo;}

    public void setPersonOne(DisasterVictim personOne) throws IllegalArgumentException {
        this.personOne = personOne;
        return;
    }
    
    public void setPersonTwo(DisasterVictim personTwo) throws IllegalArgumentException {
        this.personTwo = personTwo;
        return;
    }

    public void setRelationshipTo(String relationshipTo) throws IllegalArgumentException {
        this.relationshipTo = relationshipTo;
        return;        
    }

}
