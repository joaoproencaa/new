public class UsuarioProject {
    
    public static void main (String [] args) throws Exception {

        SmartTvProject smartTv = new SmartTvProject();

        System.out.println("Is it turned on?" + smartTv.turnedOn);
        System.out.println("Which channel is it in?" + smartTv.channel);
        System.out.println("What is the current volume?" + smartTv.volume);

        smartTv.on();
        System.out.println("NEW -> Is it turned on?" + smartTv.turnedOn); // must return true

        smartTv.off();
        System.out.println("NEW -> Is it turned on?" + smartTv.turnedOn); // must return false

        smartTv.turnVolumeUp();
        System.out.println("What is the current volume?" + smartTv.volume);
        
        smartTv.turnVolumeDown();
        System.out.println("What is the current volume?" + smartTv.volume);

        smartTv.NextChannel();
        System.out.println("Which channel is it in?" + smartTv.channel);

        smartTv.PreviousChannel();
        System.out.println("Which channel is it in?" + smartTv.channel);
        
        smartTv.ChooseChannel(23);
        System.out.println("Which channel is it in?" + smartTv.channel);
    }
}

