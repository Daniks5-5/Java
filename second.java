import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число до 5:");
        int next=in.nextInt();
        switch(next){
        case 5:
            System.out.println("отлично");
            break;
        case 4:
           System.out.println("хорошо");
           break;
        case 3:
           System.out.println("Удолетворительно");
           break;
        case 2:
           System.out.println("Плохо");
           break;
        case 1:
           System.out.println("Ужасно");
           break;
        
        }

    }
    
}
