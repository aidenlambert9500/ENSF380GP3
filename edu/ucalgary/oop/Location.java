package edu.ucalgary.oop;

import java.util.ArrayList;

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;

    // default constructor
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new ArrayList<DisasterVictim>();
        this.supplies = new ArrayList<Supply>();
    }

    // getter functions
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public ArrayList<DisasterVictim> getOccupants() {
        return this.occupants;
    }

    public ArrayList<Supply> getSupplies() {
        return this.supplies;
    }

    // setter functions
    public void setName(String name) {
        this.name = name;
        return;
    }

    public void setAddress(String address) {
        this.address = address;
        return;
    }

    public void setOccupants(ArrayList<DisasterVictim> occupants) {
        this.occupants = occupants;
        return;
    }

    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies;
        return;
    }

    public void addOccupant(DisasterVictim occupant) {
        this.occupants.add(occupant);
        return;
    }

    public void removeOccupant(DisasterVictim occupant) {
        this.occupants.remove(occupant);
        return;
    }

    public void addSupply(Supply supply) {
        this.supplies.add(supply);
        return;
    }

    public void removeSupply(Supply supply) {
        this.supplies.remove(supply);
        return;
    }

}
