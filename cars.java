import java.util.Scanner;
public class cars {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    nalog car1 = new nalog();
    System.out.println("Введи количество лошадиных сил:");
    car1.setPower(in.nextInt());
    System.out.println("Налог на твой автомобиль");

    }
}
class nalog{
    private int p;
    public void setPower(int power){
        int m = 12;
        int R = in.nextInt();
        p=power;
        if(R<100){
            R=12;
        }
        else if(R==100 || R<125){
            R=25;
        }
        else if(R==125 || R<150){
            R=35;
        }
        int price = power*m*R;
        System.out.println("налог на автомобиль "+price);
    }
     
        

  

    }
    

