public class Calculadora {
    public void soma(){};
    public void subtracao(){};
    public void divisao(){};
    public void multiplicacao(){};
    
    public double exponecial(double a, double b){
        return Math.pow(a, b);
    };
    public double raizQuadrada(double a, double b){
        return Math.sqrt(a);
    };
    public double piso(double a, double b){
        return Math.floor(a);
    };
    public double teto(double a, double b){
        return Math.ceil(a);
    };
}
