import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double aConvertir, converti=0;
        char reponse = ' ', mode = ' ';


        System.out.println("----------------------------------------------------------------");
        System.out.println("-----------------------Welcome----------------------------------");
        System.out.println("----------Celsius-Fahrenheit/Fahrenheit-Celsius converter--------\n");

        do {
            do {
                mode = ' ';
                System.out.println( "\n" +
                        "choose the conversion mode:\n" +
                        "1- Celsius-Fahrenheit\n" +
                        "2- Fahrenheit-Celsius");
                mode = scanner.nextLine().charAt(0);
                if (mode != '1' && mode != '2') {
                    System.out.println("choose 1 or 2");
                }


            } while (mode != '1' && mode !='2');


            System.out.println(" \"Enter the temperature to convert\"");
            aConvertir= scanner.nextDouble();






        }while (mode != '1' && mode !='2');


        System.out.println(" \"Enter the temperature to convert\"");
        aConvertir= scanner.nextDouble();
        String next = scanner.next();


            if (mode =='1')
        {
            converti= ((9.0/5.0) * aConvertir) + 32.0;
            System.out.println(aConvertir + "°C correspond à " );
            System.out.println(converti + "°Fahrenheit : ") ;
        }
        else {
            converti = ((aConvertir - 32) * 5) / 9;
            System.out.print(aConvertir + " °F correspond à : ");
            System.out.println(converti + " °C.");

        }
        do{
            System.out.println("Do you want to convert other temperatures ?\\n\" + \"1- Yes\\n\" + \"2- No\\n");
            reponse = scanner.nextLine().charAt(0);

        }while(reponse != '1' && reponse != '2');
        while (reponse == '2')
            System.out.println("Bye!");

     {

        }



    }

}