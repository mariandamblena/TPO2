import Televisor.TipoTelevisor;
import Televisor.Televisor;
import Televisor.Pantalla;

public class TelevisorMain {
    public static void main(String[] args) {
        // Creamos un objeto Pantalla compartido
        Pantalla pantallaCompartida = new Pantalla(55, "4K", true);

        // Creamos varios televisores que comparten la misma pantalla
        Televisor tv1 = new Televisor("Samsung", "Series 9", TipoTelevisor.L, 2018, pantallaCompartida);
        Televisor tv2 = new Televisor("LG", "OLED55B9PUA", TipoTelevisor.O, 2019, pantallaCompartida);
        Televisor tv3 = new Televisor("Panasonic", "TH-55FX700", TipoTelevisor.P, 2017, pantallaCompartida);

        System.out.println("Estado inicial de los televisores:");
        System.out.println(tv1.mostrarInformacion());
        System.out.println(tv2.mostrarInformacion());
        System.out.println(tv3.mostrarInformacion());

        // Encendemos tv1 y, al compartir la pantalla, se enciende también el componente
        System.out.println("\nEncendiendo tv1:");
        tv1.encender();
        System.out.println(tv1);
        System.out.println("Estado de la pantalla compartida: " + pantallaCompartida.mostrarInformacionPantalla());

        // Apagamos tv2
        System.out.println("\nApagando tv2:");
        tv2.apagar();
        System.out.println(tv2.mostrarInformacion());
        System.out.println("Estado de la pantalla compartida: " + pantallaCompartida.mostrarInformacionPantalla());

        // Nota: Al compartir la pantalla, al cambiar el estado desde uno de los televisores, se afecta a todos.
        // Aquí se muestra el estado final de todos.
        System.out.println("\nEstado final de todos los televisores:");
        System.out.println(tv1.mostrarInformacion());
        System.out.println(tv2.mostrarInformacion());
        System.out.println(tv3.mostrarInformacion());
    }
}
