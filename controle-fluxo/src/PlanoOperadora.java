public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "T";


        switch (plano) {
            case "T":{
                System.out.println("5Gb de Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagran grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação"); 
                break;
            }  
            default:

                {
                    System.out.println("OP inválida");
                    break;}
        }
    }
}
