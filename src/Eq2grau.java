
public class Eq2grau {
    private double raiz1;
    private double raiz2;
    
    public void resolver(double a, double b, double c){
        double d = b*b - 4 * a * c;
        if(d>=0){
            raiz1 = (-b + Math.sqrt(d)) / (2*a);
            raiz2 = (-b + Math.sqrt(d) / (2*a));
        }else{
            raiz1 = Double.NaN;
            raiz2 = Double.NaN;
        }
    }
    public double getRaiz1(){
        return raiz1;
    }
    public double getRaiz2(){
        return raiz2;
    }
}
