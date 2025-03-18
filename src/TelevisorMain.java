import Televisor.Televisor;
import Televisor.TipoTelevisor;

public class TelevisorMain {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Samsung", "UN55MU6300", TipoTelevisor.L, 2018,15,"1080p",true);
        Televisor tv2 = new Televisor("LG", "OLED55B9PUA", TipoTelevisor.O, 2019,15,"1080p",true);
        Televisor tv3 = new Televisor("Panasonic", "TH-55FX700", TipoTelevisor.P, 2017,15,"1080p",true);

        System.out.println(tv1.mostrarInformacion());
        System.out.println(tv2.mostrarInformacion());
        System.out.println(tv3.mostrarInformacion());

    }
}
