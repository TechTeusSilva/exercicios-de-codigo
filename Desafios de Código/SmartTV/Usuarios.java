package SmartTV;;

public class Usuarios {
    public static void main (String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        System.out.println("A TV está ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        System.out.println("");
        
        smartTv.ligar();
            System.out.println("Novo Status -> " + "A TV está ligada ? " + smartTv.ligada);
        
        smartTv.desligar();
            System.out.println("Novo Status -> " + "A TV está ligada ? " + smartTv.ligada);
        
        System.out.println("");

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume(); 
            System.out.println("Volume atual: " + smartTv.volume);
        
        System.out.println("");

        smartTv.aumentarCanal();
            System.out.println("Novo Status -> " + "A TV está no canal ? " + smartTv.canal);

        smartTv.diminuirCanal();
            System.out.println("Novo Status -> " + "A TV está no canal ? " + smartTv.canal);

        smartTv.mudarCanal(13);
            System.out.println("Novo Status -> " + "A TV está no canal ? " + smartTv.canal);

    }
}
