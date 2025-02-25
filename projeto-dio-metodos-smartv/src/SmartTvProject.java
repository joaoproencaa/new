public class SmartTvProject {
    // exemplificação para a aula de metodos
    // programação de um objeto (smarttv), em que ela pode:
    // caracteristicas: ligada, volume e canal;
    // ela pode ligar ou delsigar, abaixar ou aumentar o volume, subir ou descer o canal.
    boolean turnedOn = false;

    public boolean isTurnedOn() {
        return turnedOn;
    }
    int volume = 25;
    int channel = 1;

    public void on(){
        turnedOn = true;
    }

    public void off(){
        turnedOn = false;
    }

    public void turnVolumeUp(){
        volume++;
    }

    
    public void turnVolumeDown(){
        volume--;
    }

    public void NextChannel(){
        channel++;
    }

    public void PreviousChannel(){
        channel--;
    }

    
    public void ChooseChannel(int newChannel){
        channel = newChannel;        
    }

}