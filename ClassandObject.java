public class ClassandObject {
    public static void main(String[] args){
        Person name1 = new Person();
        name1.family="Ivanov";
        name1.name="Ivan";
        name1.age=15;
        System.out.println("Моя фамилия"+" "+name1.family+" "+",меня зовут"+" "+name1.name+" "+"и мне"+" "+name1.age);
        Person name2 = new Person();
        name2.family="Sidorov";
        name2.name="Nick";
        name2.age=17;
        System.out.println("Моя фамилия"+" "+name2.family+" "+",меня зовут"+" "+name2.name+" "+"и мне"+" "+name2.age);

    }
    
}
class Person{
    String family;
    String name;
    int age;
}