import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        perfectnumber a= new perfectnumber();
        Scanner scan = new Scanner(System.in);
        System.out.println("Mükemmel sayı olup olmadığını kontrol etmek istediğiniz sayıyı giriniz!");
        int number= scan.nextInt();
        a.perfect(number);

    }
    public void perfect(int i) {
        int x=0;
        for(int j=1;j<i;j++){
            if(i%j==0){
                x+=j;
            }
        }
        if(i==x){
            System.out.println(i+" mükemmel sayıdır");
        }
        else{
            System.out.println(i+" mükemmel sayı değildir.");
        }
    }
    

    
}