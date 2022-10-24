package ba.unsa.etf.rpr;

public class Broj {
        static boolean isNumber(String s){
        for (int i = 0; i < s.length(); ++i)
            if (!Character.isDigit(s.charAt(i)))
                return false;
        return true;
    }
}
