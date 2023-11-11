/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_sebastiancastillo;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class Examen1P1_SebastianCastillo {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***** M E N U *****");
        System.out.println("1. Fight or Flight");
        System.out.println("2. Tri Fuerza");
        System.out.println("3. Salir del programa");
        int opcion = leer.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese maestria");
                    System.out.println("1.Principiante (0% de hit extra + extra damage)");
                    System.out.println("2.Intermedio (5% de hit extra + extra damage)");
                    System.out.println("3.Experto (15% de hit extra + extra damage)");
                    int mast = leer.nextInt();
                    int max = 30;
                    int min = 15;
                    int balas = 25;
                    int maxhit = 100;
                    int minhit = 0;
                    int vida = 20;
                    switch (mast) {
                        case 1: {
                            char ronda = 's';
                            int metros = new Random().nextInt((max - min) + 1) + min;
                            System.out.println("El zombie se encuentra a: " + metros + "metros!");
                            System.out.println("El jugador tiene " + balas + "balas!");
                            int porcentaje = new Random().nextInt((maxhit - minhit) + 1) + minhit;
                            int dano = new Random().nextInt((7 - 1) + 1) + 1;
                            int move = new Random().nextInt((5 - 3) + 1) + 3;
                            while ((ronda == 's' || ronda == 'S') && (vida > 0) && (metros > 0) && (balas > 0)) {
                                if (porcentaje <= 65) {
                                    porcentaje = new Random().nextInt((maxhit - minhit) + 1) + minhit;
                                    dano = new Random().nextInt((7 - 1) + 1) + 1;
                                    System.out.println();
                                    System.out.println("Hit! el tiro a reducido el hp del zombie por un total de " + dano);
                                    vida -= dano;
                                    if (vida < 0) {
                                        vida = 0;
                                        ronda = 's';
                                    }
                                    System.out.println();
                                    System.out.println("Vida restante del zombie " + vida);
                                    System.out.println();
                                    System.out.println("El zombie  se encuentra " + metros + " metros");
                                    balas--;
                                    System.out.println();
                                    System.out.println("El jugador cuenta con " + balas + " balas");
                                    System.out.println();
                                } else {
                                    porcentaje = new Random().nextInt((maxhit - minhit) + 1) + minhit;
                                    move = new Random().nextInt((5 - 3) + 1) + 3;
                                    metros -= move;
                                    if (metros < 0) {
                                        metros = 0;
                                    }
                                    balas--;
                                    System.out.println();
                                    System.out.println("Ha fallado! El zombie se encuentra a " + metros + "metros");
                                    System.out.println();
                                    System.out.println("El jugador cuenta con " + balas + " balas");
                                    System.out.println();
                                }
                                if ((vida > 0) && (metros > 0) && (balas > 0)) {
                                    System.out.println("Listo para la siguiente ronda? [S/N]");
                                    ronda = leer.next().charAt(0);
                                }
                                if (ronda != 's' && ronda != 'S') {
                                    System.out.println("Ha decidido salir del juego");
                                }
                            }
                            if (vida <= 0) {
                                System.out.println("Vida restante del zombie 0");
                                System.out.println("El zombie se encuentra a " + metros);
                                System.out.println("You win has logrado vencer al zombie");
                            } else if (balas == 0) {
                                System.out.println("Game over te quedaste sin balas");
                            } else if (metros == 0) {
                                System.out.println("Game over el zombie te atrapo");
                            }
                            break;

                        }
                        case 2: {
                            char ronda = 's';
                            int metros = new Random().nextInt((max - min) + 1) + min;
                            System.out.println("El zombie se encuentra a: " + metros + "metros!");
                            System.out.println("El jugador tiene " + balas + "balas!");
                            int porcentaje = new Random().nextInt((maxhit - minhit) + 1) + minhit;
                            int dano = new Random().nextInt((7 - 1) + 1) + 1;
                            int move = new Random().nextInt((5 - 3) + 1) + 3;
                            while ((ronda == 's' || ronda == 'S') && (vida > 0) && (metros > 0) && (balas > 0)) {
                                if (porcentaje <= 70) {
                                    porcentaje = new Random().nextInt((maxhit - minhit) + 1) + minhit;
                                    dano = new Random().nextInt((7 - 1) + 1) + 1;
                                    System.out.println();
                                    System.out.println("Hit! el tiro a reducido el hp del zombie por un total de " + dano);
                                    vida -= dano;
                                    if (vida < 0) {
                                        vida = 0;
                                        ronda = 's';
                                    }
                                    System.out.println();
                                    System.out.println("Vida restante del zombie " + vida);
                                    System.out.println();
                                    System.out.println("El zombie  se encuentra " + metros + " metros");
                                    balas--;
                                    System.out.println();
                                    System.out.println("El jugador cuenta con " + balas + " balas");
                                    System.out.println();
                                } else {
                                    porcentaje = new Random().nextInt((maxhit - minhit) + 1) + minhit;
                                    move = new Random().nextInt((5 - 3) + 1) + 3;
                                    metros -= move;
                                    if (metros < 0) {
                                        metros = 0;
                                    }
                                    balas--;
                                    System.out.println();
                                    System.out.println("Ha fallado! El zombie se encuentra a " + metros + "metros");
                                    System.out.println();
                                    System.out.println("El jugador cuenta con " + balas + " balas");
                                    System.out.println();
                                }
                                if (vida > 0) {
                                    System.out.println("Listo para la siguiente ronda? [S/N]");
                                    ronda = leer.next().charAt(0);
                                }
                                if (ronda != 's' && ronda != 'S') {
                                    System.out.println("Ha decidido salir del juego");
                                }
                            }
                            if ((vida > 0) && (metros > 0) && (balas > 0)) {
                                System.out.println("Vida restante del zombie 0");
                                System.out.println("El zombie se encuentra a " + metros);
                                System.out.println("You win has logrado vencer al zombie");
                            } else if (balas == 0) {
                                System.out.println("Game over te quedaste sin balas");
                            } else if (metros == 0) {
                                System.out.println("Game over el zombie te atrapo");
                            }
                        }
                        case 3: {
                            char ronda = 's';
                            int metros = new Random().nextInt((max - min) + 1) + min;
                            System.out.println("El zombie se encuentra a: " + metros + "metros!");
                            System.out.println("El jugador tiene " + balas + "balas!");
                            int porcentaje = new Random().nextInt((maxhit - minhit) + 1) + minhit;
                            int dano = new Random().nextInt((7 - 1) + 1) + 1;
                            int move = new Random().nextInt((5 - 3) + 1) + 3;
                            while ((ronda == 's' || ronda == 'S') && (vida > 0) && (metros > 0) && (balas > 0)) {
                                if (porcentaje <= 80) {
                                    porcentaje = new Random().nextInt((maxhit - minhit) + 1) + minhit;
                                    dano = new Random().nextInt((7 - 1) + 1) + 1;
                                    System.out.println();
                                    System.out.println("Hit! el tiro a reducido el hp del zombie por un total de " + dano);
                                    vida -= dano;
                                    if (vida < 0) {
                                        vida = 0;
                                        ronda = 's';
                                    }
                                    System.out.println();
                                    System.out.println("Vida restante del zombie " + vida);
                                    System.out.println();
                                    System.out.println("El zombie  se encuentra " + metros + " metros");
                                    balas--;
                                    System.out.println();
                                    System.out.println("El jugador cuenta con " + balas + " balas");
                                    System.out.println();
                                } else {
                                    porcentaje = new Random().nextInt((maxhit - minhit) + 1) + minhit;
                                    move = new Random().nextInt((5 - 3) + 1) + 3;
                                    metros -= move;
                                    if (metros < 0) {
                                        metros = 0;
                                    }
                                    balas--;
                                    System.out.println();
                                    System.out.println("Ha fallado! El zombie se encuentra a " + metros + "metros");
                                    System.out.println();
                                    System.out.println("El jugador cuenta con " + balas + " balas");
                                    System.out.println();
                                }
                                if (vida > 0) {
                                    System.out.println("Listo para la siguiente ronda? [S/N]");
                                    ronda = leer.next().charAt(0);
                                }
                                if (ronda != 's' && ronda != 'S') {
                                    System.out.println("Ha decidido salir del juego");
                                }
                            }
                            if ((vida > 0) && (metros > 0) && (balas > 0)) {
                                System.out.println("Vida restante del zombie 0");
                                System.out.println("El zombie se encuentra a " + metros);
                                System.out.println("You win has logrado vencer al zombie");
                            } else if (balas == 0) {
                                System.out.println("Game over te quedaste sin balas");
                            } else if (metros == 0) {
                                System.out.println("Game over el zombie te atrapo");
                            }
                        }
                    }
                }
                case 2:
                    trifuerza();
                    break;
            }
            System.out.println("***** M E N U *****");
            System.out.println("1. Fight or Flight");
            System.out.println("2. Tri Fuerza");
            System.out.println("3. Salir del programa");
            opcion = leer.nextInt();
        }
    }

    public static void trifuerza() {
        System.out.println("Ingrese un numero que sea positivo y mayor a 20");
        int num = leer.nextInt();
        while ((num < 20 || num < 0 || num % 4 == 0)) {
            System.out.println("Ingrese un numero en el rango");
            num = leer.nextInt();
        }
        for (int i = 0; i <= num/2; i++) {
            for (int j = 0; j <=num-2; j++) {
                if(num/2<i||num/2<j){
                    System.out.print("*");
                }else if(i+j>num/2||i+j>=num/2){
                    System.out.print("*");
                }else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
