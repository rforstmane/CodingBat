public class mixStart {
//   https://codingbat.com/prob/p151713
    public static boolean mix(String str){
        if (str.substring(1,3).equals("ix")){
            return true;
        }else{
            return false;
        }
    }

    public static void doAll(){
        System.out.println(mix("mix snacks"));
        System.out.println(mix("pix snacks"));
        System.out.println(mix("piz snacks"));
    }
}
