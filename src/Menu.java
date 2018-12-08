import java.util.Scanner;

public class Menu implements View{
    double a,b,c;
    
    public void principal(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        a =  1; // s.nextInt();
        System.out.println("Enter b: ");
        b = -2 ;//s.nextInt();
        System.out.println("Enter c: ");
        c = -3 ;// s.nextInt();  
        
        
    }
    
    public void erro(){
        System.out.println("Não há raizes reais");
    }
    
    public void mostrarResultado(double r1, double r2){
        System.out.println("O resultado da raiz1 eh: " + r1);
        System.out.println("O resultado da raiz2 eh: "+ r2);
    }
    
    
    public double getA(){
        return this.a;
    }
     public double getB(){
        return this.b;
    }
    
     public double getC(){
        return this.c;
    }
    
}
