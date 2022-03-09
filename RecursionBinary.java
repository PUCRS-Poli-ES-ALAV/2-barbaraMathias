public class RecursionBinary {
    
    public static void main(String[] args) throws Exception{
        System.out.println(convBase2(10));
        System.out.println(convBase2(260));
        System.out.println(convBase2(15));
        System.out.println(convBase2(9));
    }
    public static String convBase2(int n) throws Exception{
        // Erro n<0  
        // base n<2 adiciona o proprio numero
        // 10/2  = 0 -> 5/2 = 1 -> 2/2 = 0 -> 1

        if (n<0) {
            throw new Exception("numero deve ser positivo");
            
        }
        if (n == 0){ 
            return "0";
        }
        
        if(n == 1){
            return "1";
        }

        int divideResult = n/2;
        int rest = n %2;
        String binary = String.valueOf(rest);
        return 
        convBase2(divideResult) + binary;  

    }
}
