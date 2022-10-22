public class SmartTv{

    boolean ligada = false;
    int canal = 1;
    int volume = 25; 

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentaCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        // ou tambem volume = volume + 1
        volume++;

        System.out.println("Aumentar volume para : " + volume);
    }
    public void diminuirVolume(){
        // ou também volume = volume - 1
        volume--;
       
        System.out.println("Diminuir volume para : " + volume);

    }


}
