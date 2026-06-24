import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.println("Bienvenido" + " ¿Como deseas que se llame tu mascota?");
        String nombre = usuario.nextLine();

        Mascota miMascota = new Mascota(nombre);

        System.out.println("Felicidades tu mascota " + nombre + " ha sido registrada " +
                nombre + " tiene 100 de energia y 0 de hambre por ahora");

        for (int i = 0; i < 3; i++) {
            System.out.println("--- Turno " + (i + 1) + " --- ");
            System.out.println("¿Que deseas hacer?\n" +
                    "1. Alimentar\n" + "2. Jugar\n" + "3. Dormir\n");

            int seleccionado = usuario.nextInt();

            if (seleccionado == 1) {
                System.out.println("Has seleccionado alimentar a " + nombre);
                miMascota.setHambre(miMascota.getHambre() - 20);
                if (miMascota.getHambre() < 0) {
                    miMascota.setHambre(0);
                }
            } else if (seleccionado == 2) {
                System.out.println("Has seleccionado Jugar con " + nombre);

                if(miMascota.getEnergia() < 30){
                    System.out.println("La mascota esta muy cansada, ¡¡¡DEBE DESCANSAR!!!!");
                } else {
                    miMascota.setEnergia(miMascota.getEnergia() - 30);
                    miMascota.setHambre(miMascota.getHambre() + 10);
                }
            }
             else if (seleccionado == 3) {
                System.out.println("Has seleccionado dormir a " + nombre);

                miMascota.setEnergia(miMascota.getEnergia() + 20);
                if (miMascota.getEnergia() > 100) {
                    miMascota.setEnergia(100);
                }
            }
            System.out.println("Estado actual de tu mascota: \n"
            + "Energia " + miMascota.getEnergia() + "|" + " Hambre " + miMascota.getHambre());
        }
        System.out.println("\n La mascota esta sana y salva, Gracias por jugar, nos vemos la proxima");
    }
}

