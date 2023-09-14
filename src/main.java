import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        double  armutf = 2.14
                ,elmaf = 3.67,
                domatesf = 1.11,
                muzf = 0.95,
                patlicanf = 5.00,
                tutar
                ;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armut = input.nextInt();

        System.out.print("Elma Kaç Kilo? : ");
        elma = input.nextInt();

        System.out.print("Domates Kaç Kilo? : ");
        domates = input.nextInt();

        System.out.print("Muz Kaç Kilo? : ");
        muz = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo? : ");
        patlican = input.nextInt();

        tutar = (armut*armutf) + (elma*elmaf) + (domates*domatesf) + (muz*muzf) + (patlican*patlicanf);
        System.out.print("Toplam Tutar : " + tutar);
    }
}