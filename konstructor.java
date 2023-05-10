import java.util.Scanner;
public class konstructor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Humman person1=new Humman("Андрей");
        System.out.println("Введите ваше имя");
        person1.myName(in.nextLine());

        System.out.println("Введите ваш возраст");
        person1.num(in.nextInt());
        


    }
}
class Humman{
    private String name;
    int age;
    public Humman(){
        this.name = "no name";
        System.out.println("Это "+name);
    }
    public Humman(String name){
        System.out.println("Приветствует мой первый конструктор");
        this.name = name;
        System.out.println("Это "+name);

    }
    void num(int age){
        this.age = age;
        if(age>0){
           System.out.println("вы можете продолжать дальше");
        }
        else{
            System.out.println("Сожалеем, но вы не можете продолжать дальше");
        }

    }
    void myName(String name){
        this.name=name;

    }
        
}
