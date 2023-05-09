import java.util.Scanner;
public class mass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] [] mass = {{1,2,3}, {4,6}, {7,8,66,5,53,9}};
        for(int i=0;i<mass.length;i++){
            for(int j=0; j<mass[i].length;j++){
                System.out.println(mass[i][j]+"");
                

            }
            System.out.println();

        } 
        Matem mat1 = new Matem();
        mat1.setNum(in.nextInt());
        System.out.println("Ответ:"+mat1.getNum());

    }
}
class Matem{
    private int a;
    public void setNum(int first){
        a=first;
        int numbers = first;
        System.out.println(numbers);

    }
    public int getNum(){
        return a;


}
}
