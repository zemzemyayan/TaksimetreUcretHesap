package TaksimetreTutarHesap;

import java.util.Scanner;

public class App {

    /*
     * Taksimetre Programı
     * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran
     * programı yazın.
     * 
     * Taksimetre KM başına 2.20 TL tutmaktadır.
     * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL
     * alınacaktır.
     * Taksimetre açılış ücreti 10 TL'dir.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("yolculuk kaç KM tuttu: ");
        float km = sc.nextFloat();
        float tksUcret = 10 + km * (2.20f);
        if (tksUcret <= 20) {
            System.out.println("taksi ücreti 20 tldir");
        } else {
            System.out.println("taksi ücreti: " + tksUcret);
        }
        sc.close();

    }

}
