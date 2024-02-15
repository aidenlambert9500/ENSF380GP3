package edu.ucalgary.oop;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;
    
    // default constructor
    public Location(String name, String address){
        this.name = name;
        this.address = address;
    }
    // getter functions
    public String getName() {return this.name;}
    public String getAddress() {return this.address;}
    public DisasterVictim[] getOccupants() {return this.occupants;}
    public Supply[] getSupplies() {return this.supplies;}

    // setter functions
    public void setName(String name){
        this.name = name;
        return;
    }
    public void setAddress(String address){
        this.address = address;
        return;
    }
    public void setOccupants(DisasterVictim[] occupants){
        this.occupants = occupants;
        return;
    }
    public void setSupply(Supply[] supplies){
        this.supplies = supplies;
        return;
    }
    public void addOccupant(DisasterVictim occupant){
        occupants.add(occupant);
    }

    
}
