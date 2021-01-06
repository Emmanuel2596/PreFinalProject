package com.emmanuelarguedas.ds.chicagoanalysis;

import com.emmanuelarguedas.ds.chicagoanalysis.model.Worker;

import java.util.Arrays;

public class Facts {
    private Worker [] workers;

    public Facts(Worker[] workers) {

        this.workers = workers;
        this.getHigherPaidDepartment();
        this.getFiveHighestPaidPositions();
        this.getHighestPaidPosition();
        this.getHighestPaidHalfTimePosition();

    }
    public void getHigherPaidDepartment(){

        String higherPaidDepartment = this.workers[0].getDepartment();
        double higherDepartmentAnnualSalaries = 0.0;

        for(int index = 0; index < this.workers.length; ++index){

            if(higherPaidDepartment.equals(this.workers[index].getDepartment())){

                    higherDepartmentAnnualSalaries += this.workers[index].getAnnualSalary();

            } //IF ENDS HERE --------------------------------------------------

        } //FOR ENDS HERE -----------------------------------------------------


        System.out.println("El departamento mas caro es: " + higherPaidDepartment
                + " con un gasto anual de: " + higherDepartmentAnnualSalaries);


    }

    public void getFiveHighestPaidPositions(){

        Worker highestPaid = workers[0];
        Worker highestPaidTwo;
        highestPaidTwo = workers[0];
        Worker highestPaidThree = workers[0];
        Worker highestPaidFour = workers[0];
        Worker highestPaidFive = workers[0];

        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > highestPaid.getAnnualSalary()){
                highestPaid = this.workers[index];
            }
        } //FOR ENDS HERE -----------------------------------------------------

        for(int indexTwo = 0; indexTwo < this.workers.length; ++indexTwo){
            if(this.workers[indexTwo].getAnnualSalary() > highestPaidTwo.getAnnualSalary() &&
                    this.workers[indexTwo].getAnnualSalary() != highestPaid.getAnnualSalary()){
                highestPaidTwo = this.workers[indexTwo];
            }
        } //FOR ENDS HERE -----------------------------------------------------

        for(int indexThree = 0; indexThree < this.workers.length; ++indexThree){
            if(this.workers[indexThree].getAnnualSalary() > highestPaidThree.getAnnualSalary() &&
                    this.workers[indexThree].getAnnualSalary() < highestPaidTwo.getAnnualSalary()){
                highestPaidThree = this.workers[indexThree];
            }
        } //FOR ENDS HERE -----------------------------------------------------


        for(int indexFour = 0; indexFour < this.workers.length; ++indexFour){
            if(this.workers[indexFour].getAnnualSalary() > highestPaidFour.getAnnualSalary() &&
                    this.workers[indexFour].getAnnualSalary() < highestPaidThree.getAnnualSalary()){
                highestPaidFour = this.workers[indexFour];
            }
        } //FOR ENDS HERE -----------------------------------------------------


        for(int indexFive = 0; indexFive < this.workers.length; ++indexFive){
            if(this.workers[indexFive].getAnnualSalary() > highestPaidFive.getAnnualSalary() &&
                    this.workers[indexFive].getAnnualSalary() < highestPaidFour.getAnnualSalary()){
                highestPaidFive = this.workers[indexFive];
            }
        } //FOR ENDS HERE -----------------------------------------------------
        System.out.println("Respuesta #2: Los 5 puestos mejores pagados son:");
        System.out.println("1 - " + highestPaid.toString());
        System.out.println("2 - " + highestPaidTwo.toString());
        System.out.println("3 - " + highestPaidThree.toString());
        System.out.println("4 - " + highestPaidFour.toString());
        System.out.println("5 - " + highestPaidFive.toString());


    } // CLASS getHighestFivePaidPositions ENDS-------------------------------------

    public void getHighestPaidPosition(){
        Worker highestPaid = workers[0];
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > highestPaid.getAnnualSalary()){
                highestPaid = this.workers[index];
            }
        }
        System.out.println("Respuesta #3: El puesto que gana más dinero al año en promedio es:");
        System.out.println(highestPaid.toString());
    } // CLASS getHighestPaidPosition ENDS-------------------------------------




    public void getHighestPaidHalfTimePosition(){
        Worker highestPaidHalfTime = null;
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].isPartTime() && (highestPaidHalfTime == null || this.workers[index].getAnnualSalary() > highestPaidHalfTime.getAnnualSalary())){
                highestPaidHalfTime = this.workers[index];
            }
        }
        System.out.println("Respuesta #4: El puesto con jornada de medio tiempo que gana más dinero al año en promedio es:");
        System.out.println(highestPaidHalfTime.toString());

    } // CLASS GETHIGHESTPAIDHALFTIMEPOSITION ENDS-----------------------------

}
