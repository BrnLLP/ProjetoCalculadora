public class AreaTrapezio{
    Calculadora calculadora = new Calculadora();
    public double areaTrapezio(double baseMaior, double baseMenor, double altura){
        double area = ((calculadora.soma(baseMaior, baseMenor))*altura)/2;
        return area;
    }

}