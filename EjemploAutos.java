public class EjemploAutos {

    public static void main(String[] args)
    {
        AUTOS chevrolet = new AUTOS("Chevrolet", "Camaro", "Negro", 3.5);
        /*toyota.setMarca("Toyota");
        toyota.setModelo("Prado");
        toyota.setColor("Plomo");*/
        chevrolet.setCilindraje(5.5);


        AUTOS toyota = new AUTOS( "Toyota", "Corolla", "Rojo" );
        /* bmw.setMarca("BMW");
        bmw.setModelo("iX");
        bmw.setColor("Negro"); */
        toyota.setCilindraje(4.5);

        AUTOS ferrari = new AUTOS("Ferrari", "488 GTB", "Blanco");
        /*chevrolet.setMarca("Chevrolet");
        chevrolet.setModelo("XYZ");
        chevrolet.setColor("Blanco");*/
        ferrari.setCilindraje(3.5);

        System.out.println(chevrolet.detalle());
        System.out.println(chevrolet.acelerar(3500));
        System.out.println(chevrolet.frenar());
        System.out.println(chevrolet.consumoCombustible(40.0f, 23.0f));
        System.out.println(chevrolet.consumoCombustible( 40, 23));

        System.out.println(toyota.detalle());
        System.out.println(toyota.acelerar(4500));
        System.out.println(toyota.frenar());
        System.out.println(toyota.consumoCombustible(30.0f, 25.0f));
        System.out.println(chevrolet.consumoCombustible( 30, 25));

        System.out.println(ferrari.detalle());
        System.out.println(ferrari.acelerar(5500));
        System.out.println(ferrari.frenar());
        System.out.println(ferrari.consumoCombustible(50.0f, 34.0f));
        System.out.println(ferrari.consumoCombustible( 60, 34));
    }
}
