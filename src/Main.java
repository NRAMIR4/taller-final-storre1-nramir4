import  java.util.Scanner;
public class Main {
    static Scanner scanner=new Scanner (System.in);//scanner permite  ingresar valores por consola,con esta permite crear un objeto
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
                    case 5:
                        System.out.println("------------------------------------------------------------------------     ");
                        System.out.println("5   Condicional IF, ELSE IF, ELSE                                            ");
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("5 Tipos de Condicional                                                       ");
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("501 Condicional IF     -si quieres ver la explicación digite la opcion    501");
                        System.out.println("502 Condicional ELSE IF-si quieres ver la explicación digite la opcion    502");
                        System.out.println("503 Condicional ELSE   -si quieres ver la explicación digite la opcion    503");
                        System.out.println("504 PROGRAMA DE CONDICIONAL IF,ELSE IF,ELSE si quieres ejecutarlo  digite 504");
                        System.out.println("-----------------------------------------------------------------------------");
                        break;
                    case 501:
                        System.out.println("----------------------------------------------------------------------  ");
                        System.out.println("5    Condicional  IF, ELSE IF, ELSE                                     ");
                        System.out.println("501  Condicional   IF                                                   ");
                        System.out.println("----------------------------------------------------------------------  ");
                        System.out.println("     Descripcion El condicional IF se puede utilizar sin el else.       ");
                        System.out.println("     Ejemplo  Si se solicita un programa en el que se diga ÚNICAMENTE   ");
                        System.out.println("     si una persona tiene sobrepeso de acuerdo a su indice de masa corporal,");
                        System.out.println("     se utilizaría el IF sin colocar la parte del else.                 ");
                        System.out.println("     if (condición ) {     //instrucciones para el caso verdadero - IF  ");
                        System.out.println("           Ejemplo1                                                     ");
                        System.out.println("           int peso =20;                                                ");
                        System.out.println("           if (peso >=18); {                                            ");
                        System.out.println("           System.out.println(entre comillas Tu peso esentre comillas   ");
                        System.out.println("           }                                                            ");
                        System.out.println("------------------------------------------------------------------------");
                        break;
                    case 502:
                        System.out.println("----------------------------------------------------------------------  ");
                        System.out.println("5    Condicional  IF, ELSE IF , ELSE                                    ");
                        System.out.println("502  Condicional    ELSE  IF                                            ");
                        System.out.println("----------------------------------------------------------------------  ");
                        System.out.println("     Descripcion En el condicional IF se tiene una condición central    ");
                        System.out.println("     que arroja como resultado verdadero o falso.                       ");
                        System.out.println("     Para cada resultado se puede realizar una acción diferente.        ");
                        System.out.println("     Ejemplo1 if (condición ) { //instrucciones para el caso verdadero - IF");
                        System.out.println("                 } else  {     //instrucciones para el caso falso-ELSE  ");
                        System.out.println("                 }                                                      ");
                        System.out.println("     Ejemplo2                                                           ");
                        System.out.println("                int nota =12;                                           ");
                        System.out.println("                if (nota >=30;  {                                       ");
                        System.out.println("                System.out.println(Paso la materia)                     ");
                        System.out.println("               }  else                                                  ");
                        System.out.println("                System.out.println(Perdio la materia)                   ");
                        System.out.println("               }                                                        ");
                        System.out.println("---------------------------------------------------------------------   ");
                        break;
                    case 503:
                        System.out.println("---------------------------------------------------------------------   ");
                        System.out.println(" 5    Condicional  IF, ELSE IF , ELSE                                   ");
                        System.out.println(" 503  Condicional  ELSE                                                 ");
                        System.out.println("----------------------------------------------------------------------- ");
                        System.out.println("    La cláusula else (no obligatoria) sirve para indicar instrucciones a");
                        System.out.println("    realizar en caso de no cumplirse la condición. Java admite escribir un else");
                        System.out.println("    y dejarlo vacío: else { }.El else vacío se interpreta como que contemplamos");
                        System.out.println("    el caso pero no hacemos nada en respuesta a él.                     ");
                        System.out.println("    Ejemplo  incluyendo el Else  en Un IF anidado                       ");
                        System.out.println("    Si en una condición se requiere hacer más de una pregunta se puede  ");
                        System.out.println("    e utilizar un IF anidado                                            ");
                        System.out.println("      if (condición ) {                                                 ");
                        System.out.println("             //instrucciones para el caso verdadero - IF                ");
                        System.out.println("              } else {                                                  ");
                        System.out.println("           if (condición ) {                                            ");
                        System.out.println("             //instrucciones para el caso verdadero - IF                ");
                        System.out.println("            } else {                                                    ");
                        System.out.println("           //instrucciones para el caso falso - ELSE                    ");
                        System.out.println("             }                                                          ");
                        System.out.println("           }                                                            ");
                        System.out.println("             int temperatura=39;                                        ");
                        System.out.println("             if (temperatura<=36 ) {                                    ");
                        System.out.println("            System.out.println(“Temperatura normal”);                   ");
                        System.out.println("          } else {                                                      ");
                        System.out.println("           if (temperatura>36 && temperatura<39) {                      ");
                        System.out.println("         System.out.println(“Tenga cuidado”);                           ");
                        System.out.println("         } else {                                                       ");
                        System.out.println("         System.out.println(“OJO tiene fiebre”);                        ");
                        System.out.println("          }                                                             ");
                        System.out.println("          }                                                             ");
                        System.out.println("----------------------------------------------------------------------  ");
                        break;
                    case 504:
                        System.out.println("----------------------------------------------------------------------  ");
                        System.out.println("504 PROGRAMA  DE  CONDICIONAL IF, ELSE IF ELSE                          ");
                        System.out.println("----------------------------------------------------------------------  ");
                        Scanner scannerEdad = new Scanner (System.in);
                        System.out.println("Ingrese su edad:   ");
                        int edad=scannerEdad.nextInt();
                        System.out.println(edad);
                        if (edad <= 12){
                            System.out.println("su edad es entre 0 a 12 años eres un niño");
                        } else if  (edad<=20){
                            System.out.println("su edad 13 a 20 años eres un joven");
                        } else if (edad<=60){
                            System.out.println("su edad 21 a 60 años eres un adulto");
                        } if (edad>61){
                        System.out.println("su edad  es mayor a 61 eres de la tercera edad");
                    } else {
                    }
                        break;
                    case 6:
                        System.out.println("-------------------------------------------------------------------------- ");
                        System.out.println("601 Condicional SWITCH-- si quieres ver la explicación digite la opcion 601");
                        System.out.println("602 PROGRAMA SWITCH   -- si quieres  ejecutarlo  digite la opcion 602      ");
                        System.out.println("-------------------------------------------------------------------------- ");
                        break;
                    case 601:
                        System.out.println("-------------------------------------------------------------------------  ");
                        System.out.println("601  Condicional SWITCH                                                    ");
                        System.out.println("     Descripcion Cuando se requiere comparar una variable con una serie    ");
                        System.out.println("     valores diferentes, esta indican los posibles valores que puede tomar ");
                        System.out.println("     la variable y las sentencias que se tienen que ejecutar sí es que la  ");
                        System.out.println("     variable coincide con alguno de dichos valores.                       ");
                        System.out.println("     Cada case ejecutará las sentencias correspondientes,con base en base  ");
                        System.out.println("     en el valor de la variable,que deberá de evaluarse con valores de     ");
                        System.out.println("     tipo byte,char,short o int                                            ");
                        System.out.println("     Si el valor de la variable no coincide con ningún valor, entonces se  ");
                        System.out.println("     ejecutan las sentencias por default, sí es que las hay.               ");
                        System.out.println("     La sentencia break al final de cada case transfiere el control al final");
                        System.out.println("     de la sentencia switch; de esta manera, cada vez que se ejecuta un    ");
                        System.out.println("     case todos los enunciados case restantes son ignorados y termina la   ");
                        System.out.println("     operación del switch                                                  ");
                        System.out.println("                Ejemplo1   switch( variable ){                             ");
                        System.out.println("                case valor1:                                               ");
                        System.out.println("                     sentencias;                                           ");
                        System.out.println("                break;                                                     ");
                        System.out.println("                case valor2:                                               ");
                        System.out.println("                     sentencias;                                           ");
                        System.out.println("                break;                                                     ");
                        System.out.println("                case valorN:                                               ");
                        System.out.println("                     sentencias;                                           ");
                        System.out.println("                break;                                                     ");
                        System.out.println("                default;                                                   ");
                        System.out.println("                     sentencias;                                           ");
                        System.out.println("               }                                                           ");
                        System.out.println("--------------------------------------------------------------------       ");
                        break;
                    case 602:
                        System.out.println("-------------------------------------------------------------------------- ");
                        System.out.println("602 PROGRAMA SWITCH                                                        ");
                        System.out.println("-------------------------------------------------------------------------- ");
                        Scanner scannerNota = new Scanner (System.in);
                        System.out.println("Ingrese su Nota del 1 al 10 número entero:   ");
                        int nota=scannerNota.nextInt();
                        System.out.println(nota);

                        switch (nota) {
                            case 1:
                            case 2:
                                System.out.println("Su calificacion es: F");
                                break;
                            case 3:
                            case 4:
                                System.out.println("Su calificación es: D");
                                break;
                            case 5:
                            case 6:
                                System.out.println("Su calificación es: C");
                                break;
                            case 7:
                            case 8:
                                System.out.println("Su calificación es: B");
                                break;
                            case 9:
                            case 10:
                                System.out.println("Su calificación es: A");
                                break;
                            default:
                                System.out.println("Número no valido, por favor verifique");
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("701  Condicion Ternaria -si quieres ver la explicación digite la opcion 701 ");
                        System.out.println("702  PROGRAMA  TERNARIA -si quieres  ejecutarlo  digite la opcion 702       ");
                        System.out.println("--------------------------------------------------------------------------- ");
                        break;
                    case 701:
                        System.out.println("--------------------------------------------------------------------------- ");
                        System.out.println("701  Condicion Ternaria                                                     ");
                        System.out.println("--------------------------------------------------------------------------- ");
                        System.out.println("    El operador ternario en Java es una construcción que permite tomar      ");
                        System.out.println("    decisiones basadas en una condición booleana de manera concisa en una   ");
                        System.out.println("    sola línea de código.                                                   ");
                        System.out.println("    Es una forma abreviada de expresar una estructura condicional if-else   ");
                        System.out.println("    Su estructura básica es: condición ? valor_si_verdadero : valor_si_falso;");
                        System.out.println("    Si la condición es verdadera, se devuelve el valor correspondiente a    ");
                        System.out.println("    entre comillas valor_si_verdadero entre comillas; de lo contrario, se   ");
                        System.out.println("    devuelve el valor asignado a entre comillas valor_si_falso entre comillas");
                        System.out.println("      Ejemplo  variable = ( condicion)? valor_si_verdadero : valor_si_falso; ");
                        System.out.println("      Ejemplo1                                                              ");
                        System.out.println("       int edad = 20;                                                        ");
                        System.out.println("       String status =( edad  >= 18) ? entre comillas Adulto entre comillas :");
                        System.out.println("                               Menor de edad entre comillas;                 ");
                        System.out.println("      System.out.println(entre comillas La persona es:entre comillas + status);");
                        System.out.println("      Ejemplo2                                                                ");
                        System.out.println("       int  numero = 15;                                                      ");
                        System.out.println("       String resultado =(numero % 2 == 0 ) ? entre comillas Par entre comillas:");
                        System.out.println("                                  entre comillas Impar entre comillas;        ");
                        System.out.println("    System.out.println(entre comillas El numero es:entre comillas + resultado);");
                        System.out.println("------------------------------------------------------------------------------");
                        break;
                    case 702:
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("702  PROGRAMA  TERNARIA                                                     ");
                        System.out.println("--------------------------------------------------------------------------- ");
                        Scanner scannerparimpar = new Scanner (System.in);
                        System.out.println("Ingrese el numero:   ");
                        int numerito = scannerparimpar.nextInt();
                        String resultado =( numerito % 2 == 0 ? " un numero par" : " un numero impar");
                        System.out.print("El numero     " + numerito  + " es " + resultado);
                        break;
                    case 0:
                        break;
                }

            }while (opcion !=0);//  si ya no se cumple  la condicion se detiene  por eso se coloca cero
            System.out.println ("  ****************************************** ");
            System.out.println ("  *                                        * ");
            System.out.println ("  *                                        * ");
            System.out.println ("  *   USTED HA SALIDO DEL MENÚ PRINCIPAL   * ");
            System.out.println ("  *        GRACIAS POR SU VISITA           * ");
            System.out.println ("  *                                        * ");
            System.out.println ("  *                                        * ");
            System.out.println ("  *               --*--                    * ");
            System.out.println ("  ****************************************** ");


    }
}

