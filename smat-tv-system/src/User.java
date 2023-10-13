public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); 


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: "+ smartTv.volume);



        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> ");
        System.out.println("Tv ligada ? " + smartTv.ligada);


        smartTv.desligar();
        System.out.println("Novo Status -> ");
        System.out.println("Tv ligada ? " + smartTv.ligada);



        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(13);


    }


    
}
