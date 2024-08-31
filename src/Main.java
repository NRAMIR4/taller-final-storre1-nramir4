import  java.util.Scanner;
import  java.util.Scanner;
public class Main {
    static Scanner scanner=new Scanner (System.in);//scanner permite  ingresar valores por consola , con esta permite crear un objeto
    public static void main(String[] args) {
        int opcion = 0; //se declara la variable
            do {  // se escogio proque es para  repetir un ciclo al menos una vez y que encuentra una condicion
                System.out.println("                                                                       ");
                System.out.println("***********************************************************************");
                System.out.println("*                 MENÚ CAPITULO DE PROGRAMACIÓN                       *");
                System.out.println("*                 SILVIA PAOLA TORRES Y NANCY RAMIREZ                 *");
                System.out.println("*                 USUARIOS STORRE1      NRAMIR4                       *");
                System.out.println("*-------------------------------------------------------------------- *");
                System.out.println("*                1.    Datos  Primitivos                              *");
                System.out.println("*                2.    String                                         *");
                System.out.println("*                3.    Constante                                      *");
                System.out.println("*                4.    Tipos de operadores                            *");
                System.out.println("*                5.    Condicional   IF,  ELSE IF, ELSE               *");
                System.out.println("*                6.    Condicional   Switch                           *");
                System.out.println("*                7.    Condicional   Ternaria                         *");
                System.out.println("*                8.    Bucle  DO  WHILE                               *");
                System.out.println("*                9.    Bucle  WHILE                                   *");
                System.out.println("*                10.   Bucle  FOR                                     *");
                System.out.println("*                0.    Salir                                          *");
                System.out.println("***********************************************************************");
                System.out.println("Dígite una opción del Menú Principal   ");//  se coloca para que el usuario  digite el valor en la pantalla
                opcion=scanner.nextInt();

                switch(opcion) {

                    case 2:
                        System.out.println("--------------------------------------------------------------------     ");
                        System.out.println("2  String                                                                ");
                        System.out.println("   Descripcion En Java, los String son un objeto el cual nos permite      ");
                        System.out.println("   almacenar muchos caracteres.                                           ");
                        System.out.println("   Un objeto String representa una cadena alfanumérica de un valor        ");
                        System.out.println("   constante que no puede ser cambiada después de haber sido creada.      ");
                        System.out.println("   y se utiliza en aplicaciones para almacenar y manipular texto         ");
                        System.out.println("   En Java,una cadena de texto se define utilizando comillas dobles      ");
                        System.out.println("   alrededor del texto.                                                  ");
                        System.out.println("   Ejem.1 String mensaje= Hola Mundo;//Usado comillas dobles para iniciar");
                        System.out.println("   Ejem.2 String nombre= new String (Mario);//Usando el constructor de String");
                        System.out.println("   Ejem.3 String nombre= Hola + nombre;//Resultado: mensaje= Hola Mario   ");
                        System.out.println("--------------------------------------------------------------------      ");
                        break;
                    case 3:
                        System.out.println("--------------------------------------------------------------------   ");
                        System.out.println("3    Constantes                                                        ");
                        System.out.println("     Descripcion En Java, una constante  es  un valor  que no cambia   ");
                        System.out.println("     durante la ejecución del programa.                                ");
                        System.out.println("     Las constantes se utilizan para representar valores fijos y de    ");
                        System.out.println("     lectura fijosy de lectura única,lo que ayuda a que el código sea  ");
                        System.out.println("     más legible y menos propenso a errores.                           ");
                        System.out.println("     Las contantes en Java se declaran usando la palabra clave final   ");
                        System.out.println("     Ejemplo1  final int VALUE = 54;                                   ");
                        System.out.println("     Ejemplo2  public static final int TIEMPO_ESPERA_CONEXION  = 50;   ");
                        System.out.println("     Ejemplo3  public static final boolean MODO_DEPURACION  = true;    ");
                        System.out.println("--------------------------------------------------------------------   ");
                        break;
                    case 4:
                        System.out.println("---------------------------------------------------------------------  ");
                        System.out.println("4.   Tipos de operadores                                               ");
                        System.out.println("     Tipos de operadores -seleccione una opción                        ");
                        System.out.println("---------------------------------------------------------------------  ");
                        System.out.println("   401 Operador    - si quieres ver la explicación digite la opción 401");
                        System.out.println("   402 Aritméticos - si quieres ver la explicación digite la opción 402");
                        System.out.println("   403 Relacionales- si quieres ver la explicación digite la opción 403");
                        System.out.println("   404 Lógicos     - si quieres ver la explicación digite la opcion 404");
                        System.out.println("   405 Asignación  - si quieres ver la explicación digite la opcion 405");
                        System.out.println("   406 Incremento/Decremento-si quieres ver la explicación dale la opcion 406");
                        System.out.println("-----------------------------------------------------------------------");
                        break;
                    case 401:
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("4    Tipos de operadores                                               ");
                        System.out.println("401  Operador                                                          ");
                        System.out.println("     Descripcion ¿Qué es operador?                                     ");
                        System.out.println("     En programación un operador representa un símbolo que permite     ");
                        System.out.println("     realizar operaciones aritméticas, relacionar elementos            ");
                        System.out.println("     o hacer preguntas donde se involucra más de una condición.        ");
                        System.out.println("     Los Operadores en JAVA presentan los símbolos de los operadores   ");
                        System.out.println("     que se utilizan enel lenguaje de programación JAVA                ");
                        System.out.println("     Existen los siguientes  tipos de operadores:                      ");
                        System.out.println("     Aritméticos,Relacionales y Lógicos.                               ");
                        System.out.println("-------------------------------------------------------------------    ");
                        break;
                    case 402:
                        System.out.println("---------------------------------------------------------------------- ");
                        System.out.println("4    Tipos de operadores                                               ");
                        System.out.println("402   Aritméticos                                                      ");
                        System.out.println("---------------------------------------------------------------------- ");
                        System.out.println("       Operador    +                                                   ");
                        System.out.println("           Ejemplo int  suma =5 + 3;                                   ");
                        System.out.println("           Detalle  Suma  dos operadores . Resultado : 8               ");
                        System.out.println("---------------------------------------------------------------------  ");
                        System.out.println("       Operador    -                                                   ");
                        System.out.println("           Ejemplo int resta   =5 - 3;                                 ");
                        System.out.println("           Detalle  Resta el segundo operador del primero. Resultado :2");
                        System.out.println("---------------------------------------------------------------------  ");
                        System.out.println("       Operador    *                                                   ");
                        System.out.println("           Ejemplo int  multiplicacion    =5 * 3;                      ");
                        System.out.println("           Multiplica dos operadores . Resultado 15                    ");
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("       Operador    /                                                   ");
                        System.out.println("           Ejemplo int   divisionn    =6 * 3;                          ");
                        System.out.println("           Divide el primer operando por el segundo . Resultado 15     ");
                        System.out.println("--------------------------------------------------------------------   ");
                        System.out.println("      Operador    %   --porcentaje--                                   ");
                        System.out.println("       Ejemplo int  modulo    =5 % 3;                                  ");
                        System.out.println("       Devuelve el resto de la division del primer operando por el segundo");
                        System.out.println("       Resultado 2                                                     ");
                        System.out.println("---------------------------------------------------------------------  ");
                        break;
                    case 403:
                        System.out.println("---------------------------------------------------------------------- ");
                        System.out.println("4    Tipos de operadores                                               ");
                        System.out.println("---------------------------------------------------------------------- ");
                        System.out.println("403  Relacionales                                                      ");
                        System.out.println("     Operador   ==                                                     ");
                        System.out.println("       Ejemplo boolean esIgual =(5 == 3);                              ");
                        System.out.println("       Detalle  Comprueba  si los valores de dos operadores son iguales");
                        System.out.println("       Resultado : false                                               ");
                        System.out.println("---------------------------------------------------------------------- ");
                        System.out.println("     Operador    !=                                                    ");
                        System.out.println("      Ejemplo boolean noesIgual =(5 != 3);                             ");
                        System.out.println("      Detalle  Comprueba  si los valores de dos operadores  no son iguales");
                        System.out.println("      Resultado :  true                                                ");
                        System.out.println("---------------------------------------------------------------------- ");
                        System.out.println("     Operador    >                                                     ");
                        System.out.println("      Ejemplo boolean mayor =(5 >3);                                   ");
                        System.out.println("      Detalle  Comprueba  si el primer operador  es mayor que el segundo");
                        System.out.println("      Resultado :  true                                                ");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("     Operador    <                                                      ");
                        System.out.println("       Ejemplo boolean menos=(5 <3);                                    ");
                        System.out.println("       Detalle  Comprueba  si el primer operador  es menor que el segundo");
                        System.out.println("       Resultado :  false                                               ");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("     Operador    >=                                                     ");
                        System.out.println("       Ejemplo boolean mayorOIgual =(5 >=3);                            ");
                        System.out.println("        Detalle  Comprueba  si el primer operador  es mayor que el      ");
                        System.out.println("        segundo o igual  que el segundo                                 ");
                        System.out.println("        Resultado :  true                                               ");
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("     Operador    <=                                                     ");
                        System.out.println("       Ejemplo boolean menos=(5 <=3);                                   ");
                        System.out.println("       Detalle Comprueba si el primer operador es menor o igual que el segundo");
                        System.out.println("       Resultado :  false                                               ");
                        System.out.println("----------------------------------------------------------------------- ");
                        break;
                    case 404:
                        System.out.println("----------------------------------------------------------------------  ");
                        System.out.println("4   Tipos de operadores                                                 ");
                        System.out.println("404 Lógicos                                                             ");
                        System.out.println("----------------------------------------------------------------------  ");
                        System.out.println("    Operador   &&                                                       ");
                        System.out.println("     Ejemplo boolean  resultado =(5> 3 &&  3< 4);                       ");
                        System.out.println("     Detalle  Devuelve true  si ambos  son true                         ");
                        System.out.println("     Resultado : true                                                   ");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("    Operador   ||                                                       ");
                        System.out.println("     Ejemplo boolean  resultado =(5> 3||  3< 4);                        ");
                        System.out.println("     Detalle  Devuelve true  si al menos una de ellas  es true          ");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("    Operador   !                                                        ");
                        System.out.println("      Ejemplo boolean  resultado = !(5> 3);                             ");
                        System.out.println("      Detalle  Devuelve el valor de un  operando booleano.              ");
                        System.out.println("      Resultado :  false                                                ");
                        System.out.println("----------------------------------------------------------------------- ");
                        break;
                    case 405:
                        System.out.println("----------------------------------------------------------------------  ");
                        System.out.println("4   Tipos de operadores                                                 ");
                        System.out.println("405 Asignación                                                          ");
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("    Operador   =                                                        ");
                        System.out.println("      Ejemplo  int a=5;                                                 ");
                        System.out.println("      Detalle  Asigna el valor del operando derecho al operando izquierdo");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("    Operador   +=                                                       ");
                        System.out.println("     Ejemplo  int a=5;  a +=3;                                          ");
                        System.out.println("     Suma el operando derecho al operando izquierdo y asigna el         ");
                        System.out.println("     resultado al operando izquierdo .    Resultado :  8                ");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("    Operador   -=                                                       ");
                        System.out.println("     Ejemplo  int a=5;  a -= 3;                                         ");
                        System.out.println("     Resta el  operando derecho al operando izquierdo y asigna el       ");
                        System.out.println("     resultado al operando  izquierdo.      Resultado :  2                                                            ");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("    Operador   *=                                                       ");
                        System.out.println("     Ejemplo  int a=5;  a *= 3;                                         ");
                        System.out.println("     Multiplica el operando derecho por el operando izquierdo y asigna  ");
                        System.out.println("     el resultado al operando  izquierdo.   Resultado :  15             ");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("    Operador   /=                                                       ");
                        System.out.println("     Ejemplo  int a=6;  a /= 3;                                         ");
                        System.out.println("     Divide el operando  izquierdo por el operando derecho y asigna     ");
                        System.out.println("     el resultado al operando  izquierdo.   Resultado :  2              ");
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("    Operador   %=                                                       ");
                        System.out.println("     Ejemplo  int a=5;  a %= 3;                                         ");
                        System.out.println("     Calcula el módulo del operando izquierdo por el operando derecho y ");
                        System.out.println("     asigna el resultado al operando  izquierdo.     Resultado :  2     ");
                        System.out.println("----------------------------------------------------------------------- ");
                        break;
                    case 406:
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("4    Tipos de operadores                                                ");
                        System.out.println("406  Incremento/Decremento                                              ");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("     Operador  ++                                                       ");
                        System.out.println("      Ejemplo  int a=5;  a++;                                           ");
                        System.out.println("      Detalle  Incrementa el valor del operando en 1                    ");
                        System.out.println("      Resultado :  6                                                    ");
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("     Operador  --                                                       ");
                        System.out.println("      Ejemplo  int a=5;  a--;                                           ");
                        System.out.println("      Detalle  Decrementa el valor del operando en 1                    ");
                        System.out.println("      Resultado :  4                                                    ");
                        System.out.println("------------------------------------------------------------------------");
                        break;
                    case 0:
                        break;

                }

            }while (opcion !=0);//  si ya no se cumple  la condicion se detiene  por eso se coloca cero


    }
}

