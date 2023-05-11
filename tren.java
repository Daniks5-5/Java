import java.util.Scanner;
public class tren {
    public static void main(String [] args ){
    Scanner in = new Scanner(System.in);
    People human = new People("Дмитрий");
    System.out.println("Введите ваш возраст:");
    human.myAge(in.nextInt());
    System.out.println("Введите ваш рост");
    human.setHeight(in.nextInt());
    System.out.println("Ваш рост: "+ human.getHeight());
    
    

    }
    
}
class People{
    int age;
    String name;
    int height;
    public People(String name){
        this.name = name;
        System.out.println("Приветсвтую, "+ name);

    }
    void myAge(int age){
        this.age = age;
        if(age>1){ System.out.println("Вам "+age+" лет"); }
        else{System.out.println("Вам не может быть столько лет"); }
    
        

    }
    void setHeight(int height){
        this.height = height;
       
    }
    int getHeight(){
        
        return height;
        
    }
}