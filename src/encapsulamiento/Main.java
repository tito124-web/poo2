package encapsulamiento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE EJERCICIOS =====");
            System.out.println("1.  Persona encapsulada");
            System.out.println("2.  Producto");
            System.out.println("3.  Cuenta bancaria");
            System.out.println("4.  Clase y calificación");
            System.out.println("5.  Becado");
            System.out.println("6.  Termómetro");
            System.out.println("7.  Reloj");
            System.out.println("8.  Contacto");
            System.out.println("9.  Juego con puntaje máximo");
            System.out.println("10. Facturación");
            System.out.println("0.  Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:  ejercicio1(); break;
                case 2:  ejercicio2(); break;
                case 3:  ejercicio3(); break;
                case 4:  curso();      break;
                case 5:  becado();     break;
                case 6:  termometro(); break;
                case 7:  reloj();      break;
                case 8:  contato();    break;
                case 9:  juego();      break;
                case 10: factura();    break;
                case 0:  System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    public static void ejercicio1() {
        personaencapsulada per1 = new personaencapsulada("tito", "martinez", 5);
        personaencapsulada per2 = new personaencapsulada("david", "martinez", 20);
        per1.setEdad(-5);
        System.out.println(per1.mostrar());
        System.out.println(per2.mostrar());
    }

    public static void ejercicio2() {
        producto produc1 = new producto();
        producto produc2 = new producto();
        produc1.setNombre("Playstation");
        produc1.setCodigo("1");
        produc1.setPrecio(0);
        produc1.setStock(50);
        produc1.vender(10);
        produc2.setNombre("play2");
        produc2.setCodigo("2");
        produc2.setPrecio(900);
        System.out.println("Descuento del producto 1 " + produc1.getNombre() + " es de " + produc1.carDescuento(18));
        System.out.println("Descuento del producto 2 " + produc2.getNombre() + " es de " + produc2.carDescuento(20));
    }

    public static void ejercicio3() {
        cuenta titu1 = new cuenta("tito", 0, 123);
        titu1.setTitular("TITO");
        titu1.setSaldo(100.00);
        titu1.retirar(50, 123);
        titu1.retirar(50, 1234);
        System.out.println("El saldo de " + titu1.getTitular() + " es de " + titu1.depositar(50.00));
        System.out.println("El saldo de " + titu1.getTitular() + " es de " + titu1.retirar(10.00));
    }

    public static void curso() {
        claseycalificacion per  = new claseycalificacion();
        claseycalificacion per2 = new claseycalificacion();
        per.setCurso("ingles");
        per.setNota1(60);
        per.setNota2(65);
        per.setNota3(60);
        per2.setCurso("progra");
        per2.setNota1(30);
        per2.setNota2(25);
        per2.setNota3(40);
        System.out.println("Promedio " + per.getCurso()  + ": " + per.promedio());
        System.out.println("Promedio " + per2.getCurso() + ": " + per2.promedio());
        per.estado();
        per2.estado();
    }

    public static void becado() {
        becado per  = new becado();
        becado per2 = new becado();
        per.setNombre("tito");
        per.setCarnet(013);
        per.setPromedio(60);
        per2.setNombre("david");
        per2.setCarnet(014);
        per2.setPromedio(90);
        System.out.println(per.toString());
        System.out.println(per2.toString());
    }

    public static void termometro() {
        termometro celsius = new termometro();
        celsius.setCelsius(301.00);
        System.out.println("Celsius: "    + celsius.getCelsius()    + "°C");
        System.out.println("Fahrenheit: " + celsius.getFahrenheit() + "°F");
        celsius.setCelsius(-300.00);
        System.out.println("Celsius: " + celsius.getCelsius() + "°C");
    }

    public static void reloj() {
        reloj rej  = new reloj();
        reloj rej2 = new reloj();
        rej.setHora(13);
        rej.setMinuto(20);
        rej.setSegundo(13);
        rej2.setHora(25);
        rej2.setMinuto(60);
        rej2.setSegundo(61);
        rej.mostrarHora();
        rej2.mostrarHora();
    }

    public static void contato() {
        contacto con  = new contacto();
        contacto con2 = new contacto();
        try { con2.setEmail("tito12.email"); }
        catch (IllegalArgumentException e) { System.out.println("Error: " + e.getMessage()); }
        try { con.setEmail("tito13@gmail.com"); }
        catch (IllegalArgumentException e) { System.out.println("Error: " + e.getMessage()); }
        con.setName("tito");
        con2.setName("david");
        try { con2.setNum("654712394"); }
        catch (IllegalArgumentException e) { System.out.println("Error: " + e.getMessage()); }
        try { con.setNum("25141213"); }
        catch (IllegalArgumentException e) { System.out.println("Error: " + e.getMessage()); }
        con.mostrarContacto();
        con2.mostrarContacto();
    }

    public static void juego() {
        Juego player  = new Juego();
        Juego player2 = new Juego();
        try { player.setPuntajeactual(-25); }
        catch (IllegalArgumentException e) { System.out.println("Error: " + e.getMessage()); }
        try { player2.setPuntajeactual(25); }
        catch (IllegalArgumentException e) { System.out.println("Error: " + e.getMessage()); }
        player.setName("tito");
        player.setPuntajemaximo(24);
        player2.setName("david");
        player2.setPuntajemaximo(24);
        System.out.println("Nombre: " + player.getName()  + " | Puntaje actual: " + player.getPuntajeactual());
        System.out.println("Nombre: " + player2.getName() + " | Puntaje actual: " + player2.getPuntajeactual());
    }

    public static void factura() {
        Facturacion f = new Facturacion();
        f.setCodigoFactura("F-001");
        f.setDescripcion("Teclado mecánico");
        f.setCantidad(3);
        f.setPrecioUnitario(49.99);
        f.mostrarFactura();
    }
}