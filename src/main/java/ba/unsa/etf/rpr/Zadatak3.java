package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.util.List;
import static ba.unsa.etf.rpr.Broj.isNumber;
import static java.lang.System.exit;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> L = new ArrayList<>();
        System.out.println("Unesite brojeve:");
        while(true){
            String unos = sc.nextLine();
            if (unos.equals("stop"))
                exit(0);
            if (isNumber(unos)){
                L.add(Integer.valueOf(unos));
                System.out.println("Minimalna i maksimalna vrijednost su : " + Collections.min(L) + " " + Collections.max(L));
                Double sum = 0D;
                for (Integer x : L)sum += x;
                Double srednjaVrijednost = sum/L.size();
                System.out.println("Srednja vrijednost je: " + srednjaVrijednost);
                sum = 0D;
                for (Integer x : L)sum += Math.pow(x - srednjaVrijednost,2);
                sum /= L.size() - 1;
                System.out.println("Standardna devijacija je: " + Math.sqrt(sum));
            }
            else{
                System.out.println("Neispravan unos, probajte ponovo:");
            }

        }
    }
}