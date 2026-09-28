import java.util.Scanner;
package convertidormilles;


public class ConvertidorMilles{
    public static void main(String[] args) {
        final double MILLES_A_METRES = 1852;  //factor conversió constant
        Scanner lector = new Scanner(System.in);
        //llegir distància en milles
        System.out.print("Entra la distància en milles: ");
        double distanciaEnMilles = lector.nextDouble();
        //calcular conversió de milles a metres
        double distanciaenmetres=distanciaEnMilles*MILLES_A_METRES;
        System.out.println("Aixo son"+distancia en metres + 
        "metres)
        
    }
}
