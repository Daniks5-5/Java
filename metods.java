import java.util.Scanner;
public class metods {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    Car car1 = new Car();
    car1.clas="C";
    System.out.println("Введите колличсетво сил");
    car1.power=in.nextInt();
    int endprice1 = car1.nalog();
    System.out.println("налог на авто класса "+car1.clas+" равен "+endprice1);
    Car car2 = new Car();
    car2.clas="D";
    System.out.println("Введите колличество сил:");
    car2.power=in.nextInt();
    int endprice2 = car2.nalog();
    System.out.println("налог на авто класса "+car2.clas+" равен "+endprice2);


    }
    
}
class Car{
    String clas;
    int power;
    int nalog(){
        String small = "C";
        String big = "D";
        int price=0;
        if(clas=="C"){
            price=1000;
        }
        else if(clas=="D"){
            price=4000;
        }
        int nal=power+price;
        return nal;
        }



    }

