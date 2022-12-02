public class AreaLosango {
    Calculadora calculadora = new Calculadora();
    public double areaLosango(double diagonalMaior, double diagonalMenor){
        return calculadora.divisao(calculadora.multiplicacao(diagonalMaior, diagonalMenor), 2);
    };
}
