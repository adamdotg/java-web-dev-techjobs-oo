package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    //COMPLETE
    public Job (){
        id = nextId;
        nextId++;
    }
    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    //COMPLETE

//----- not sure if this is correct -----
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Job job = (Job) o;
//
//        return id == job.id;
//    }
//----- not sure if this is correct -----


    @Override
    public int hashCode() {
        return id;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    //COMPLETE

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString(){

        String stringName = this.getName();
        String stringEmp = this.getEmployer().toString();
        String stringLoc = this.getLocation().toString();
        String stringPosType = this.getPositionType().toString();
        String stringCoreComp = this.getCoreCompetency().toString();

        if (stringName.isEmpty()){ stringName= "Data not available"; }
        if (stringEmp.isEmpty()){ stringEmp = "Data not available"; }
        if (stringLoc.isEmpty()){ stringLoc = "Data not available"; }
        if (stringPosType.isEmpty()){ stringPosType = "Data not available"; }
        if (stringCoreComp.isEmpty()){ stringCoreComp = "Data not available"; }

        return "\n"+
        "ID: "+this.getId()+"\n"+
        "Name: "+stringName+"\n"+
        "Employer: "+stringEmp+"\n"+
        "Location: "+stringLoc+"\n"+
        "Position Type: "+stringPosType+"\n"+
        "Core Competency: "+stringCoreComp+"\n";


    }
}
