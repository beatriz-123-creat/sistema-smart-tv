public class App {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = New SmartTv();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Volume atual: V o lume atual: " + smartTv.volume);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

    }
}
