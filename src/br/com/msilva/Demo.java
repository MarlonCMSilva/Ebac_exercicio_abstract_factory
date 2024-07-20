package br.com.msilva;

public class Demo {

    public static void main (String args[]){
        Customer cliente = new Customer("A", false);
        Factory factory= getCarFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getCarFactory(Customer cliente){
        if(cliente.hasCompanyContract()){
            return new CompanyCarFactory();
        }else {
            return new CarFactory();
        }
    }
}
