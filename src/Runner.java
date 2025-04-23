import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Haftalık çalışma saatleri programına hoşgeldiniz");

        boolean val=true;


        while (val){

            try {
            System.out.println("Çalışma Saatini öğrenmek istedğiniz günü ingilizce olarak giriniz");
            String day = scanner.nextLine();
            Days sonuc=Days.valueOf(day.toUpperCase());
            System.out.println();
            System.out.println("Girdiğiniz günün çalışma saatleri: " + sonuc.getStart() + " - " + sonuc.getFinish());
            val=false;


        }catch (IllegalArgumentException h){
            System.out.println("Hatalı giriş : Günü ingilizce olarak giriniz");
        }

        }

        scanner.close();
    }

}
