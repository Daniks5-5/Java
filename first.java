import java.util.*;

public class first {

    public static int sum(int a, int b){
        return a+b;
        
    }

    public static void main(String[] args) {
      
    Scanner in = new Scanner(System.in);
    System.out.println("Введиет пожалуйста числа:");
    if(in.hasNextInt()){
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println(sum(a,b));
    }
    else{
        System.out.println("Увы, вы ввели не числа :(");
    }

   
    
}
}
