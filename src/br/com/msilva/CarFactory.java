package br.com.msilva;

public class CarFactory extends Factory{

    @Override
    Car retrieveCar(String requestedGrade) {

        if("A".equals(requestedGrade)){
            return new Toyota (1000, "full", "red");
        }else if("B".equals(requestedGrade)){
            return new Volkswagem(1000, "full", "red");
        }else{
            System.out.println("the requested car was unfortunately no available.");
        }
        return null;

//        switch(requestedGrade){
//            case "A":
//                return new Toyota (1000, "full", "gray");
//            case "B" :
//                return new Volkswagem(1000, "full", "black");
//            default:
//                System.out.println("the requested car was unfortunately no available.");
//                return null;
//        }
    }

}
