public class delDel {
//    https://codingbat.com/prob/p100905

   public static String del(String str){
       if (str.substring(1,4).equals("del")){
           return str.substring(0,1) + str.substring(4);
       }else{
           return str;
       }
   }

   public static void doAll(){
       System.out.println(del("adelbc"));
       System.out.println(del("adelHello"));
       System.out.println(del("adedbc"));
   }

}
