package boletin1;

/*
Ejercicio 5
Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
de un color diferente
*/


public class T1E5 { // Clase principal
  public static void main(String[] args) {
  String rojo = "\033[31m"; // PROG
  String verde = "\033[32m"; // BD
  String naranja = "\033[33m"; // SI
  String azul = "\033[34m"; // FOL
  String morado = "\033[35m"; //ED
  String blanco = "\033[37m"; 
  String amarillo = "\u001B[43m"; // LMARC
  String reset = "\u001B[0m";

  System.out.println("   HORARIO"+"\tLUNES\t"+"MARTES\t"+"MIERC.\t"+"JUEVES\t"+"VIERNES");
  System.out.println("08:00 a 09:00\t"+rojo+" PROG"+"\t PROG"+"\t BD"+"\t SI"+"\t FOL");
  System.out.println("09:00 a 10:00\t"+" PROG"+"\t PROG"+"\t BD"+"\t SI"+"\t LMARC");
  System.out.println("10:00 a 11:00"+"\t PROG"+"\t PROG"+"\t BD"+"\t ED"+"\t LMARC");
  System.out.println("11:00 a 11:30"+"\t RECRE"+"\t RECRE"+"\t RECRE"+"\t RECRE"+"\t RECRE");
  System.out.println("11:30 a 12:30"+"\t ED"+"\t BD"+"\t SI"+"\t PROG"+"\t SI");
  System.out.println("12:30 a 13:30\t"+" ED"+"\t BD"+"\t SI"+"\t LMARC"+"\t SI");
  System.out.println("13:30 a 14:30"+"\t FOL"+"\t BD"+"\t FOL"+"\t LMARC"+"\t PROG");
  }
}

