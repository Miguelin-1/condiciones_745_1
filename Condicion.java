import java.util.Scanner;

class Condicion {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String nombre;
    int mes_u;
    int ano_u;
    int dia_u;
    int mes_a=8;
    int ano_a=2024;
    int dia_a=23;
    int edad1;
    int edad2;
    System.out.println("Ingrese su nombre");
    nombre = leer.next();
    System.out.println(nombre+"Ingrese el numero de su mes de nacimiento");
    mes_u = leer.nextInt();
    System.out.println(nombre+"Ingrese el año de su nacimiento");
    ano_u = leer.nextInt();
    edad1=ano_a-ano_u;
    if(mes_u>mes_a)
    {
    edad2=edad1-1;
    System.out.println(nombre+"su edad es: "+edad2);
}
 else
   {
   System.out.println(nombre+"su edad es: "+edad1);

}



     }
}
