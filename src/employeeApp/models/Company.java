package employeeApp.models;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public void checkGiro(double giro){
        if(giro<0){
            this.giro=0;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        this.giro = giro;
        checkGiro(this.giro);
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id: " + id +
                " name: " + name +
                " giro: " + giro +
                " developerNames: " + Arrays.toString(developerNames) +
                '}';
    }

    public void addEmployee(int index, String name){
        if(developerNames[index] == null){
            developerNames[index] = name;
        }else{
            System.out.println("Bu index dolu");
        }
    }


}
