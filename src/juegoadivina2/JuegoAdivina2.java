
package juegoadivina2;
import java.util.*;
public class JuegoAdivina2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        reglas();
        System.out.println("¿Desea jugar?");
        String deseaJugar = sc.next();
        if(deseaJugar.equals("si")){
          while (deseaJugar.equals("si")) {
            juegos();
            System.out.print("¿Quieres jugar otra vez? si o no: ");
            deseaJugar = sc.next();
          }
        }
        else 
            System.out.print("Tenga un buen dia");
            //jugarOtraVez = respuesta.equals("si");         
    }
    
    public static void reglas(){
    System.out.println("JUEGO DE ADIVINAR EL NUMERO");
        System.out.println("Reglas:");
        System.out.println("1.-Se generara un numero aleatorio entre el 0 y 99");
        System.out.println("2.-Usted tendra 6 oportunidades para adivinarlo");
    
    }
    public static void juegos(){
    System.out.println("Ingrese su numero:");
    Scanner sc=new Scanner(System.in);
    int random=(int) Math.floor(Math.random()*(99-0+1)+0);
    int contador=0;
    for (int i=1;i<=6;i++){
            int numero=sc.nextInt();
            
            if(numero<0 || numero>99)
                System.out.println("El numero debe estar entre 0 y 99. Intenta nuevamente.");
            else if(numero<random)
                System.out.println("Su numero es menor ");
            else if (numero>random)
                System.out.println("Su numero es mayor ");
            contador=contador+1;
            if(numero==random){
                System.out.println("Usted gano");
            break ;
            }  
        }
        System.out.println("Usted hizo "+contador+" intentos");
        System.out.println("El numero generado es "+random); 
    }
}

