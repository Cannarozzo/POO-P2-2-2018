
public class Controller {
    private View tela;
    
    public Controller(){
        this.tela = new Menu();
    }
    
    public void calcularEq2(){   
       
        tela.principal();
        Eq2grau eq2 = new Eq2grau();
        eq2.resolver(tela.getA(), tela.getB(), tela.getC());
        
        if(eq2.getRaiz1() != Double.NaN || eq2.getRaiz2() != Double.NaN){
            tela.mostrarResultado(eq2.getRaiz1(), eq2.getRaiz2());
        }else{
            tela.erro();
        }        
      
    }
}
