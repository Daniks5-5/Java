public class ClassandObject {
    public static void main(String[] args){
        Person name1 = new Person();
        name1.family="Ivanov";
        name1.name="Ivan";
        name1.age=15;
        name1.speaker();
        Person name2 = new Person();
        name2.family="Sidorov";
        name2.name="Nick";
        name2.age=17;
        name2.fam();
        int age1 = name1.pension();
        int age2 = name2.pension();
        System.out.println("Первому человеку до пенсии "+age1);
        System.out.println("Второму человеку до пенсии "+ age2);
    }
    
}
class Person{
    String family;
    String name;
    int age;
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
}

    