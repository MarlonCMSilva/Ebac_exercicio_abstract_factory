package br.com.msilva;

public class CompanyCarFactory extends Factory{


    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Tesla (1000, "full", "red");
        }else if("B".equals(requestedGrade)){
            return new Audi(1000, "full", "red");
        }else{
            System.out.println("the requested car was unfortunately no available.");
        }

        return null;
    }
}
