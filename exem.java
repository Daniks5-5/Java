import java.util.Scanner;

public class exem {
   
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n=7;
    switch(n){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        System.out.println("1");
        break;
        default:
        System.out.println("Такого числа нет");
        break;
    }
    for(int i=0; i<10; i++){
     if(i-2==2){
       break; 
     }
     System.out.println(i);
     }
    int[] arr = new int []{1,2,3,4,5,6,78,98,100};
       for(int numbers : arr){
        System.out.println(numbers);
       }
    }
   
    }

