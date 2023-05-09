import java.util.Scanner;
public class this1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Human human = new Human();
        human.setAge(19);
        human.setName("Tom");
        System.out.println("Введите фамилию:");
        human.setFam(in.nextLine());
        human.getFam();
        human.getInfo();

    }
    
}
class Human{
    private String name;
    private int age;
    private String family;
    public void setName(String myName ){
        name=myName;
    }
    public void setAge(int myAge){
        age=myAge;
    }
    public String getName(){
        return name;
    } 
    public int getAge(){
        return age;
    }
    public void setFam(String family){
        this.family=family;
    }
    public String getFam(){
        return family;
    }
    public void getInfo(){
        System.out.println(family+" "+name+","+age);
    }
} 
