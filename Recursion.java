public class Recursion {

 public static void main(String[] args) {
     System.out.println(isPal("ARARA"));
     System.out.println(isPal("A"));
     System.out.println(isPal("caca"));
 }   

 public static boolean isPal(String word){
    //ERRO - NAO TEM
    //BASE CARACTERES DIFERENTES
    //SE FOR PALINDROME A PALAVRA TEM UM CARACTER || VAZIO
    
    if (word.charAt(0) != word.charAt(word.length()-1)) {
        return false;
    }
    if (word.length()==0 || word.length()==1) {
        return true;
    }

    word = word.substring(1,word.length()-1);
    return isPal(word);
    

 }


    
}

