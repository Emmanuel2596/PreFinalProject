package com.emmanuelarguedas.ds.chicagoanalysis.model;

public class Person {
    protected   String name;
    protected String lastname;

    /**
     *
     * @param name
     * @param lastname
     */
    public Person(final String name, final String lastname) {
        this.name = name.replace("\"", "").replace(" ", "");
        this.lastname = lastname.replace("\"","");
    } // constructor person ends ----------------------------------------------
    public String toString(){
        return "{ \"name\":\""+ this.name + "\", \"lastname\":\""+this.lastname+"\"}";
    } // METHOD TO STRING ENDS -------------------------------------------------


    public String getName() {
        return name;
    } // METHOD GET NAME ENDS -------------------------------------------------

    public void setName(String name) {
        this.name = name;
    } // METHOD SET NAME ENDS -------------------------------------------------

    public String getLastname() {
        return lastname;
    } // METHOD GET LASTNAME ENDS ---------------------------------------------

    public void setLastname(String lastname) {
        this.lastname = lastname;
    } // METHOD SET LASTNAME ENDS ---------------------------------------------
}
