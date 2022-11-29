public class ValorCompra {
    Calculadora calculadora = new Calculadora();
    public double valorCompra(double valor, double quantidade){
        return calculadora.multiplicacao(valor, quantidade);
    }

    
}
