import javax.print.attribute.HashPrintJobAttributeSet;

public class Tipojuego {

    //atributos

    public String nombreJuego;
    public double pesoJuego;
    private int horasJugadas;


    //metodos
        //constructor
        public Tipojuego(String nombreJuego, double pesoJuego, int horasJugadas){
            this.nombreJuego = nombreJuego;
            this.pesoJuego = pesoJuego;
            this.horasJugadas = horasJugadas;
        }

        //getter

        public int getHorasJugadas(){
            return horasJugadas;
        }

        //setter
        public void setHorasJugadas(int horasJugadas){
            this.horasJugadas = horasJugadas;
        }

        public void mostrarInfo(){
            System.out.println("A continuacion se detalla la informacion de tu juego: ");
            System.out.println("Nombre del juego: "+nombreJuego);
            System.out.println("Peso del juego: "+pesoJuego);
            System.out.println("Horas jugadas: "+ horasJugadas);
        }


        static class rolVideojuego extends Tipojuego{
            //atributos
                public String nombreProtagonista;
                public String habilidades;
            //metodos
            public rolVideojuego(String nombreJuego, double pesoJuego, int horasJugadas, String nombreProtagonista, String habilidades){
                super(nombreJuego, pesoJuego, horasJugadas);
                this.nombreProtagonista = nombreProtagonista;
                this.habilidades = habilidades;
            }

            public void mostrarInfo(){
                super.mostrarInfo();
                System.out.println("Nombre Protagonista: "+nombreProtagonista);
                System.out.println("Habilidades del protagonista: "+habilidades);
            }
        }

    static class historiaV extends rolVideojuego{
            //atributos
            public String detalleHistoria;
            public int numPersonajes;
            //metodos

            public historiaV(String nombreJuego, double pesoJuego, int horasJugadas, String nombreProtagonista, String habilidades, String detalleHistoria, int numPersonajes){
                super(nombreJuego, pesoJuego, horasJugadas, nombreProtagonista, habilidades);
                this.detalleHistoria = detalleHistoria;
                this.numPersonajes = numPersonajes;
            }

            public void mostrarInfo(){
                super.mostrarInfo();
                System.out.println("Historia del juego: "+detalleHistoria);
                System.out.println("Numero de Personajes: "+numPersonajes);
            }

        }

    static class zonasMapa extends historiaV{
            //atributos
            public int numZonas;
            public int numAldeas;
            //metodos
            public zonasMapa(String nombreJuego, double pesoJuego, int horasJugadas, String nombreProtagonista, String habilidades, String detalleHistoria, int numPersonajes, int numZonas, int numAldeas){
                super(nombreJuego, pesoJuego, horasJugadas, nombreProtagonista, habilidades, detalleHistoria, numPersonajes);
                this.numZonas = numZonas;
                this.numAldeas = numAldeas;
            }

            public void mostrarInfo(){
                super.mostrarInfo();
                System.out.println("Numero de zonas del mapa: "+numZonas);
                System.out.println("Numero de aldeas del mapa: "+numAldeas);

            }
        }


    public static void main(String [] args){

        zonasMapa juego1 = new zonasMapa("Genshin Impact", 79, 293, "Lumine", "Controlar los elementos", "el protragonista esta en busca de su hermano el cual esta desaparecido y por ello recorre todo el mundo", 50, 7, 15);
        juego1.mostrarInfo();
    }
}
