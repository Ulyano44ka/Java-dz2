public class l3 {
   
    // Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    
        public static void main(String[] args) {
    
          String vers = "абвгде";
          System.out.println("дана строка : " + vers + "-->" + " " + "перевернутая строка : " + reverseString(vers));
      }
    
      public static String reverseString(String str) {
    
          if (str.length() <= 1) {
              return str;
          }
          return reverseString(str.substring(1)) + str.charAt(0);
      }
    
    }
