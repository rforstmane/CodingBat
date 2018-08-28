public class stringE {
//    https://codingbat.com/prob/p173784
    public static boolean strin(String str){
        int summa = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') summa++;
        }
        if (summa>=1 && summa<=3){
            return true;
        }else{
            return false;
        }


    }

    public static void doAll(){
        System.out.println(strin("Hello"));
        System.out.println(strin("Heelle"));
        System.out.println(strin("Heelele"));
        System.out.println(strin("Sun"));
    }
}

