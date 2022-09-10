import java.util.*;
class question3 {
    public static void main(String[] args){
        System.out.print("Enter number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        if(num1>10){
            int pay=(num1*90);
            System.out.print(pay);
        }
        else{
            int pay=(num1*100);
            System.out.print(pay);
        }


    }

}