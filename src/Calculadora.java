public class Calculadora {
    public void soma(){};
    public double subtracao(double a, double b){
        return a - b;
    };
    public double divisao(double a, double b){
        return a/b;
    };
    public void multiplicacao(){};

    public double exponecial(double a, double b){
        return Math.pow(a, b);
    };
    public double raizQuadrada(double a){
        return Math.sqrt(a);
    };
    public double piso(double a){
        return Math.floor(a);
    };
    public double teto(double a){
        return Math.ceil(a);
    };
}
