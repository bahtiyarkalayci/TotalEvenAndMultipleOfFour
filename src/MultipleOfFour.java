import java.util.Scanner;

public class MultipleOfFour {
    public static void main(String[] args) {
        int num,total=0;
        Scanner scanner =new Scanner(System.in);


        do {
            System.out.println("sayı giriniz");
            num= scanner.nextInt();
            if (num%2==1){
                break;
            }
            if (num%2==0 && num%4==0){
                total+=num;
            }

        }while (num>0);
        System.out.println("total= "+total);

    }
}
