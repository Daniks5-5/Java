import java.util.Scanner;
public class ClassandObject {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Person name1 = new Person();
        name1.setFam(in.nextLine());
        System.out.println(name1.getFam());
        name1.speaker();
        

    }
    
}
class Person{
    private String family;
    private String name;
    private int age;
    public void setFam(String famil){
        family=famil;
    }
    public String getFam(){
        return family;
    }
    public void setName(String name1){
        name=name1;

    }
    public String getName(){
        return name;
    }


    void speaker(){
        for(int i=0;i<3;i++){
        System.out.println("Моя фамилия"+" "+family+", меня зовут"+" "+name+" "+"и мне"+" "+age);
        }
    
    }
    void fam(){
        for(int i=0;i<3;i++){
            System.out.println("Моё имя "+name+", а фамилия "+family+" , кстати мне "+age);
        }
    }
    int pension(){
        int years=65-age;
        return years;
    }
    void setNameAndAge(String username, int ages){
        name=username;
        age=ages;
    }
}

    