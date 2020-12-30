package com.emmanuelarguedas.ds.chicagoanalysis;

import com.emmanuelarguedas.ds.chicagoanalysis.model.Worker;

import java.util.Arrays;

public class Facts {
    private Worker [] workers;

    public Facts(Worker[] workers) {

        this.workers = workers;
        this.getHighestPaidDepartment();
        //this.getHighestPaid5();
        this.getHighestPaidPosition();
        this.getHighestPaidHalfTimePosition();
        this.getSecondHighestPaidWorker();
        this.getThirdHighestPaidWorker();
        this.getFourthHighestPaidWorker();
        this.getFifthHighestPaidWorker();
        this.getDepartmentsAnnualExpenses();
        this.getFiveHighestPaidPositions();

    }

    public void getHighestPaidDepartment(){

        double highestPaidDepartmentADMINHEARNG = 0.0;
        double highestPaidDepartmentANIMALCONTRL = 0.0;
        double highestPaidDepartmentAVIATION = 0.0;


        String departament;

        String menor1;
        String menor2 = null;
        String menor3 = null;
        String menor4 = null;
        String menor5 = null;


        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getDepartment().equals("ADMIN HEARNG")){
                highestPaidDepartmentADMINHEARNG += this.workers[index].getAnnualSalary();
            } else if (this.workers[index].getDepartment().equals("ANIMAL CONTRL")){
                highestPaidDepartmentANIMALCONTRL += this.workers[index].getAnnualSalary();
            } else if (this.workers[index].getDepartment().equals("AVIATION")){
                highestPaidDepartmentAVIATION += this.workers[index].getAnnualSalary();
            }
        }

        if((highestPaidDepartmentADMINHEARNG > highestPaidDepartmentANIMALCONTRL) &&
           (highestPaidDepartmentADMINHEARNG > highestPaidDepartmentAVIATION)
        ){
            departament = "ADMIN HEARNG";
        }
        else if((highestPaidDepartmentANIMALCONTRL > highestPaidDepartmentAVIATION)
        ){
            departament = "ANIMAL CONTRl";
        } else{
            departament = "AVIATION";
        }


        if((highestPaidDepartmentADMINHEARNG < highestPaidDepartmentANIMALCONTRL) &&
                (highestPaidDepartmentADMINHEARNG < highestPaidDepartmentAVIATION)
        ){
            menor1 = "ADMIN HEARNG";
        }
        else if((highestPaidDepartmentANIMALCONTRL < highestPaidDepartmentAVIATION)
        ){
            menor1 = "ANIMAL CONTRl";
        } else{
            menor1 = "AVIATION";
        }

        if((highestPaidDepartmentADMINHEARNG < highestPaidDepartmentANIMALCONTRL) &&
                (highestPaidDepartmentADMINHEARNG < highestPaidDepartmentAVIATION) &&
                (menor2 == null)
        ){
            menor2 = "ADMIN HEARNG";

            if (menor2 == menor1) {
                menor2= null;
            }
        }

        if((highestPaidDepartmentANIMALCONTRL < highestPaidDepartmentAVIATION)&&
                (menor2 == null)
        ){
            menor2 = "ANIMAL CONTRl";

            if (menor2 == menor1) {
                menor2= null;
            }

        } else{
            menor2 = "AVIATION";
        }

        System.out.println("Respuesta #1: El departamento mas caro por año es: ");
        System.out.println(departament);
        System.out.println("Respuesta #5: Los departamentos con menor gasto por año son: ");
        System.out.println(menor1);
        System.out.println(menor2);
    } // CLASS getHighestPaidPosition ENDS-------------------------------------

    public void getHighestPaid5(){

        Worker highestPaid1 = workers[0];
        Worker highestPaid2 = workers[0];
        Worker highestPaid3 = workers[0];
        Worker highestPaid4 = workers[0];
        Worker highestPaid5 = workers[0];

        for(int index = 0; index < this.workers.length; ++index){

            if((this.workers[index].getAnnualSalary() > highestPaid5.getAnnualSalary())
            ){
                highestPaid5 = this.workers[index];}

                if((this.workers[index].getAnnualSalary() > highestPaid4.getAnnualSalary())){

                    highestPaid5 = highestPaid4;
                    highestPaid4 = this.workers[index];}

                    if((this.workers[index].getAnnualSalary() > highestPaid3.getAnnualSalary())){

                    highestPaid5 = highestPaid4;
                    highestPaid4 = highestPaid3;
                    highestPaid3 = this.workers[index];}

                        if((this.workers[index].getAnnualSalary() > highestPaid2.getAnnualSalary())){

                            highestPaid5 = highestPaid4;
                            highestPaid4 = highestPaid3;
                            highestPaid3 = highestPaid2;
                            highestPaid2 = this.workers[index];}

                            if((this.workers[index].getAnnualSalary() > highestPaid1.getAnnualSalary())) {

                                highestPaid5 = highestPaid4;
                                highestPaid4 = highestPaid3;
                                highestPaid3 = highestPaid2;
                                highestPaid2 = highestPaid1;
                                highestPaid1 = this.workers[index];}


        }

        System.out.println("Respuesta #2: Los cinco trabajadores que ganan mas dinero al año son: ");

        System.out.println(highestPaid1.toString());
        System.out.println(highestPaid2.toString());
        System.out.println(highestPaid3.toString());
        System.out.println(highestPaid4.toString());
        System.out.println(highestPaid5.toString());

    } // CLASS getHighestPaidPosition ENDS-------------------------------------



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

    public void getFiveHighestPaidPositions(){
        Worker highestPaid = workers[0];
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > highestPaid.getAnnualSalary()){
                highestPaid = this.workers[index];
            }
            Worker highestPaidTwo = workers[0];
            for(int indexTwo = 0; indexTwo < this.workers.length; ++indexTwo){
                if(this.workers[indexTwo].getAnnualSalary() > highestPaid.getAnnualSalary() &&
                        this.workers[indexTwo].getAnnualSalary() < highestPaid.getAnnualSalary()){
                    highestPaidTwo = this.workers[indexTwo];
                }
            }System.out.println("Respuesta #3: El segundo puesto que gana más dinero al año en promedio es:");
            System.out.println(highestPaidTwo.toString());
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

    public void getSecondHighestPaidWorker(){
        Worker highestPaid = workers[0];
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > highestPaid.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() < 275004.0){
                highestPaid = this.workers[index];
            }
        }
        System.out.println(" El segundo trabajador que gana más dinero al año en promedio es:");
        System.out.println(highestPaid.toString());
    } // CLASS getSecondHighestPaidWorker ENDS---------------------------------

    public void getThirdHighestPaidWorker(){
        Worker highestPaid = workers[0];
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > highestPaid.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() < 260004.0){
                highestPaid = this.workers[index];
            }
        }
        System.out.println(" El tercer trabajador que gana más dinero al año en promedio es:");
        System.out.println(highestPaid.toString());
    } // CLASS getThirdHighestPaidWorker ENDS----------------------------------

    public void getFourthHighestPaidWorker(){
        Worker highestPaid = workers[0];
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > highestPaid.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() < 232960.0){
                highestPaid = this.workers[index];
            }
        }
        System.out.println(" El cuarto trabajador que gana más dinero al año en promedio es:");
        System.out.println(highestPaid.toString());
    } // CLASS getFourthHighestPaidWorker ENDS --------------------------------

    public void getFifthHighestPaidWorker(){
        Worker highestPaid = workers[0];
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > highestPaid.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() < 217728.0){
                highestPaid = this.workers[index];
            }
        }
        System.out.println(" El quinto trabajador que gana más dinero al año en promedio es:");
        System.out.println(highestPaid.toString());
    } // CLASS getFifthHighestPaidWorker ENDS----------------------------------

    public void getDepartment(){
        String department = workers[0].getDepartment();
        double annualSalary = 0.0;
        for(int index = 0; index < this.workers.length; ++index){
            department = this.workers[index].getDepartment();
            annualSalary = this.workers[index].getAnnualSalary();


        } // for ends here-----------------------------------------------------

    } // getDepartment ends here-----------------------------------------------

    public void getDepartmentsAnnualExpenses(){
        String department = workers[0].getDepartment();
        double annualSalary = workers[0].getAnnualSalary();
        for(int index = 0; index < this.workers.length; ++index){
            annualSalary = this.workers[index].getAnnualSalary();
            if(department == this.workers[index].getDepartment()){
              double annualExpenses = annualSalary + this.workers[index].getAnnualSalary();
                System.out.println(" Departamento: " + department + " Gasto Anual: " +annualExpenses );

            }
        }

    } // CLASS getDepartmentsAnnualExpenses ENDS-------------------------------



}
