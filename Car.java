abstract class MotorVehicle{
    String modelName;
    int modelNumber;
    double modelPrice;
    void display(){};


}

public class Car extends MotorVehicle{

    Car(String n,int no,double p){
        modelName=n;
        modelNumber=no;
        modelPrice=p;
    }

    void display(){
        System.out.println("Car name: "+ modelName);
        System.out.println("Model Number: "+ modelNumber);
        System.out.println("Price: "+ modelPrice);
    }

double discountRate=0.1;
double NewPrice=0;

void discount(){
    System.out.println("Original Price: "+modelPrice+"\nApplicable Discount: 10%");
    NewPrice=modelPrice-modelPrice*discountRate;
    System.out.println("New Price:"+NewPrice);
}

public static void main(String[] args) {
    Car a1= new Car("Audi",2093,2500000);

    a1.display();
    a1.discount();
}

}
