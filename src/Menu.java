import java.util.Scanner;

public class Menu implements View{
    double a,b,c;
    
    public void principal(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        a =  s.nextInt();
        System.out.println("Enter b: ");
        b = s.nextInt();
        System.out.println("Enter c: ");
        c = s.nextInt();
        s.close();      
        
        
    }
    
    public void erro(){
        System.out.println("Não há raizes reais");
    }
    
    public void mostrarResultado(double r1, double r2){
        System.out.println("O resultado da raiz1 eh: " + r1);
        System.out.println("O resultado da raiz2 eh: "+ r2);
    }
}
