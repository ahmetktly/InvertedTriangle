import java.util.Scanner;

public class inverted{

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int digit , imageNum ;
        
        System.out.println("Please enter a number of digits");

        digit=inp.nextInt();

        for(int i = digit ; i >=1 ; i--){

            for(int k = 0 ; k <= (digit-i) ; k++){

                System.out.print(" ");
            }
            
            imageNum = ( i * 2 ) - 1 ;

            for(int j = 1 ; j <= imageNum ; j++ ){

                System.out.print("*");

            }

        System.out.println();

        }

    }

}