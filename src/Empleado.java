public class Empleado {
    //atributos
    public String nombre;
    private double salarioBase;

    //metodos
    //constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public void calcularSalario() {
        System.out.println("El salario base para todos los empleados es de: " + salarioBase);
    }
}
    //subclase Gerente

     class Gerente extends Empleado {
        //atributos
        public double bono;
        //metodos
            //constructor
        public Gerente(String nombre, double salarioBase, double bono){
            super(nombre, salarioBase);
            this.bono = bono;
        }
        public double salarioBase(){
            return getSalarioBase();
        }
        @Override
        public void calcularSalario(){
            System.out.println("El salario del Gerente "+nombre+ " es: "+(salarioBase() + bono)); ;
        }
    }

    //subclase Desarrollador
    class Desarrollador extends Empleado{
        public double horasExtras;
        //metodos
            //constructor
        public Desarrollador(String nombre, double salarioBase, double horasExtras){
            super(nombre, salarioBase);
            this.horasExtras = horasExtras;
        }

        public double salarioBase(){
            return getSalarioBase();
        }

        @Override
        public void calcularSalario(){
            System.out.println("El salario del Desarrollador "+nombre+ " es: "+(salarioBase()+horasExtras));       ;
        }

        //main
        public static void main(String[] args){
            Empleado empleado1 = new Empleado("Raul", 475.3);
            Gerente gerente1 = new Gerente("Miguel", 475.3, 50.5);
            Desarrollador desarrollador1 = new Desarrollador("Jonathan", 475.3, 20.2);

            empleado1.calcularSalario();
            gerente1.calcularSalario();
            desarrollador1.calcularSalario();
        }
    }

