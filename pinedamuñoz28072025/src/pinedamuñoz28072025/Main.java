/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pinedamuñoz28072025;

/**
 *
 * @author UFG
 */
public class Main {
    
    public static String nombres= "Alan Pineda";
    public static String apellidos = "Pineda Munoz";
    public static int anio_nacimiento = 2000;
    public static float estaruta = 1.77f;//estatura en metros
    public static float peso = 165.5f; //peso en libra
    public static char genero = 'M';
    public static String estado_familiar = "dificil_hablar";
    public static double salario_mensual = 400.00;
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double imc = 0.0d; 
        float tasa_kilogramos = 0.453592f; //1 libra equivale a 0.453592
        int dias_laborales = 22; // 22 Dias laborales al mes
        int horas_laborales = 8; //8horas laborales al dias
        
        //CONVERTIR EL PESO DE LIBRAS A KOLIGRAMOS
        float peso_kilogramos = Main.peso * tasa_kilogramos;
        
        //ELEVANDO EL VALOR DE LA ESTATURA A KILOGRAMO
        float estatura_al_cuadrado = Main.estaruta * Main.estaruta;
        
        imc = peso_kilogramos/estatura_al_cuadrado;
        
        
        //CALCULAR EL SALARIO DIARIO
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        //CALCULAR EL SALARIO POR HORA 
        double salario_hora = salario_diario/horas_laborales;
        
        /**************************/
        /******SALIDA DE DATOS*****/
        /**************************/
        
        System.out.println("saludos"+Main.nombres+""+Main.apellidos);
        System.out.println("su peso en libras es: "+Main.peso+",pero en kilogramos es:"+peso_kilogramos);
        System.out.println("su inidce de masa corporal es : +"+imc);
        System.out.println("su salario mensual es:"+Main.salario_mensual);
        System.out.println("su salario diario es:"+salario_diario);
        System.out.println("su salario por hora es :"+salario_hora);
        
        
        
    }
    
    
    
}
