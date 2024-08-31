
import  java.util.Scanner;
public class Main {
    static Scanner scanner=new Scanner (System.in);
    public static void main(String[] args) {
        int opcion = 0;
        do {
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
            System.out.println("Dígite una opción del Menú Principal   ");
            opcion = scanner.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("-----------------------------------------------------------------      ");
                    System.out.println("Datos  Primitivos                                                      ");
                    System.out.println("Tipos de Datos primitivos -seleccione una opciÓn                       ");
                    System.out.println("a.  byte   --- si quieres ver la explicación digite la opción 100      ");
                    System.out.println("b.  short  --- si quieres ver la explicación digite la opción 200      ");
                    System.out.println("c.  int    --- si quieres ver la explicación digite la opción 300      ");
                    System.out.println("d.  long   --- si quieres ver la explicación digite la opción 400      ");
                    System.out.println("e.  float  --- si quieres ver la explicación digite la opción 500      ");
                    System.out.println("f.  double --- si quieres ver la explicación digite la opción 600      ");
                    System.out.println("g.  char   --- si quieres ver la explicación digite la opción 700      ");
                    System.out.println("h.  boolean--- si quieres ver la explicación digite la opción 800      ");
                    System.out.println("0.  SALIR                                                              ");
                    System.out.println("-----------------------------------------------------------------      ");
                    break;
                case 100:
                    System.out.println("--------------------------------------------------------------------   ");
                    System.out.println("1      Datos  Primitivos                                               ");
                    System.out.println("100    Datos  Primitivos    a.       'byte'                            ");
                    System.out.println("       Descripcion  es utilizado para datos pequeños y                 ");
                    System.out.println("       optimización de memoria en arrays grandes.                      ");
                    System.out.println("       Representa un tipo de dato de 8 bits con signo.                 ");
                    System.out.println("       Tamaño (bytes)    es  1                                         ");
                    System.out.println("       Rango  va  entre  -128 a 127                                    ");
                    System.out.println("              Ejemplo   'byte edad =  25'                              ");
                    System.out.println("--------------------------------------------------------------------   ");
                    break;
                case 200:
                    System.out.println("--------------------------------------------------------------------   ");
                    System.out.println(" 1     Datos  Primitivos                                               ");
                    System.out.println(" 200   Datos  Primitivos    b.       'short'                           ");
                    System.out.println("        Descripcion  es útil para datos numéricos más                  ");
                    System.out.println("        grandes que  'byte' pero aún pequeños.                         ");
                    System.out.println("        Representa un tipo de dato de 16 bits con signo.               ");
                    System.out.println("        Algunas de las aplicaciones del tipo short son:                ");
                    System.out.println("        --Para representar valores que no necesitan mucha              ");
                    System.out.println("        precisión  y que están dentro del rango permitido              ");
                    System.out.println("        --También se utilizan para ahorrar espacio en matrices         ");
                    System.out.println("        -- que contienen muchos valores enteros pequeños.              ");
                    System.out.println("        * Tamaño (bytes)    es  2                                      ");
                    System.out.println("        De esta manera almacena valores numéricos                      ");
                    System.out.println("                Rango  va  entre  -32,768 a 32,767                     ");
                    System.out.println("                Ejemplo   short año =  2024;                           ");
                    System.out.println("                Ejemplo   short temperatura =  -10 ;                   ");
                    System.out.println("                Ejemplo   short  numero de la habitacion =  105;       ");
                    System.out.println("--------------------------------------------------------------------   ");
                    break;
                case 300:
                    System.out.println("--------------------------------------------------------------------   ");
                    System.out.println("  1     Datos  Primitivos                                              ");
                    System.out.println("  300   Datos  Primitivos    c.       'int'                            ");
                    System.out.println("        Descripcion  es utilizado para para números enteros            ");
                    System.out.println("        Algunas de las aplicaciones del tipo de dato int son:          ");
                    System.out.println("        **Para programar contadores y variables de control  en         ");
                    System.out.println("        ciclos(bucles) y estructuras de control de flujo del programa  ");
                    System.out.println("        **En otra aplicación, son utilizados como valores numéricos en ");
                    System.out.println("        cálculos  matemáticos y operaciones aritméticas.               ");
                    System.out.println("        * Es un tipo de dato de 32 bits con signo para almacenar valores");
                    System.out.println("        numéricos                                                      ");
                    System.out.println("        * Tamaño (bytes)    es  4                                      ");
                    System.out.println("                Rango  -2.147.483.648 a 2.147.483.647 en valor decimal ");
                    System.out.println("                Ejemplo   int numeroEntero = 100;                      ");
                    System.out.println("                Ejemplo   int salario = 500000;                        ");
                    System.out.println("--------------------------------------------------------------------   ");
                    break;
                case 400:
                    System.out.println("--------------------------------------------------------------------   ");
                    System.out.println(" 1     Datos  Primitivos                                               ");
                    System.out.println(" 400   Datos  Primitivos    d.       long                              ");
                    System.out.println("       Descripcion  es utilizado para para números enteros             ");
                    System.out.println("       muy grandes                                                     ");
                    System.out.println("       Algunas de las aplicaciones del tipo de dato long son:          ");
                    System.out.println("       Para medir el tiempo cuando la cantidad de dígitos es amplia,   ");
                    System.out.println("       como al añadir milisegundos, segundos, minutos, horas, días     ");
                    System.out.println("       Otra aplicación es para cálculos matemáticos que requieren una  ");
                    System.out.println("       precisión, como en problemas de física, ingenieria o matemáticas");
                    System.out.println("       * Es un tipo de dato de 64 bits con signo para almacenar valores");
                    System.out.println("        numéricos                                                      ");
                    System.out.println("       * Tamaño (bytes)    es  8                                       ");
                    System.out.println("                Rango  va  entre  -9223372036854775808                 ");
                    System.out.println("                 y 9223372036854775808                                 ");
                    System.out.println("                Ejemplo1   long distancia= 15000000000000000000000;    ");
                    System.out.println("                Ejemplo2   long numeroLargo = 999999999;               ");
                    System.out.println("                Ejemplo3    población mundial =4899999999999;          ");
                    System.out.println("--------------------------------------------------------------------   ");
                    break;
                case 500:
                    System.out.println("--------------------------------------------------------------------   ");
                    System.out.println(" 1     Datos  Primitivos                                               ");
                    System.out.println(" 500   Datos  Primitivos    e.     float                               ");
                    System.out.println("       Descripción son  numeros  en como flotante de precisión simple  ");
                    System.out.println("       Algunas de las aplicaciones del tipo de dato  float  son:       ");
                    System.out.println("       -Para representar números con decimales, como la altura de una  ");
                    System.out.println("       persona,la temperatura de un ambiente,el precio de un producto  ");
                    System.out.println("       -También se utilizan para cálculos matemáticos que involucran   ");
                    System.out.println("       números con decimales,como problemas de física, ingeniería o    ");
                    System.out.println("       matemáticas.                                                    ");
                    System.out.println("       Es un tipo dato para almacenar números en coma flotante con     ");
                    System.out.println("       precisión simple de 32 bits.                                    ");
                    System.out.println("       * Tamaño (bytes)    es  4                                       ");
                    System.out.println("               Rango  va  entre  1.4e-45 a 3.4e38 en valor decimal     ");
                    System.out.println("               Ejemplo1:   'float precio = 19.99f; '                   ");
                    System.out.println("               Ejemplo2:    float numeroFlotante = 3.1416f;            ");
                    System.out.println("--------------------------------------------------------------------   ");
                    break;
                case 600:
                    System.out.println("--------------------------------------------------------------------   ");
                    System.out.println("1     Datos  Primitivos                                                ");
                    System.out.println("600   Datos  Primitivos    f.      double                              ");
                    System.out.println("      Descripción son  numeros  en como flotante de precisión          ");
                    System.out.println("      doble precisión.                                                 ");
                    System.out.println("      Algunas de las aplicaciones del tipo de dato double son:         ");
                    System.out.println("      -Se emplean para representar números con decimales con una alta  ");
                    System.out.println("      precisión,como en cálculos financieros, científicos,de ingeniería");
                    System.out.println("      -También se utilizan para almacenar grandes cantidades de datos en");
                    System.out.println("      una matriz o estructura de datos, así como en la manipulación de ");
                    System.out.println("      grandes conjuntos de datos.                                      ");
                    System.out.println("      - También se utilizan en la geolocalización para almacenar las   ");
                    System.out.println("      coordenadas de la latitud y longitud de un lugar en un sistema,  ");
                    System.out.println("      como en una aplicación de mapas                                  ");
                    System.out.println("      *   Tamaño (bytes)    es  8                                      ");
                    System.out.println("                Rango  va  entre  4.9e-324 a 1.8e308 en valor decimal  ");
                    System.out.println("                Ejemplo1:   'double pi = 3.141592653589793;'           ");
                    System.out.println("--------------------------------------------------------------------   ");
                    break;
                case 700:
                    System.out.println("--------------------------------------------------------------------   ");
                    System.out.println("1    Datos  Primitivos                                                 ");
                    System.out.println("700   Datos  Primitivos    g.      char                                ");
                    System.out.println("      Descripcion  Almacena valores de verdad.                         ");
                    System.out.println("      se representan con caracteres individuales,como letras y símbolos");
                    System.out.println("      Algunas de las aplicaciones del tipo de dato char  son:          ");
                    System.out.println("      - Se emplean en la entrada y salida de datos para representar    ");
                    System.out.println("      caracteres,como letras, números y signos de puntuación, y con    ");
                    System.out.println("      ello formar otro tipo de datos en cadena.                        ");
                    System.out.println("      * Tamaño (bytes)    es  2                                        ");
                    System.out.println("      Rango  va entre 0 a 65.535 en valor decimal (caracteres Unicode) ");
                    System.out.println("             Ejemplo1:   'char inicial =  'A';'                        ");
                    System.out.println("             Ejemplo2:   char b = 'b';                                 ");
                    System.out.println("--------------------------------------------------------------------   ");
                    break;
                case 800:
                    System.out.println("--------------------------------------------------------------------   ");
                    System.out.println(" 1    Datos  Primitivos                                                ");
                    System.out.println(" 800  Datos  Primitivos    h.      boolean                             ");
                    System.out.println("      Descripcion  Almacena valores  de verdad                         ");
                    System.out.println("      El tipo de datos boolean se utiliza para almacenar un valor de   ");
                    System.out.println("      verdadero o falso, que representa el resultado de una expresión  ");
                    System.out.println("      lógica.                                                          ");
                    System.out.println("      Algunas de las aplicaciones del tipo de dato boolean son:        ");
                    System.out.println("      -Para representar el resultado de la toma de decisiones en un    ");
                    System.out.println("      programa; estos valores son el resultado de una expresión lógica,");
                    System.out.println("      como una comparación una operación booleana de tipo AND,OR,NOT,etc");
                    System.out.println("      -También se emplean en la programación condicional para controlar");
                    System.out.println("      el flujo de ejecución del programa en estructuras condicionales  ");
                    System.out.println("      como if-else, while, do-while, etc.                              ");
                    System.out.println("      -Otra aplicación es la validación de datos para verificar si los ");
                    System.out.println("       datos ingresados por el usuario son válidos o no.               ");
                    System.out.println("       * Tamaño (bytes)   es  1 bit ( dependiendo de la JVM)          ");
                    System.out.println("       * Tienen un valor de true o false.                               ");
                    System.out.println("                Ejemplo1:    boolean esVerdadero = true;               ");
                    System.out.println("                Ejemplo2:    boolean esMayorDeEdad  =true;             ");
                    System.out.println("--------------------------------------------------------------------   ");
                    break;

                default:
                    System.out.println(" ********************************************************************");
                    System.out.println(" *                                                                  *");
                    System.out.println(" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                    System.out.println(" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                    System.out.println(" *                                                                  *");
                    System.out.println(" ********************************************************************");
            }
            } while (opcion != 0);


    }
}


